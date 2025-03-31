import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { database2 } from '../database';
import { filter } from 'rxjs/operators';


@Component({
  selector: 'app-audibrand',
  templateUrl: './audibrand.component.html',
  styleUrls: ['./audibrand.component.css']
})
export class AudibrandComponent implements OnInit {

  data:database2[] = [];
  filteredData:database2[] = [];
constructor(private http: HttpClient) { }

ngOnInit():void {
  this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
    this.data = data;
    this.filterData('Audi')
  });
}

filterData(brand:string):void {
  this.filteredData = this.data.filter(car => car.brand === brand);
}
}
