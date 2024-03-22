import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage-hero',
  templateUrl: './homepage-hero.component.html',
  styleUrls: ['./homepage-hero.component.css']
})
export class HomepageHeroComponent {

  carComponents = ['fiatbrand', 'fordbrand', 'audibrand' ]

  constructor(private router: Router) { }

  navigateToRandomCar(){
    const randomIndex = Math.floor(Math.random() * this.carComponents.length);
    const randomCarComponent = this.carComponents[randomIndex];
    this.router.navigate([randomCarComponent]);
  }

}
