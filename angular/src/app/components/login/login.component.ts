import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

// import {User} from '../../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  username = '';
  password = '';

  submitted = false;
  onSubmit() { this.submitted = true; }
// TODO: create a callback function so you can change
//  completed profile to true if there is evidence that the user
//  submitted the full profile.

  // TODO: remove.
  get diagnostic() { return JSON.stringify(this); }

  constructor( private router: Router) {}
  login(username: String, password: String) {
    //TODO: implement method

    this.router.navigate(['profile']);
  }
  ngOnInit() {}
}

