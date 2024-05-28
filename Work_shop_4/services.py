import uvicorn
from sqlalchemy import create_engine, MetaData, Table, Column, Integer, String
from sqlalchemy.orm import sessionmaker
from fastapi import FastAPI
# This import allows that request to API wasn´t rejected
from fastapi.middleware.cors import CORSMiddleware

app = FastAPI() 
#This was added to allows access to the API from any domain
origins = ["*"]
#These lines of codes allows that the middleware was added
app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.get("/hello_ud")
def hello_ud():
    return "Welcome to UD!"

engine = create_engine('postgresql://postgres:postgres@localhost:5432/public')
Session = sessionmaker(bind=engine)
session = Session()

metadata = MetaData()
products = Table('products', metadata,
                 Column('id', Integer, primary_key=True),
                 Column('name', String),
                 Column('description', String))
#'app = FastAPI()' was deleted because it was repeat on the code

#Name of the services was changed to avoid confussions with the name of the table 'products'
@app.get("/get_products")
def get_products():
    query = products.select()
    result = session.execute(query)
    product_list = result.fetchall()  # Variable´s name was changed to avoid redundancies in the name of the tables
    #The method's return should be a JSON value for JavaScript can proccessed it easier
    return [{"id": row.id, "name": row.name, "description": row.description} for row in product_list]

@app.post("/create_products") # Web services cannot be named the same because this could be an error
def create_product(name: str, description: str):
    query = products.insert().values(name=name, description=description)
    session.execute(query)
    session.commit()
    return {"message": "Product created successfully"}

if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)