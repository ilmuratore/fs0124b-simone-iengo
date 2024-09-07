
const token = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWVhZTg1MTJkN2IxMTAwMTkwZTZmNTEiLCJpYXQiOjE3MDk4OTM3MTQsImV4cCI6MTcxMTEwMzMxNH0.yel555HOmjcicgwGQUhon_Vq7V4r6GC-8o1YaLci6uo';

// ottieni i prodotti
fetch("https://striveschool-api.herokuapp.com/api/product/", {
  headers: {
    "Authorization": `Bearer ${token}`
  }
})
.then(response => response.json())
.then(data => {
  const productsDiv = document.getElementById('products');
  data.forEach(product => {
    const productDiv = document.createElement('div');
    productDiv.innerHTML = `
      <h2>${product.name}</h2>
      <p>${product.description}</p>
      <img src="${product.imageUrl}" alt="${product.name}">
      <p>${product.price}</p>
    `;
    productsDiv.appendChild(productDiv);
  });
})
.catch(err => console.error(err));

// gestisci il form di creazione del prodotto
document.getElementById('product-form').addEventListener('submit', function(event) {
  event.preventDefault();

  const newProduct = {
    "name": document.getElementById('name').value,
    "description": document.getElementById('description').value,
    "brand": document.getElementById('brand').value,
    "imageUrl": document.getElementById('imageUrl').value,
    "price": document.getElementById('price').value
  };

  
  fetch("https://striveschool-api.herokuapp.com/api/product/", {
    method: "POST",
    body: JSON.stringify(newProduct),
    headers: {
      "Content-Type": "application/json",
      "Authorization": `Bearer ${token}`
    }
  })
  .then(response => response.json())
  .then(data => {
    console.log(data);
    // qui potresti voler aggiornare la tua interfaccia utente...
  })
  .catch(err => console.error(err));
});

// gestisci il form di modifica del prodotto
document.getElementById('product-form').addEventListener('submit', function(event) {
    event.preventDefault();
  
    const updatedProduct = {
      "name": document.getElementById('name').value,
      "description": document.getElementById('description').value,
      "brand": document.getElementById('brand').value,
      "imageUrl": document.getElementById('imageUrl').value,
      "price": document.getElementById('price').value
    };
  
    const productId = "product_id_here"; // sostituisci con l'ID del prodotto
  
    fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}`, {
      method: "PUT",
      body: JSON.stringify(updatedProduct),
      headers: {
        "Content-Type": "application/json",
        "Authorization": `Bearer ${token}`
      }
    })
    .then(response => response.json())
    .then(data => {
      console.log(data);
      // qui potresti voler aggiornare la tua interfaccia utente...
    })
    .catch(err => console.error(err));
  });
  
  // gestisci la cancellazione del prodotto
  document.getElementById('delete-button').addEventListener('click', function() {
    const productId = "product_id_here"; // sostituisci con l'ID del prodotto
  
    fetch(`https://striveschool-api.herokuapp.com/api/product/${productId}`, {
      method: "DELETE",
      headers: {
        "Authorization": `Bearer ${token}`
      }
    })
    .then(response => {
      if (response.ok) {
        console.log('Product deleted');
        // qui potresti voler aggiornare la tua interfaccia utente...
      } else {
        console.error('Error:', response.status);
      }
    })
    .catch(err => console.error(err));
  });