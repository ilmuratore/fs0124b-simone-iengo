

const inputBox = document.getElementById("input-box");
const listContainer = document.getElementById("list-container");

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
;}

listContainer.addEventListener('click', function(e){
    if(e.target.tagName === 'LI'){
        e.target.classList.add("checked");
    }
    else if(e.target.tagName === 'SPAN'){
        e.target.parentElement.remove();
    }
}, false);

 