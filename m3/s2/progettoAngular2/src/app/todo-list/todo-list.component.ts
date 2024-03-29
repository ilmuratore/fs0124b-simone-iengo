import { Component, OnInit } from '@angular/core';
import { TodoService } from '../services/todo.service';
import { users } from '../../assets/users';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrl: './todo-list.component.scss'
})

export class TodoListComponent implements OnInit{

  todos = this.todoService.todos;

  constructor(private todoService: TodoService){}

  ngOnInit(): void {
    console.log(this.todos)
  }

}
