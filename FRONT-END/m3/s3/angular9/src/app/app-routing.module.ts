import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginAppComponent } from './login-app/login-app.component';
import { FormAppComponent } from './form-app/form-app.component';

const routes: Routes = [
  { path: 'login-app', component: LoginAppComponent },
  { path: 'form-app', component: FormAppComponent },
  { path: '', redirectTo: '/form-app', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
