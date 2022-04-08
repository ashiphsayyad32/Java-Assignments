import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Hello';
  newtitle: string  = "Welcome";
  
  getMsg():string{
    return this.title;
  }

  path = "";
}
