import { Component, OnInit } from '@angular/core';
import { MatCheckboxChange} from '@angular/material';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

 @Input() toDo: ToDo;

 @Output() completeChange = new EventEmitter<MatCheckboxChange>();

}
