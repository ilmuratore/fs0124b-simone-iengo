"use strict";
class User {
    nome;
    cognome;
    credito;
    numeroChiamate;
    constructor(nome, cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.credito = 0;
        this.numeroChiamate = 0;
    }
    ricarica(ammontare) {
        this.credito += ammontare;
    }
    chiamata(minuti) {
        this.numeroChiamate += minuti;
        this.credito -= minuti;
    }
    chiama404() {
        return this.credito;
    }
    getNumeroChiamata() {
        return this.numeroChiamate;
    }
    azzeraChiamate() {
        this.numeroChiamate = 0;
    }
}
const users = [
    new User("Simone", "Iengo"),
    new User("Giuseppe", "Rea"),
    new User("Giovanni", "Russo"),
    new User("Michele", "Molteni"),
];
users.forEach(user => {
    console.log(`User: ${user.nome} ${user.cognome}`);
    console.log(`Remaining Balance: ${user.credito}`);
    console.log(`Number of Calls: ${user.numeroChiamate}`);
    console.log("------------------------");
});
//# sourceMappingURL=esercizio.js.map