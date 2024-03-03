
function validateForm(){
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;
    let loginButton = document.getElementById('loginButton');
    let emailRegex = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    let passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,16}$/;
    let formValid = true;

    if(!emailRegex.test(email)){
        alert('Per favore inserisci un indirizzo email valido');
        formValid = false;
    }
    if(!passwordRegex.test(password)){
        alert('La password deve contenere almeno 8 caratteri e massimo 16, almeno una lettera maiuscola, almeno una lettera minuscola, almeno 1 numero, almeno 1 carattere speciale.');
        formValid = false;
    }
    return formValid;
};
