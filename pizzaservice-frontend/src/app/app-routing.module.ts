import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { LoginComponent } from './auth/component/login/login.component';
import { CreatePizzaOrderComponent } from './customer-order/component/create-pizza-order/create-pizza-order.component';
import { PizzaCartComponent } from './customer-order/component/pizza-cart/pizza-cart.component';
import { PizzaOrderListComponent } from './customer-order/component/pizza-order-list/pizza-order-list.component';
import { CreateEmployeeComponent } from './employee/component/create-employee/create-employee.component';
import { EmployeeListComponent } from './employee/component/employee-list/employee-list.component';
import { EmployeeComponent } from './employee/component/employee/employee.component';
import { HomeComponent } from './home/home.component';
import { PizzaBaseComponent } from './pizza/component/pizza-base/pizza-base.component';
import { ReadymadePizzaComponent } from './pizza/component/readymade-pizza/readymade-pizza.component';
import { ToppingComponent } from './pizza/component/topping/topping.component';

const routes: Routes = [
  {path : 'home', component: HomeComponent},
  {path : 'admin', component: AdminComponent},
  {path : 'login', component: LoginComponent},
  {path : 'admin/employee', component: EmployeeComponent},
  {path : 'create-employee', component: CreateEmployeeComponent},
  {path : 'create-pizza-order', component: CreatePizzaOrderComponent},
  {path : 'list-pizza-orders', component: PizzaOrderListComponent},
  {path : 'admin/pizza-base', component: PizzaBaseComponent},
  {path : 'admin/pizza-topping', component: ToppingComponent},
  {path : 'admin/readymade-pizza', component: ReadymadePizzaComponent},
  {path : '', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
