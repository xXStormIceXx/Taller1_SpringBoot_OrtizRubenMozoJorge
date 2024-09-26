fetch('http://localhost:8080/api/productos')
            .then(response => response.json())
            .then(data => {
                let table = document.getElementById("productosTable");
                data.forEach(producto => {
                    let row = table.insertRow();
                    row.insertCell(0).innerText = producto.id_producto;
                    row.insertCell(1).innerText = producto.nombre_producto;
                    row.insertCell(2).innerText = producto.precio;
                    row.insertCell(3).innerText = producto.stock;
                });
            });