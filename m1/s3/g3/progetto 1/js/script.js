// foglio script progetto to do list web app 



const inputBox = document.getElementById("input-box");
const listContainer = document.getElementById("list-container");
// logica di aggiunta elementi nella lista li dei promemoria //
function addTask(){
    if(inputBox.value === ''){
        alert("Davvero non hai nulla da fare?")
    }
    else{
        let li = document.createElement("li");
        li.innerHTML = inputBox.value;
        listContainer.appendChild(li);
        let span = document.createElement("span");
        span.innerHTML = "\u00d7";
        li.appendChild(span);
    }
    inputBox.value = "";
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