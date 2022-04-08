import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-maincomponent',
  templateUrl: './maincomponent.component.html',
  styleUrls: ['./maincomponent.component.scss']
})
export class MaincomponentComponent implements OnInit {


  constructor() { }

  sayHello(){
    alert("Event working!!")
  }

  toDate: Date = new Date();

  cur:number = 200;

  showMe:boolean = true;

  num:number = 1;

  initialValue :string = "Ashiph";

  months = [
    {"id":1, "name":"Jan"},
    {"id":2, "name":"Feb"}
  ]

  ngOnInit(): void {
  }

}
