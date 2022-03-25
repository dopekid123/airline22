import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhomepage',
  templateUrl: './adminhomepage.component.html',
  styleUrls: ['./adminhomepage.component.css']
})
export class AdminhomepageComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  addflightadmin()
  {
    this.router.navigate(['/addFlight'])
  }

  deleteflightadmin()
  {
    this.router.navigate(['/deleteFlight'])
  }

  showAllFlight()
  {
    this.router.navigate(['/showFlight'])
  }

  updateFlight()
  {
    this.router.navigate(['/updateflight'])
  }
}
