import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HeaderNavComponent } from './header-nav/header-nav.component';
import { FooterComponent } from './footer/footer.component';
import { CardElementsComponent } from './cardElements/cardElements.component';
import { HomeComponent } from './Home/Home.component';
import { HttpClientModule } from '@angular/common/http';
import { HomepageHeroComponent } from './homepage-hero/homepage-hero.component';
import { FiatbrandComponent } from './fiatbrand/fiatbrand.component';
import { AudibrandComponent } from './audibrand/audibrand.component';
import { FordbrandComponent } from './fordbrand/fordbrand.component';

@NgModule({
  declarations: [			
    AppComponent,
      HeaderNavComponent,
      FooterComponent,
      CardElementsComponent,
      HomeComponent,
      HomepageHeroComponent,
      FiatbrandComponent,
      AudibrandComponent,
      FordbrandComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
