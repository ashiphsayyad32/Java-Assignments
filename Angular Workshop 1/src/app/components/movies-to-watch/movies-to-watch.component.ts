import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies-to-watch',
  templateUrl: './movies-to-watch.component.html',
  styleUrls: ['./movies-to-watch.component.scss']
})
export class MoviesToWatchComponent implements OnInit {

  constructor() { }

  movies = [
    { id : 1 , name: 'The Manchurian candiate'},
    { id : 2 , name: 'Ocean 8'},
    { id : 3 , name: 'The Incridibles'},
    { id : 4 , name: 'Hidden Figures'},
    { id : 5 , name: 'Croods'},
  ]

  ngOnInit(): void {
  }

}
