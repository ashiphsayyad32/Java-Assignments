import { Component, OnInit, Input, OnChanges, SimpleChanges } from '@angular/core';
import { Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.scss']
})
export class ChildComponent implements OnInit, OnChanges {

  constructor() { }

  @Input() childCounter:number = 4;

  @Output() increment = new EventEmitter<number>();

  OnIncrement(){
    console.log("Inside OnIncrement Method!!");
    this.increment.emit(++this.childCounter)
  }

  ngOnInit(): void {
    console.log("inside Oninit child method!!")
    console.log(this.childCounter);
  }

  ngOnChanges(changes: SimpleChanges): void{
    console.log("inside Onchanges child method!!");
  }

}
