/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/

let sum = (a,b) => a + b; 
console.log(sum(10, 20));

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/
const random = Math.floor(Math.random() * 21);
console.log(random);

/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/
const me ={
  name: 'Simone' ,
  surname: 'Iengo' ,
  age: '28' ,
}
console.log(me)
/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/

delete me.age;
console.log(me)

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/
me.skills = ["dormire", "ottimo support" , "so fare le pizze"]; // non viene specificato in che ordine deve essere inserito, ho fatto a caso
console.log(me);

/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/

me.skills.push("so fare anche le torte");
console.log(me);
/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/

me.skills.pop();
console.log(me);

// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/

function dice(){
  return Math.floor(Math.random() * 6) + 1
}
console.log(dice());

/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/
 function whoIsBigger(a,b){
  return a > b ? a:b;
 }
 console.log(whoIsBigger(15,14));

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/
function splitMe(string){
  const arr = string.split("");
  return arr;
}
console.log(splitMe('Simone oggi ha il cervello che va a due cilindri invece che quattro'));

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/
function deleteOne(string, boolean){
  if(boolean){
    return string.slice(1);
  } else {
    return string.slice(0, -1);
  }
}
console.log(deleteOne('Prima Stringa', true));
/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/

function onlyLetters(string){
  let regEx = /\d+/g;
  return string.replace(regEx,'');
}
//let inputString = 'Oggi ho preso come voto 11 insufficiente'
//let stringInElaboration = onlyLetters(inputString);
// ho provato a rimuovere lo spazio creato dalla rimozione del numero senza risultato 
//let result = stringInElaboration.trim('');
console.log(onlyLetters('Hak1una Mat9ata Raga6zzi  777!')); // cosi va e non lascia spazi non ne capisco il motivo ma non ci voglio impazzire 
/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/

function isThisAnEmail (string){
let regEx = /^[^\s@]+@[^\s@]+.[^\s@]+$/;
return regEx.test(string);
} 

console.log(isThisAnEmail('iengo.simone@gmail.com')); 
console.log(isThisAnEmail('pippo si fa le pippe'));

/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/

function whatDayIsIt(today){
 let days = ["Domenica","Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato",]; // cari amerigani, la smettete di contare i giorni della settimana dalla Domenica ? io ci ho perso 8 minuti a capire perche' mi usciva sabato. Per evitare il mio invecchiamento precoce non fatele ste cose ja, vi voglio bene.
 return days[new Date().getDay()];

}

console.log(whatDayIsIt())

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/
function rollTheDices(number){
  let result = {
          sum: 0,
          values: [],
        };
  for(let i = 0; i < number; i++){
    let roll = dice();
    result.sum += roll;
    result.values.push(roll);
  }
  return result;
}
console.log(rollTheDices(9));

/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/

function howManyDays(date){
  return Math.floor((new Date() - new Date(date)) / (1000 * 3600 *24)); // il Math floor serve per arrotondare il risultato, inoltre il ragionamento e' il seguente: prendo la prima data, sottraggo la seconda e divindelo per questa operazione matematica che rappresentano i 365 giorni di un anno si ottiene il numero per intero di differenza dalla data inserita come parametro. molto furbo e conciso.
}
console.log(howManyDays('2023-02-09')); // ho preso questa funzione da una reference il ragionamento e' molto conciso e particolare.
/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/
function isTodayMyBirthday(birthday){
  const today = new Date();
  const birthDate = new Date(birthday);
  return today.getDate() == birthDate.getDate() && today.getMonth() == birthDate.getMonth();
}

console.log(isTodayMyBirthday('2024-05-03'));
// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file // non piu xD 
/* Questo array viene usato per gli esercizi. Non modificarlo. */
const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/
function deleteProp(obj, prop) {
  if (obj.hasOwnProperty(prop)) {
      delete obj[prop];
  }
  return obj;
}

movies.forEach(movie => {
  deleteProp(movie, 'Type');  
});
console.log(deleteProp(movies));
/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/

