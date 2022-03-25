import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private ash:AdminService) { }

  flightNo:any;
  ngOnInit(): void {
  }

  admin : Admin= new Admin;
  addFlight(addadminForm: any)
  {
    this.admin=addadminForm.value;
    console.log(this.admin);
    this.ash.addFlight(this.admin).subscribe(
      (data)=>{
        console.log(data);
        alert("Flight Added");
        // localStorage.setItem("flightno",this.admin.flightNo);
      },
      (error)=>
      {
        console.log(error);
      }
    )
    
  }

}
