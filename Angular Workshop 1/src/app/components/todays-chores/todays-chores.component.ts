import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-todays-chores',
  templateUrl: './todays-chores.component.html',
  styleUrls: ['./todays-chores.component.scss']
})
export class TodaysChoresComponent implements OnInit {

  constructor() { }

  todaysChores = [
    { id : 1 , name: 'Empty Dishwasher'},
    { id : 2 , name: 'Buy Groceries'},
    { id : 3 , name: 'Demo'},
    { id : 4 , name: 'Temp'}
   
  ]

  ngOnInit(): void {
  }

}
