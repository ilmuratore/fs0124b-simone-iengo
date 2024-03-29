import { Component, OnInit } from '@angular/core';
import { Store, select } from '@ngrx/store';
import { Observable } from 'rxjs';

import { State } from './state/state.interface';
import { completeToDos } from './state/todo';
import { AddToDo, CompleteToDos, IncompleteToDo } from './state/todo/todo.actions';
import { generateToDos, ToDo } from './state/todo/todo.model';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {

  completeToDos: Observable<Array<ToDo>>;

  incompleteToDos: Observable<Array<ToDo>>;

  private _toDo: Partial<ToDo>;

  constructor(private store: Store<State>) {}

  ngOnInit(){
    generateToDos().forEach(todo => this.store.dispatch(new AddToDo(todo)));
    this.completeToDos = this.store.pipe(select(completeToDos));
    this.incompleteToDos = this.store.pipe(select(incompleteToDos));
  }

  addToDo(){
    this.store.dispatch(new AddToDo({
      id: Math.random(),
      complete:false,
      task: this._toDo.task
    }));
  }

  onAddToDoChange(toDo: Partial<ToDo>){
    this._toDo = toDo;
  }

  onCompleteToDo(toDo: ToDo){
    this.store.dispatch(new CompleteToDos(toDo));
  }

  onIncompleteToDo(toDo: ToDo){
    this.store.dispatch(new IncompleteToDo(toDo))
  }
}
