import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Auth } from '../../model/auth';
import { AuthService } from '../../service/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  auth: Auth = new Auth();
  showErrorMessage!: boolean
  
  constructor(private  authService: AuthService, private router: Router){}

  ngOnInit(): void {
  }

  onSubmit()
  {
    console.log(this.auth);
    this.login();
    //this.goToHome();
    

  }

  login()
  {
    this.authService.login(this.auth).subscribe(data => {console.log(data); this.goToHome();}, error => {console.log(error); this.showErrorMessage=true;});;
  }

  goToHome()
  {
    this.router.navigate(['/home']);

  }
}
