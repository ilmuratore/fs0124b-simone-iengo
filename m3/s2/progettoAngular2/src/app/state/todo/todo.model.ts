export interface ToDo {
  id: number;
  task: string;
  complete: boolean;
}

export function generateToDos(): ToDo[] {
  return [
    { id: 1, task: 'Walk the dog', complete: false },
    { id: 2, task: 'Wash the car', complete: false },
    { id: 3, task: 'Clean the kitchen', complete: false}
  ];
}
