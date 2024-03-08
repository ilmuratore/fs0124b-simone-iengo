// metodo crud in oggetto per poter gestire il tutto con una semplice chiamata da js XD 

const token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZTg1MTJkN2IxMTAwMTkwZTZmNTEiLCJpYXQiOjE3MDk4OTM3MTQsImV4cCI6MTcxMTEwMzMxNH0.yel555HOmjcicgwGQUhon_Vq7V4r6GC-8o1YaLci6uo';

const crud = {
  read: function() {
    return fetch('https://striveschool-api.herokuapp.com/api/product/', {
      headers: {
        'Authorization': `Bearer ${token}`
      }
    })
    .then(response => response.json());
  },

create: function(nuovoProdotto) {
    return fetch('https://striveschool-api.herokuapp.com/api/product/', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        'Authorization': `Bearer ${token}`
      },
      body: JSON.stringify(nuovoProdotto),
    })
    .then(response => response.json())
    .then(data => {
      prodotti.push(new Prodotto(data.name, data.description, data.brand, data.imageUrl, data.price));
      localStorage.setItem('prodotti', JSON.stringify(prodotti));
    })
},

  update: function(idProdotto, prodottoModificato) {
    return fetch(`https://striveschool-api.herokuapp.com/api/product/${idProdotto}`, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
        'Authorization': `Bearer ${token}`
      },
      body: JSON.stringify(prodottoModificato),
    })
    .then(response => response.json());
  },

  delete: function(idProdotto) {
    return fetch(`https://striveschool-api.herokuapp.com/api/product/${idProdotto}`, {
      method: 'DELETE',
      headers: {
        'Authorization': `Bearer ${token}`
      },
    })
    .then(response => response.json());
  }
};

/* creazione prodotti e card */ 

class Prodotto {
  constructor(nome, descrizione, brand, imageUrl, prezzo) {
    this.name = nome;
    this.description = descrizione;
    this.brand = brand;
    this.imageUrl = imageUrl;
    this.price = prezzo;
  };
  creaCard(){
    let col = document.createElement('div');
    col.className = 'col-12 col-sm-6 col-lg-3 col-xl-2 mb-4';
    let card = document.createElement('div');
    card.className = 'card';
    let img = document.createElement('img');
    img.className = 'card-img-top';
    img.src = this.imageUrl;
    img.alt = this.name;
    let body = document.createElement('div');
    body.className = 'card-body';
    let title = document.createElement('h5');
    title.className = 'card-title';
    title.textContent = this.name;
    let text = document.createElement('p');
    text.className = 'card-text';
    text.textContent = this.description;
    let button = document.createElement('a');
    button.className = 'btn btn-primary';
    button.href = '#';
    button.textContent = 'Vai al prodotto';
    body.appendChild(title);
    body.appendChild(text);
    body.appendChild(button);
    card.appendChild(img);
    card.appendChild(body);
    col.appendChild(card);
    return col;
  }
}
/* array prodotti che si aggiorano tramite local storage */ 
let prodotti = []

if (!localStorage.getItem('prodotti')) {
  let prodottiDefault = [
  new Prodotto("Nokia 3310", "Descrizione prodotto 1", "Nokia", "https://via.placeholder.com/150", 99),
  new Prodotto("Samsung Galaxy", "Descrizione prodotto 2", "Samsung", "https://via.placeholder.com/150", 199),
  new Prodotto("iPhone 13", "Descrizione prodotto 3", "Apple", "https://via.placeholder.com/150", 999),
  new Prodotto("Huawei P30", "Descrizione prodotto 4", "Huawei", "https://via.placeholder.com/150", 299),
  new Prodotto("Xiaomi Mi 11", "Descrizione prodotto 5", "Xiaomi", "https://via.placeholder.com/150", 399),
  new Prodotto("OnePlus 9", "Descrizione prodotto 6", "OnePlus", "https://via.placeholder.com/150", 499),
  new Prodotto("Google Pixel 6", "Descrizione prodotto 7", "Google", "https://via.placeholder.com/150", 599),
  new Prodotto("Sony Xperia 1 III", "Descrizione prodotto 8", "Sony", "https://via.placeholder.com/150", 699),
  new Prodotto("Motorola Edge 20", "Descrizione prodotto 9", "Motorola", "https://via.placeholder.com/150", 799)
];
localStorage.setItem('prodotti', JSON.stringify(prodottiDefault));
}

/* creazione prodotti nella home page default*/ 
prodotti = prodotti.map(prodotto => new Prodotto(prodotto.name,prodotto.description,prodotto.brand, prodotto.imageUrl, prodotto.price));
let contenitore = document.querySelector('.container .row');
prodotti.forEach(prodotto => {
  contenitore.appendChild(prodotto.creaCard());
});

/* applicazione metodo POST per inserire nuovi prodotti dal back-office */ 

window.onload = function() {
  let prodotti = JSON.parse(localStorage.getItem('prodotti')) || [];
  let grigliaProdotti = document.getElementById('grigliaProdotti');

  prodotti.forEach(prodotto => {
    let card = new Prodotto(prodotto.name, prodotto.description, prodotto.brand, prodotto.imageUrl, prodotto.price).creaCard();
    grigliaProdotti.appendChild(card);
  });
};

/* inserimento di un nuovo prodotto utilizzando il pannello amministratore 
document.getElementById('prodottoForm').addEventListener('submit', function(event) {
  event.preventDefault();

  let nuovoProdotto = new Prodotto(
    document.getElementById('nome').value,
    document.getElementById('descrizione').value,
    document.getElementById('brand').value,
    document.getElementById('imageUrl').value,
    document.getElementById('prezzo').value
  );

  crud.create(nuovoProdotto)
    .then(data => {
      console.log(data);
      // Qui puoi aggiungere il codice per aggiornare la pagina con il nuovo prodotto
    });
}); */