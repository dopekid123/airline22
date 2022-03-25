import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  constructor(private vhs:UserService,private router:Router) { }

  title="admin";
  ngOnInit(): void {
  }

  adminValues:any;
  adminValid :any;
  validateAdmin(adminForm : any)
  {
    console.log(adminForm.value);
    this.adminValues=adminForm.value;

    this.vhs.validateLogin(this.adminValues).subscribe(
      (data)=>
      {
        console.log(data);
        this.adminValid=data;
        if(this.adminValid)
        {
          this.router.navigate(['/adminhomepage'])
        }
        else
        {
          alert("Invalid")
        }

      }
    )

  }
}
