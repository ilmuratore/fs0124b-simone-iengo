// foglio script progetto to do list web app 



const inputBox = document.getElementById("input-box");
const listContainer = document.getElementById("list-container");
// logica di aggiunta elementi nella lista li dei promemoria //
function addTask(){
    if(inputBox.value === ''){
        alert("Davvero non hai nulla da fare?") // alert ok 
    }
    else{
        let li = document.createElement("li"); //creazione elemento li in html ok 
        li.innerHTML = inputBox.value; 
        listContainer.appendChild(li); // inserimento in ul ok 
        let span = document.createElement("span"); // inserimento span ok 
        span.innerHTML = "\u00d7"; // x come "elemento grafico " ok
        li.appendChild(span); // pure questo funziona
    }
    inputBox.value = ""; // corretto 
}

//logica di modifica degli elementi nella lista 

listContainer.addEventListener('click', function(e){
    if(e.target.tagName === 'LI'){
        e.target.classList.add("checked");
    }
    else if(e.target.tagName === 'SPAN'){
        e.target.parentElement.remove();
    }
}, false)
// non funziona cercare soluzione... forse cambiare il tutto con un ciclo for o forEach piuttosto che una funzione semplice. 
// funziona da quando ho inserito  li e span in maiuscolo perche' ? da esaminare.... 