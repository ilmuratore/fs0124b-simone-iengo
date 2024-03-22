import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage-hero',
  templateUrl: './homepage-hero.component.html',
  styleUrls: ['./homepage-hero.component.css']
})
export class HomepageHeroComponent {

  constructor(private router: Router) { }

  navigateToBrand(brandName: string) {
    console.log(`Navigating to ${brandName}`);
    this.router.navigate([`/${brandName}`]);
  }

}
