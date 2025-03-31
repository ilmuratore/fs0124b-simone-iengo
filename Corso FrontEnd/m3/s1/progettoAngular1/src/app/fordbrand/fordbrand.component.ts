import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { database2 } from '../database';

@Component({
  selector: 'app-fordbrand',
  templateUrl: './fordbrand.component.html',
  styleUrls: ['./fordbrand.component.css']
})
export class FordbrandComponent implements OnInit {


  data:database2[] = [];
  filteredData:database2[] = [];
constructor(private http: HttpClient) { }

ngOnInit():void {
  this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
    this.data = data;
    this.filterData('Ford')
  });
}

filterData(brand:string):void {
  this.filteredData = this.data.filter(car => car.brand === brand);
}
}
