const id = localStorage.getItem('id');
const imagen = document.querySelector('.imagen');
const infoo = document.querySelector('.infoo');


fetch('http://localhost:8080/clothes')
  .then(response => response.json())
  .then(data => {
        data.map(clothes => {
            console.log(clothes)
            if (clothes.id == id) {
                imagen.src = clothes.descripton;
                infoo.innerHTML = `<span>${clothes.nombre}</span>
                <span>${clothes.price}$</span>
                `
            }     
        })
    }).catch(error => {
            console.log(error)
        });