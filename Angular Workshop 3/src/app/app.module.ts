import { NgModule} from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponentComponent } from './components/first-component/first-component.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { MaincomponentComponent } from './components/maincomponent/maincomponent.component';
import { FormsModule } from '@angular/forms';
import { ConvertToSpacePipe } from './pipes/convert-to-space.pipe';
import { SearchPipe } from './pipes/search.pipe';
import { CounterComponent } from './components/counter/counter.component';
import { ChildComponent } from './components/child/child.component';
import { ParentComponent } from './components/parent/parent.component';

import { PathnotfoundComponent } from './components/pathnotfound/pathnotfound.component';
import { EmployeeDetailsComponent } from './components/employee-details/employee-details.component';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponentComponent,
    HeaderComponent,
    FooterComponent,
    MaincomponentComponent,
    EmployeeDetailsComponent,
    ConvertToSpacePipe,
    SearchPipe,
    CounterComponent,
    ChildComponent,
    ParentComponent,
    PathnotfoundComponent 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    CommonModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
