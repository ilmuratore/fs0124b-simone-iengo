import { Component } from '@angular/core';
import { Router, NavigationEnd, ActivatedRoute } from '@angular/router';
import { filter } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'progettoAngular1';
  isHomePage = false ;

  constructor(private router: Router, private activatedRoute: ActivatedRoute) {
    this.router.events.pipe(
      filter(event => event instanceof NavigationEnd)
    ).subscribe(() =>{
      this.isHomePage = this.activatedRoute.firstChild?.snapshot.routeConfig?.path === 'home';
    });
  }
}
