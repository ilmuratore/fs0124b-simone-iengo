import { Component, OnInit, Input } from '@angular/core';
import { TodoService } from '../services/todo.service';
import { Todo } from '../interfaces/todo.interface';



@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrl: './todo-list.component.scss'
})

export class TodoListComponent implements OnInit{


  constructor(){}

  ngOnInit(): void {
  }

}
