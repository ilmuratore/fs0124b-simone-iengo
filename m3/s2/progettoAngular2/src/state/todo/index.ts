import {createFeatureSelector, createSelector} from 'ngrx/store';

import {ToDo} from './todo.interface';
import {ToDoState, toDoAdapter} from './todo/todo.reducer';

export const selectToDoState = createFeatureSelector<ToDoState>('todo');

export const {
  selectIds: toDoIds,
  selectEntities: toDoEntities,
  selectAll: allToDos,
  selectTotal: totalToDos,
} = toDoAdapter.getSelectors(selectToDoState);

export const completeToDos = createSelector(allToDos, (toDos:Array<ToDo>) => toDos.filter((toDo) => toDo.completed));
export const incompleteToDos = createSelector(allToDos, (toDos:Array<ToDo>) => toDos.filter((toDo) => !toDo.completed));
