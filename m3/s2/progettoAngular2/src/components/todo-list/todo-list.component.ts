import { Component, EventEmitter, Input, Output } from '@angular/core';
import { MatCheckboxChange } from '@angular/material';

import { toDo} from '';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements {

  @input() toDos: ToDo[];

  @Output() toDoChange = new EventEmitter<ToDo>()

  constructor() { }


  OnCompleteChange(toDo:ToDo, change: MatCheckboxChange) :void {
    this.toDoChange.emit({
      ...toDo, complete: change.checked
    });
  }

}
