import { Component, OnDestroy, OnInit, output } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Subject } from 'rxjs';
import { debounceTime, takeUntil } from 'rxjs/operators';

import { ToDo} from '';

@Component({
  selector: 'app-todo-form',
  templateUrl: './todo-form.component.html',
  styleUrls: ['./todo-form.component.css']
})
export class TodoFormComponent implements OnDestroy, OnInit {

  @Output() toDoChange = new EventEmitter<Partial<ToDo>>();

  task: FormControl;

  ngOnDestroy(): void {
      this.unsubscribe.next();
      this.unsubscribe.complete();
  }

  ngOnInit(): void {
      this.task = FormControl();
      this.task.valueChanges.pipe(debounceTime(200), takeUntil(this.unsubscribe))
      .subscribe((value: string) => this.toDoChange.emit({task :value}));
  }

}
