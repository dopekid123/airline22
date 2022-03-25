import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';

import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { UserLoginComponent } from './user-login/user-login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { FlightselectComponent } from './flightselect/flightselect.component';
import { BookingComponent } from './booking/booking.component';
import { ShowbookingComponent } from './showbooking/showbooking.component';
import { AdminComponent } from './admin/admin.component';
import { ShowadminflightComponent } from './showadminflight/showadminflight.component';
import { DeleteadminflightComponent } from './deleteadminflight/deleteadminflight.component';
import { FlightsearchComponent } from './flightsearch/flightsearch.component';
import { HomepageComponent } from './homepage/homepage.component';
import { SignupComponent } from './signup/signup.component';
import { PaymentComponent } from './payment/payment.component';
import { AdminhomepageComponent } from './adminhomepage/adminhomepage.component';
import { ReservationComponent } from './reservation/reservation.component';
import { CancelbookingComponent } from './cancelbooking/cancelbooking.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    UserLoginComponent,
    AdminLoginComponent,
    FlightselectComponent,
    BookingComponent,
    ShowbookingComponent,
    AdminComponent,
    ShowadminflightComponent,
    DeleteadminflightComponent,
    FlightsearchComponent,
    HomepageComponent,
    SignupComponent,
    PaymentComponent,
    AdminhomepageComponent,
    ReservationComponent,
    CancelbookingComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,HttpClientModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
