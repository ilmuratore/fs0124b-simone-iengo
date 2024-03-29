import { Component, EventEmitter, Input, Output} from '@angular/core';
import { MatCheckboxChange } from '@angular/material/checkbox';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent {

 @Input() toDo: ToDo;

 @Output() completeChange = new EventEmitter<MatCheckboxChange>();

}
