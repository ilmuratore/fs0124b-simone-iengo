import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { database2 } from '../database';

@Component({
  selector: 'app-fiatbrand',
  templateUrl: './fiatbrand.component.html',
  styleUrls: ['./fiatbrand.component.css']
})
export class FiatbrandComponent implements OnInit {


  data:database2[] = [];
  filteredData:database2[] = [];
constructor(private http: HttpClient) { }

ngOnInit():void {
  this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
    this.data = data;
    this.filterData('Fiat')
  });
}

filterData(brand:string):void {
  this.filteredData = this.data.filter(car => car.brand === brand);
}
}
