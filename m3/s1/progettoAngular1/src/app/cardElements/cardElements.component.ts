import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-cardElements',
  templateUrl: './cardElements.component.html',
  styleUrls: ['./cardElements.component.css']
})
export class CardElementsComponent implements OnInit {

    data:any = [];
  constructor(private http: HttpClient) { }

  ngOnInit():void {
    this.http.get('../../assets/db.json').subscribe(data => {
      this.data = data;
    });
  }

}
