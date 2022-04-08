import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeDetailsComponent } from './components/employee-details/employee-details.component';
import { ParentComponent } from './components/parent/parent.component';
import { PathnotfoundComponent } from './components/pathnotfound/pathnotfound.component';

const routes: Routes = [
  {path: 'getAllEmployess', component: EmployeeDetailsComponent},
  {path:'',component:ParentComponent},
  {path:'**',component:PathnotfoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
