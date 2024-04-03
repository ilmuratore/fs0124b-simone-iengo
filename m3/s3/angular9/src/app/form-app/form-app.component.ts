import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-form-app',
  templateUrl: './form-app.component.html',
  styleUrl: './form-app.component.scss'
})
export class FormAppComponent implements OnInit{
  registrationForm: FormGroup = new FormGroup({});
  profileImage2: any;

  ngOnInit(){
    this.registrationForm = new FormGroup({
    username: new FormControl('', Validators.required),
    name: new FormControl('', Validators.required),
    surname: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    confirmPassword: new FormControl('', Validators.required),
    gender: new FormControl('', Validators.required),
    profileImage: new FormControl('', Validators.required),
    profileImage2: new FormControl('', Validators.required),
    bio: new FormControl('', Validators.required),
    });
  }

  onFileChange(event: any){
    const reader = new FileReader();
    if(event.target.files && event.targe.files.length){
      const [file] = event.target.files;
      reader.readAsDataURL(file);

      reader.onload = () => {
        this.registrationForm.patchValue({
          profileImage: reader.result
        });
      };
    }
  }
  onSubmit(){
    console.log(this.registrationForm.value);
}
}
