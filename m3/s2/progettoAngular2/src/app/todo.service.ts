import { Injectable } from '@angular/core';

@Injectable()

export class TodoService {

  todos = [
    {title: 'todo1', user: 'User1',},
    {title: 'todo2', user: 'User2',},
    {title: 'todo3', user: 'User3',}
  ];


  addTask(task: string, user: string){
    this.todos.push({title: task, user: user});
  }

  removeTask(task: string){
    const index = this.todos.findIndex(t => t.title === task);
    if (index !== -1){
      this.todos.splice(index, 1)
    }
  }

  updateTask(oldTask: string, newTask: any){
    const index = this.todos.findIndex(t => t.title === oldTask);
    if (index !== -1){
      this.todos[index].title = newTask
    }
  }
}
