import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FlightService } from '../flight.service';
import {Flight} from '../flight'

@Component({
  selector: 'app-flightsearch',
  templateUrl: './flightsearch.component.html',
  styleUrls: ['./flightsearch.component.css']
})
export class FlightsearchComponent implements OnInit {

  sourceLocation: string[]=['mumbai','hyderabad','goa']
  defaultLoc:string='mumbai'

  flight:any[]=[];


  from:any;
  to:any;
  arrivaldate:any;
  departdate:any;


  constructor(private ash:FlightService,private router:Router) { }

  flightList: any;

  flightDetails:any;
  srchfromdept:any;
  srchtoarrive:any;
  srchdepart:any;
  srcharrival:any;


  FLIGHTNO:any;
  FROMDEPT:any;
  TOARRIVE:any;
  DEPARTDATE:any;
  ARRIVALDATE:any;
  cabin:any;
 
  
  booking()
    {
      this.router.navigate(['/booking'])
    }

    username2:any;

  ngOnInit(): void {
    this.username2=localStorage.getItem("loginusername");
    this.FROMDEPT=localStorage.getItem("from");
    this.TOARRIVE=localStorage.getItem("to");
    this.DEPARTDATE=localStorage.getItem("depart");
    this.ARRIVALDATE=localStorage.getItem("arrival");
    this.cabin=localStorage.getItem("gate")
  
    
  }
  

  searchmethod()
  {
    console.log(this.srchdepart);
    this.ash.flightsearch(this.srchfromdept,this.srchtoarrive,this.srchdepart,this.srcharrival).subscribe
    (
      (data)=>
      {
        console.log(data);
        this.flightDetails=data;
        localStorage.setItem("from",this.srchfromdept)
        localStorage.setItem("to",this.srchtoarrive)
        localStorage.setItem("depart",this.srchdepart)
        localStorage.setItem("arrival",this.srcharrival)
        // localStorage.setItem("flightno",this.flightNo)
        console.log(this.flightDetails.cabin);
        localStorage.setItem("gate",this.flightDetails.cabin)
 
        this.flightList=data;
        console.log(this.srchdepart)
        this.router.navigate(['/flightselect'])
        console.log("search success")
      }
    )
  
  }

  profile()
  {
    this.router.navigate(['/profile'])
  }

}
