import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login-app',
  templateUrl: './login-app.component.html',
  styleUrls: ['./login-app.component.css']
})
export class LoginAppComponent{

  username = '';
  password = '';

  onSubmit() {
    console.log('Username:', this.username);
    console.log('Password', this.password);
  }


}
