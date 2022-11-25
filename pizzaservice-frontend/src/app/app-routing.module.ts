import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './auth/component/login/login.component';
import { CreatePizzaOrderComponent } from './customer-order/component/create-pizza-order/create-pizza-order.component';
import { PizzaOrderListComponent } from './customer-order/component/pizza-order-list/pizza-order-list.component';
import { CreateEmployeeComponent } from './employee/component/create-employee/create-employee.component';
import { EmployeeListComponent } from './employee/component/employee-list/employee-list.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {path : 'home', component: HomeComponent},
  {path : 'admin', component: AdminComponent},
  {path : 'login', component: LoginComponent},
  {path : 'employees', component: EmployeeListComponent},
  {path : 'create-employee', component: CreateEmployeeComponent},
  {path : 'create-pizza-order', component: CreatePizzaOrderComponent},
  {path : 'list-pizza-orders', component: PizzaOrderListComponent},
  {path : '', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
