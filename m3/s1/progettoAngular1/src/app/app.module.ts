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
import { BrandpageComponent } from './brandpage/brandpage.component';
import { HomepageHeroComponent } from './homepage-hero/homepage-hero.component';

@NgModule({
  declarations: [	
    AppComponent,
      HeaderNavComponent,
      FooterComponent,
      CardElementsComponent,
      HomeComponent,
      BrandpageComponent,
      HomepageHeroComponent
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
