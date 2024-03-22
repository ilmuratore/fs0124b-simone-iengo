import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { database2 } from '../database';


@Component({
  selector: 'app-audibrand',
  templateUrl: './audibrand.component.html',
  styleUrls: ['./audibrand.component.css']
})
export class AudibrandComponent implements OnInit {

  data:database2[] = [];
constructor(private http: HttpClient) { }

ngOnInit():void {
  this.http.get<database2[]>('../../assets/db.json').subscribe(data => {
    this.data = data;
  });
}

}



