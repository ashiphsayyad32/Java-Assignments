import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FooterComponent } from './components/footer/footer.component';
import { MoviesToWatchComponent } from './components/movies-to-watch/movies-to-watch.component';
import { TodaysChoresComponent } from './components/todays-chores/todays-chores.component';
import { FavoriteLinksComponent } from './components/favorite-links/favorite-links.component';
import { ImagesComponent } from './components/images/images.component';
import { HeaderComponent } from './components/header/header.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    MoviesToWatchComponent,
    TodaysChoresComponent,
    FavoriteLinksComponent,
    ImagesComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
