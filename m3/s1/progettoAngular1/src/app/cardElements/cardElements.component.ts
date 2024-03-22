import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { database2 } from '../database';

@Component({
  selector: 'app-cardElements',
  templateUrl: './cardElements.component.html',
  styleUrls: ['./cardElements.component.css']
})
export class CardElementsComponent implements OnInit {

    data:database2[] = [];
  constructor(private http: HttpClient) { }

  ngOnInit():void {
    this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
      this.data = data;
    });
  }
}
