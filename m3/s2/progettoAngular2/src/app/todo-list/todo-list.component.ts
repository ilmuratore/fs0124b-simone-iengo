import { Component, OnInit } from '@angular/core';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrl: './todo-list.component.scss'
})

export class TodoListComponent implements OnInit{

  todos = this.todoService.todos;

  constructor(private todoService: TodoService){}

  ngOnInit(): void {}

  addTask(task: string, user: string){
    this.todoService.addTask(task, user);
  }

  removeTask(task: string){
    this.todoService.removeTask(task);
  }

  updateTask(oldTask: string, newTask: string){
    this.todoService.updateTask(oldTask, newTask);
  }
}
