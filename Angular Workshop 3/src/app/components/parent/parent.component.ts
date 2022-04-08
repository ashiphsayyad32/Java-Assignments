import { Component, OnInit, OnChanges } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.scss']
})
export class ParentComponent implements OnInit {

  constructor() { }

  parentCounter:number=5;

  parentIncrement(value:number){
    console.log(" inside ParentIncreament method");
    this.parentCounter = value;
  }

  ngOnInit(): void {
    console.log(this.parentCounter);
  }

 
}
