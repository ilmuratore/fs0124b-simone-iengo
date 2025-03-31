
// tooggle button to show hero with video 
// version 2.0

let firstButton = document.getElementById('toggleButton1');
let secondButton = document.getElementById('toggleButton2');
let heroDiv = document.getElementsByClassName('hero')[0];

firstButton.addEventListener('click', function(){
    heroDiv.style.display = 'none';
});

secondButton.addEventListener('click', function(){
    heroDiv.style.display = 'block';
})


// version 1.0
// document.getElementById('toggleButton').addEventListener('click', function() {
//    let heroDiv = document.getElementsByClassName('hero')[0];
//    if (heroDiv.style.display === 'none') {
//        heroDiv.style.display = 'block';
//    } else {
//        heroDiv.style.display = 'none';
//    }
//});

// implementazione di un video player funziona solo sull'elemento hero

function openPage(){
    window.open('../components/netflix-player.html', '_blank');
}
