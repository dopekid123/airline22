import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { userInfo } from 'os';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  constructor(private vhs: UserService,private router:Router) { }

  ngOnInit(): void {
    this.username=localStorage.getItem("loginusername");
    this.title="user";
  }

  title:any;
  loginValues:any;
  loginValid :any;
  username:any;
  
  validateLogin(loginForm: any)
  {
    console.log(loginForm.value);
    this.loginValues=loginForm.value;
    console.log(this.loginValues);

    this.vhs.validateLogin(this.loginValues).subscribe(
      (data)=>
      {
        console.log(data);
        this.loginValid=data;
        localStorage.setItem("loginusername",this.loginValues.username);
        if(this.loginValid)
        {
          
          
          this.router.navigate(['/searchFlight']);
          
        }
        else
        {
          alert("Invalid")
        }
      }
    )
  }

  signup()
  {
    this.router.navigate(['/signup'])
  }

  
}
