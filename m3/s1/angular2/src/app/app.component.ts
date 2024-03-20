import { Component } from '@angular/core';
import { iPost } from './models/iPost';
import { iJsonContent } from './models/json-content';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {

  postArr: iPost[] = [];

  ngOnInit() {
    fetch('../assets/db.json')
      .then(res => res.json())
      .then((contenutoJson: iJsonContent) => {
        this.postArr = contenutoJson.posts;

        this.getRandomPosts();
      });
  }

  getRandomPosts(n:number){
    for (let i = 0; i < n; i++) {
      let randomIndex = Math.floor(Math.random() * this.postArr.length);
      this.postArr.push(this.postArr[randomIndex]);
    }
  }

}


