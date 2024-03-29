import { Action } from 'ngrx/store';

import { ToDo } from './todo.model';

export enum ToDoActionTypes {
  AddToDo = '[ToDo] Add ToDo',
  ClearToDos = '[ToDo] Clear ToDos',
  CompleteToDos = '[ToDo] Complete ToDos',
  IncompleteToDo = '[ToDo] Incomplete ToDo',
  RemoveToDo = '[ToDo] Remove ToDo',
}

export class AddToDo implements Action {
  readonly type = ToDoActionTypes.AddToDo;
  constructor(public payload: ToDo){}
}

export class ClearToDos implements Action {
  readonly type = ToDoActionTypes.ClearToDos;
}

export class CompleteToDos implements Action {
  readonly type = ToDoActionTypes.CompleteToDos;
  constructor(public payload: ToDo){}
}

export class IncompleteToDo implements Action {
  readonly type = ToDoActionTypes.IncompleteToDo;
  constructor(public payload: ToDo){}
}

export class RemoveToDo implements Action {
  readonly type = ToDoActionTypes.RemoveToDo;
  constructor(public payload: ToDo){}
}

export type ToDoAction =
  | AddToDo
  | ClearToDos
  | CompleteToDos
  | IncompleteToDo
  | RemoveToDo;

