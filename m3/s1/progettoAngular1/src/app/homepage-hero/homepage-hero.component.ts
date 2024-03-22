import { Component
 } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-homepage-hero',
  templateUrl: './homepage-hero.component.html',
  styleUrls: ['./homepage-hero.component.css']
})
export class HomepageHeroComponent {

  constructor(private router: Router) { }

  navigateToBrandPage(brandName: string) {
    this.router.navigate(['/brandpage', brandName]);
  }

}
