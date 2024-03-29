import { Injectable } from '@angular/core';
import {Todo} from '../interfaces/todo.interface';
import {todos} from '../../assets/todo';
import { users } from '../../assets/users';
import { UserServiceService } from './user-service.service';
import { User } from '../interfaces/user.interface';

@Injectable()

export class TodoService {

 todos: Todo[] = todos;
 users : User[] = users
constructor(private userSrv: UserServiceService){
  this.loadTodos();
}

get all(): Todo[]{
  return this.todos;
}

loadTodos(){
  this.todos.forEach(todo => {
    todo.user = this.userSrv.getById(todo.userId);
  })
}



}
