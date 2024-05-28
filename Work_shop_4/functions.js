async function callMessage() {
    try {
        //The number of the port '8000' was added for the server can run in the local device
        const response = await fetch('http://localhost:8000/hello_ud'); 
        const data = await response.text();
        document.getElementById('result').textContent = data;
    } catch (error) {
        console.error('Error:', error);
    }
}
//The number of the method was changed for it correspond to the name in the html file
async function callTable() {
    try {
        //The number of the port '8000' was added for the server can run in the local device
        //The path was changed from ../data to ../get_products to call the correspond service
        const response = await fetch('http://localhost:8000/get_products'); 
        const data = await response.json();
        
        let table = '<table>';
        table += '<tr><th>ID</th><th>Name</th><th>Description</th></tr>';
        
        data.forEach(item => {
            table += `<tr><td>${item.id}</td><td>${item.name}</td><td>${item.description}</td></tr>`;
        });
        
        table += '</table>';
        
        document.getElementById('result').innerHTML = table;
    } catch (error) {
        console.error('Error:', error);
    }
}