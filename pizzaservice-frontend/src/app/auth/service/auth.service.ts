import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Auth } from '../model/auth';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loginURL = "http://localhost:8080/api/v1/login";

  constructor(private httClient : HttpClient) { }

  login(auth:Auth):Observable<Object> {
    return this.httClient.post(`${this.loginURL}`, auth);
}
}
