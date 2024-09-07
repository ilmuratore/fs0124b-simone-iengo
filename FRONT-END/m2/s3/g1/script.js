// esercizio 1 

class User {
    constructor(firstName, lastName, age, location){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

// funzione di comparazione tra attributi oggetto (eta')

compareAge(otherUser){
    if(this.age > otherUser.age){
        return `${this.firstName} e piu vecchio di ${otherUser.firstName}`;
    } else if (this.age < otherUser.age){
        return `${this.firstName} e piu giovane di ${otherUser.firstName}`;
    } else {
        return `${this.firstName} e ${otherUser.firstName} hanno la stessa eta`;
    }
    };
}

let user1 = new User('Simone', 'Iengo', 28, 'Napoli')
let user2 = new User('Giuseppe', 'Rea', 25, 'Napoli')
let user3 = new User('Susanna', 'Romano', 28, 'Napoli')

console.log(user1.compareAge(user2));
console.log(user2.compareAge(user1));
console.log(user1.compareAge(user3));


// esercizio 2 
document.addEventListener('DOMContentLoaded', (event) =>{ //ho inserito l'evento in quanto non capisco il perche' js non legge i dati inseriti nel form se prima la pagina non viene caricata completamente... forse e' perche' c'e' una funzione scritta prima, non lo so ma almeno cosi funziona e niente speriamo bene.

    class Pet {
        constructor(petName, ownerName, species, breed){
            this.petName = petName;
            this.ownerName = ownerName;
            this.species = species;
            this.breed = breed;
        }
        hasSameOwner(otherPet){
            return this.ownerName === otherPet.ownerName;
        }
    }
    
    let pets =[];

    document.getElementById('petForm').addEventListener('submit', function(event){
        event.preventDefault();
        
        let petName = document.getElementById('petName').value;
        let ownerName = document.getElementById('ownerName').value;
        let species = document.getElementById('species').value;
        let breed = document.getElementById('breed').value;
        let pet = new Pet(petName, ownerName, species, breed);
        
        pets.push(pet);
        
        let petList = document.getElementById('petList');
        petList.innerHtml = '';
        for(let pet of pets){
            let li = document.createElement('li');
            li.textContent = `Nome:${pet.petName}, Padrone:${pet.ownerName}, Specie:${pet.species}, Razza:${pet.breed}`;
            petList.appendChild(li);
        }
    });
});
