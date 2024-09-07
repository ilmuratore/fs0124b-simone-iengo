// script di login js 

   // Aggiungi un utente predefinito
   const defaultUser = 'admin';
   const defaultPassword = 'admin';
   localStorage.setItem(defaultUser, defaultPassword);

   document.getElementById('loginForm').onsubmit = function(e) {
       e.preventDefault();

       let userid = document.getElementById('userid').value;
       let pwd = document.getElementById('pwd').value;
       if (localStorage.getItem(userid) === pwd) {
           alert('Accesso effettuato con successo!');
           window.location.href = '../components/back-office.html';
       } else {
           alert('ID utente o password non validi. Riprova.');
       }
   }