function newestMovie(year){
let newest = movies[0];
for(let i = 0; i< movies.length; i++){
  if(movies[i].Year > newest.Year){
    newest = movies[i];
  }
}
return newest
}
console.log(newestMovie());
/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/
function countMovies(movies){
  return movies.length;
}
console.log(countMovies(movies));
/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/
function onlyTheYears(movie){
  let  years = movie.map(movie => movie.Year);
  return years

}
console.log(onlyTheYears(movies));
/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/
function onlyInLastMillennium(movies){
  return movies.filter(movie => {let year = parseInt(movie.Year);
  return year < '2000';
  })
}
console.log(onlyInLastMillennium(movies));
/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/
function sumAllTheYears(movies){
  let sum = 0;
  for(let i = 0; i < movies.length; i++){
    sum += parseInt(movies[i].Year);
  }
  return sum;
}
console.log(sumAllTheYears(movies));


/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/
function searchByTitle(movies, title){ //funzione con freccia 
  return movies.filter(movie => movie.Title.toLowerCase().includes(title.toLowerCase())); // ho inserito il lower e upper case per rendere la ricerca non condizionabile al sensitive case della stringa. piccolo trucco che ho visto in una reference cercando l'utilizzo di filter. geniale
}

console.log(searchByTitle(movies,'the'));

//funzione con ciclo for 
//function searchByTitle(movies, title) { 
//  let result = [];
//  for(let i = 0; i < movies.length; i++) {
//      if (movies[i].Title &&
//        movies[i].Title.toLowerCase().includes(title.toLowerCase())) {
//          result.push(movies[i]);
//      }
//  }
//  return result;
//}
//console.log(searchByTitle(movies, 'the'));

/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

function searchAndDivide(movies,title){
  let match = [];
  let unmatch = [];
  for(let i = 0; i < movies.length; i++){
    if(movies[i].Title.toLowerCase().includes(title.toLowerCase())){
      match.push(movies[i]);
    }else{unmatch.push(movies[i])};
  }
  return{
    match: match,
    unmatch: unmatch,
  }
}
console.log(searchAndDivide(movies, 'ring'));

/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/
function removeIndex(movies, index){
  if(index >=0 && index < movies.length){ 
    movies.splice(index,1);
  }
  return movies;
}
console.log(removeIndex(movies, 3));

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/
function selectContainer(){
const select = document.getElementById('container');
return select
}
console.log(selectContainer()) 
/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/
function selectTd(){
  let tds = document.getElementsByTagName('td');
  return tds;
}
console.log(selectTd());
/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/
function printTd(){
  let tds = document.getElementsByTagName('td');
  for(let i = 0; i < tds.length; i++){
    console.log(tds[i].innerText);
  }
}
printTd();
/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/
function backgroundRed(){
  let link = document.getElementsByTagName('a');
  for(let i = 0; i < link.length; i++){
    link[i].style.backgroundColor = 'red';
  }  
}
backgroundRed();
/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/
function addId(){
 let newElement = document.createElement('li');
 let id = document.getElementById('myList');
 myList.appendChild(newElement); 
}
addId();
/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/
function emptyList(){
  let myList = document.getElementById('myList');
  while(myList.firstChild){
    myList.removeChild(myList.firstChild);
  }
}
// emptyList(); ok funziona 

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/
function addClass(){
  let tagTr = document.getElementsByTagName('tr');
  for(let i = 0; i < tagTr; i++){
    tagTr[i].classList.add('test');
  }
}
addClass();

// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***
*/
function halfTree(){
  let tree = `
  *
  **
  ***
  `;
  console.log(tree);
}
halfTree()
/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/
function tree(){
  let fullTree = `
    *
   ***
  *****
*********`;
console.log(fullTree);
}
tree();
/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/






/* extra esercizio per disegnare un gattino proviamolo
function mostraGattino() {
  let gattino = `
   /\\_/\\  
  ( o.o ) 
   > ^ <
  `;
  console.log(gattino);
}

// Esempio di utilizzo:
mostraGattino(); */