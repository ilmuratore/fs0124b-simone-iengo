/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/
/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/
/* Javascript e' un linguaggio di programmazione. Permette di far interagire i dati in diversi modi e in diverse forme. 
Il linguaggio prevede diverse tipologie di inserimento dei dati chiamati datatype. L'uitlizzo dei diversi datatype permette la creazione di strutture logiche che e' possibile eseguire nel browser avendo un determinato output.
I datatype nello specifico sono (scritti come segue)
*/
let stringa = "Parola" //valore di tipo alfanumerico
let numero = 5; //valore esclusivamente numerico
let booleano = true;//(false) // valore che si traduce in una logica booleana, quindi il risultato sara' sempre true o false (vero o falso)

/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

let myName ='Simone'; 

/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/
 console.log(12 +20);

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/
 let x = 12; 

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

// dimostrazione dell'impossibilita' di riassegnare valore ad una variabile costante */

/*
let idVar = 'Pippo' // inizio con l'inserimento di una variabile con let dandogli un valore alfanumerico
console.log(idVar) // con la funzione di console.log verifico la sua corretta compilazione nel browser con il valore assegnato in radice
idVar = 'Mouse' // ora applico una riassegnazione della variabile 
console.log(idVar) // dando di nuovo console.log vedro' la modifica del valore assegnato a quella variabile 
const idConst = 'Paolo' // con la keyword const, io applico una variabile constante, cioe' che la sua funzione resta immutata ed e' settata per essere tale .
console.log(idConst) // e' verificabile con la console la sua 
//se provo a riassegnare la variabile 
idConst = 'Giuffrida'
console.log(idConst) // il risultato sara' un errore in quanto ho provato a modificare la constante di una variabile "Assignment to constant variable."



/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let sottrazione = ( 4 - x)
console.log(sottrazione)

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let name1 = 'john'
let name2 = 'John'
console.log('name1 e name2 sono uguali:', name1 == name2)

console.log('name1 e name2 sono uguali in lowecase',
name1.toLowerCase() == name2.toLowerCase()
)