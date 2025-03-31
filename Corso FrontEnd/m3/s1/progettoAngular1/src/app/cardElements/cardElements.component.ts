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
    randomCard:database2[] = [];
  constructor(private http: HttpClient) { }

  ngOnInit():void {
    this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
      this.data = data;
      this.randomCard = this.getRandom(this.data, 2)
    });
  }

  getRandom(arr:database2[], n:number) {
    let result = new Array(n),
    len = arr.length,
    taken = new Array(len);
  if (n > len)
    throw new RangeError("getRandom: more elements taken than available");
  while (n--) {
    let x = Math.floor(Math.random() * len);
    result[n] = arr[x in taken ? taken[x] : x];
    taken[x] = --len in taken ? taken[len] : len;
  }
  return result;
}
}
