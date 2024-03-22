import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BrandpageComponent } from './brandpage/brandpage.component';


const routes: Routes = [
  {path: '', component: AppComponent},
  {path: 'brandpage', component: BrandpageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
