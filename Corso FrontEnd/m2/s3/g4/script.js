
// versione 2.00
function loadImages(query) {
    const token = '1FDeRVRZ2SmOo5SXrVD0rfEEGXOCyT7YRpSR4fldH1iSZrGcguiErk22';
    fetch(`https://api.pexels.com/v1/search?query=${query}`, {
      headers: {
        'Authorization': token 
      }
    })
    .then(response => response.json())
    .then(data => {
        const cards = document.querySelectorAll('.card');
        cards.forEach((card, index) => {
            const imgElement = card.querySelector('.card-img-top');
        const smallElement = card.querySelector('.text-muted');
        if (data.photos[index]) {
            imgElement.src = data.photos[index].src.landscape; 
            smallElement.textContent = data.photos[index].id; 
        }
    });
    })+
  }
  
  document.getElementById('searchButton').addEventListener('click', function() {
      const query = document.getElementById('searchField').value;
      loadImages(query);
    });
    
    document.getElementById('loadImages').addEventListener('click', function() {
        loadImages('[japan]');
    });
    
    document.getElementById('loadSecondaryImages').addEventListener('click', function() {
        loadImages('[italy]');
    });
    
    function hideCard(button){
        let card = button.closest('.card');
        if(card){ card.style.display = 'none';}
    }

    /*    versione 1.0 singola 
        document.getElementById('searchButton').addEventListener('click', function() {
            const query = document.getElementById('searchField').value;
            fetch(`https://api.pexels.com/v1/search?query=${query}`, {
              headers: {
                'Authorization': '1FDeRVRZ2SmOo5SXrVD0rfEEGXOCyT7YRpSR4fldH1iSZrGcguiErk22' 
              }
            })
            .then(response => response.json())
            .then(data => {
              const cards = document.querySelectorAll('.card');
              cards.forEach((card, index) => {
                const imgElement = card.querySelector('.card-img-top');
                const smallElement = card.querySelector('.text-muted');
                if (data.photos[index]) {
                  imgElement.src = data.photos[index].src.landscape; 
                  smallElement.textContent = data.photos[index].id; 
                }
              });
            })
          });
        
        document.getElementById('loadImages').addEventListener('click', function() {
            fetch('https://api.pexels.com/v1/search?query=[japan]', {
              headers: {
                'Authorization': '1FDeRVRZ2SmOo5SXrVD0rfEEGXOCyT7YRpSR4fldH1iSZrGcguiErk22' 
              }
            })
            .then(response => response.json())
            .then(data => {
              let cards = document.querySelectorAll('.card');
              cards.forEach((card, index) => {
                let imgElement = card.querySelector('.card-img-top');
                let smallElement = card.querySelector('.text-muted');
                if (data.photos[index]) {
                  imgElement.src = data.photos[index].src.landscape; 
                  smallElement.textContent = data.photos[index].id;
                }
              });
            })
          });
        
          document.getElementById('loadSecondaryImages').addEventListener('click', function() {
            fetch('https://api.pexels.com/v1/search?query=[italy]', {
              headers: {
                'Authorization': '1FDeRVRZ2SmOo5SXrVD0rfEEGXOCyT7YRpSR4fldH1iSZrGcguiErk22' 
              }
            })
            .then(response => response.json())
            .then(data => {
              let cards = document.querySelectorAll('.card');
              cards.forEach((card, index) => {
                let imgElement = card.querySelector('.card-img-top');
                let smallElement = card.querySelector('.text-muted');
                if (data.photos[index]) {
                  imgElement.src = data.photos[index].src.landscape; 
                  smallElement.textContent = data.photos[index].id; 
                }
              });
            })
          });
        

  */