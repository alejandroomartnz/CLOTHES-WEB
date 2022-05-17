
const square = document.querySelector('.square');


fetch('http://localhost:8080/clothes')
  .then(response => response.json())
  .then(data => {
      let drops = [data[0].nombre];
      console.log(data)
        data.map(clothes => {
            if (!drops.includes(clothes.nombre)) {
                square.innerHTML += `<a class = "drop" href="/html/shopingView.html"><div id="${clothes.id}" class="collection" style="background-image: url(${clothes.descripton});")> 
                
                </div></a>`;
                drops.push(clothes.nombre);
            }

        })

    }).then(() => {
        const collection = document.querySelectorAll('.collection');
        collection.forEach(item => {
            item.addEventListener('click', (e) => {
                e.preventDefault();
                const id = e.target.id;
                localStorage.setItem('id', id);
                window.location.href = '/html/shopingView.html';
            })
        })

 
        }).catch(error => {
            console.log(error)
        });

 
