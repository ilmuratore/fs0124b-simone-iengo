import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './Home/Home.component';
import { FiatbrandComponent } from './fiatbrand/fiatbrand.component';
import { FordbrandComponent } from './fordbrand/fordbrand.component';
import { AudibrandComponent } from './audibrand/audibrand.component';



const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'fiatbrand', component: FiatbrandComponent},
  {path: 'fordbrand', component: FordbrandComponent},
  {path: 'audibrand', component: AudibrandComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
