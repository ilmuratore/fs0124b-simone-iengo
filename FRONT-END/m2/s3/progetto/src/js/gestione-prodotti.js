
let token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZTg1MTJkN2IxMTAwMTkwZTZmNTEiLCJpYXQiOjE3MDk4OTM3MTQsImV4cCI6MTcxMTEwMzMxNH0.yel555HOmjcicgwGQUhon_Vq7V4r6GC-8o1YaLci6uo';

const crud = {
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
        let prodotti = JSON.parse(localStorage.getItem('prodotti')) || [];
        prodotti.push(new Prodotto(data.name, data.description, data.brand, data.imageUrl, data.price));
        localStorage.setItem('prodotti', JSON.stringify(prodotti));
      });
    },
  };
  
  // Classe Prodotto
  class Prodotto {
    constructor(nome, descrizione, brand, imageUrl, prezzo) {
      this.name = nome;
      this.description = descrizione;
      this.brand = brand;
      this.imageUrl = imageUrl;
      this.price = prezzo;
    }
  }
  
  // invio dei dati prodotto in localstorage. 
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
      .then(() => {
        // Aggiungi il nuovo prodotto a localStorage
        let prodotti = JSON.parse(localStorage.getItem('prodotti')) || [];
        prodotti.push(nuovoProdotto);
        localStorage.setItem('prodotti', JSON.stringify(prodotti));
      });
  });