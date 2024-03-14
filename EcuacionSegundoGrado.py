from abc import abstractmethod

class Engine:
    """This class is part of the vehicle components"""
    def __init__(self, name, typeE, potency, weight):
        self.name = name
        self.typeE = typeE
        self.potency = potency
        self.weight = weight

class Vehicle:
    """This class is the principal component of the programm"""
    def __init__(self, typeV: int, chasis: str, model: str, year: int, comp_gas: float, engine: Engine):

        if not chasis in ["A", "B"]:
            raise ValueError("This chassis is not valid.")
        self.typeV = typeV
        self.chasis = chasis
        self.model = model
        self.year = year
        self.comp_gas = None
        self.engine = engine
    def gas_consumption(self):
       """This method calculate the gas compsumption of each vehicle"""
       if self.chasis == 'A':
        consumption_gas = (1.1 * self.Engine.potency) + (0.2 * self.Engine.weight) - 0.3
        self.comp_gas = consumption_gas
       if self.chasis == 'B':
        consumption_gas = (1.1 * self.Engine.potency) + (0.2 * self.Engine.weight) - 0.3
       self.comp_gas = consumption_gas

class Car(Vehicle):
    """This class is a type of vehicle"""
    def __init__(self, Engine, Chasis, Model, CompGas, Year):
        super().__init__(Engine, Chasis, Model, CompGas, Year)

class Truck(Vehicle):
    """This class is a type of vehicle"""
    def __init__(self, Engine, Chasis, Model, CompGas, Year):
        super().__init__(Engine, Chasis, Model, CompGas, Year)

class Yacht(Vehicle):
    """This class is a type of vehicle"""
    def __init__(self, Engine, Chasis, Model, CompGas, Year):
        super().__init__(Engine, Chasis, Model, CompGas, Year)

class Motorcycle(Vehicle):
    """This class is a type of vehicle"""
    def __init__(self, Engine, Chasis, Model, CompGas, Year):
        super().__init__(Engine, Chasis, Model, CompGas, Year)
        

def get_typeV(self) -> int:
     """This method is used to get the type of the vehicle"""
     return self.__typeV

def get_chasis(self) -> str:
        """
        This method is used to get the chasis of the vehicle
        """
        return self.__chassis
def get_model(self) -> str:
        """
        This method is used to get the model of the vehicle
        """
        return self.__model

def get_year(self) -> int:
        """
        This method is used to get the year of the vehicle
        """
        return self.__year

def get_comp_gas(self) -> float:
        """
        This method is used to get the gas consumption of the vehicle
        """
        return self.__comp_gas

def get_engine(self) -> Engine:
        """
        This method is used to get the engine of the vehicle
        """
        return self.__engine

def main():
    global engines 
    engines = {}
    global vehicles 
    vehicles = []

   
    while True:
         print("Choose an option:" + "\n 1.Create an engine" + "\n 2. Create a vehicle." 
          + "\n 3. Show engines." + "\n 4. Show vehicles" + "\n 5. Exit")
         option = int(input())
         if option == 1:
            name = input("Write a name for the engine: ")
            typeE = input("Write the type of engine: ")
            potency = int(input("Write the potency in a integer value for the potency: "))
            weight = float(input("Write the weight in a float value for the weight: "))
            new_Engine = Engine(typeE, potency, weight)
            engines[name] = new_Engine
         elif option == 2:
            print("Choose an option: " + "\n 1.Create a car" + "\n 2. Create a truck"
                   + "\n 3. Create a yacht" + "\n 4. Create a motorcycle")
            typeV = int(input())
            Engine = input("Write the name of the engine for the vehicle:")
            model = input("Write the model for the vehicle")
            year = int(input("Write the year of the vehicle"))
            chasis = input("Write the chasis of the vehicle: ")
            if typeV == 1:
                vehicles.append( Car(chasis, model, year, Engine))
            elif typeV == 2:
                vehicles.append( Truck(chasis, model, year, Engine))
            elif typeV == 3:
                vehicles.append( Yacht(chasis, model, year, Engine))
            elif typeV == 4:
                   vehicles.append( Motorcycle(chasis, model, year, Engine))
            else:
                   print("Write a correct option.")
            
         elif option == 3:
            print(engines)

         elif option == 4:
            print(vehicles)
         if option == 5:
              break

        
         
    

if __name__ == "__main__":
  main()



             
    
    
 