import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8080/api/v1/employees";
  private createURL = this.baseURL + "/create";

  constructor(private httClient : HttpClient) { }

  getEmployeeList(): Observable<Employee[]>{
    return this.httClient.get<Employee[]>(`${this.baseURL}`);
  }

  createEmployee(employee:Employee):Observable<Object> {
    return this.httClient.post(`${this.createURL}`, employee);
  }
}
