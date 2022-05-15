const collections = ['BelicV1', 'BelicV2', 'BelicV3', 'BelicV4', 'BelicV5', 'BelicV6'];
const square = document.querySelector('.square');

collections.map(collection => {
    square.innerHTML += `<div class="collection" onclick=(location.href="/html/shopingView.html")> 
          
    </div>`;
})

