import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { FiatbrandComponent } from './fiatbrand/fiatbrand.component';
import { FordbrandComponent } from './fordbrand/fordbrand.component';
import { AudibrandComponent } from './audibrand/audibrand.component';



const routes: Routes = [
  {path: 'home', component: AppComponent},
  {path: 'fiat', component: AppComponent},
  {path: 'ford', component: AppComponent},
  {path: 'audi', component: AppComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
