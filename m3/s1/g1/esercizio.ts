interface PrepaidMobileContract {
    credito: number;
    numeroChiamate: number;
}

class User implements PrepaidMobileContract { 
    nome: string; 
    cognome: string; 
    credito: number; 
    numeroChiamate: number;

        constructor(nome: string, cognome: string) {
            this.nome = nome;
            this.cognome = cognome;
            this.credito = 0;
            this.numeroChiamate = 0;
            }

        ricarica(ammontare: number) {
            this.credito += ammontare;
            }

        chiamata(minuti: number) {
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

const users: User[] = [
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
