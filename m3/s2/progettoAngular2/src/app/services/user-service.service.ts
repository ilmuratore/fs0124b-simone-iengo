import { Injectable } from '@angular/core';
import { User } from '../interfaces/user.interface';
import { users } from '../../assets/users';
import { TodoService } from './todo.service';

@Injectable()
export class UserServiceService {

users: User[] = users;

constructor(){}

getById(id: number){
  return this.users.find(user => user.id === id)
}

}
