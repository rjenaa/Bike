import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BikeService } from './services/bike.service';
import { HomeComponent } from './components/home/home.component';
import { ViewRegistrationComponent } from './components/view-registration/view-registration.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ViewRegistrationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [BikeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
