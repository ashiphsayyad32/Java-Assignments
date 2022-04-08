import { Component, OnInit, OnChanges, SimpleChanges } from '@angular/core';
import { Employee } from 'src/Utility/Employee';


@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.scss']
})
export class EmployeeDetailsComponent implements OnInit, OnChanges {


  
  constructor() {
    console.log("in employee construstor")
   }

  
  employee:Employee[]=[
    {empid:1,name:"Ashiph",designation:"Architect",image:'assets/img/profile.jpg',flag:true},
    {empid:2,name:"Majid",designation:"Manager",image:'assets/img/profile1.png',flag:true},
    {empid:1,name:"Arib",designation:"Developer",image:'assets/img/profile3.jpg',flag:true}
  ]

  toggleImg(employee:Employee){
    employee.flag  =! employee.flag; 
  }

  searchStr:string = "";

  ngOnInit(): void {
    console.log("in ngOnit method");
  }

  
  ngOnChanges(changes: SimpleChanges): void {
    console.log("Onchanges()");
    // It's not printing bcoz we are not passing any child component.
}
                                        
}
