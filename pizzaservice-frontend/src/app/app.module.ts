import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee/component/employee-list/employee-list.component';
import { CreateEmployeeComponent } from './employee/component/create-employee/create-employee.component';
import { FormsModule } from '@angular/forms';
import { CreatePizzaOrderComponent } from './customer-order/component/create-pizza-order/create-pizza-order.component';
import { ViewPizzaOrderComponent } from './customer-order/component/view-pizza-order/view-pizza-order.component';
import { PizzaOrderListComponent } from './customer-order/component/pizza-order-list/pizza-order-list.component';
import { PizzaCartComponent } from './customer-order/component/pizza-cart/pizza-cart.component';
import { HomeComponent } from './home/home.component';
import { CustomePizzaComponent } from './customer-order/component/custome-pizza/custome-pizza.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    CreateEmployeeComponent,
    CreatePizzaOrderComponent,
    ViewPizzaOrderComponent,
    PizzaOrderListComponent,
    PizzaCartComponent,
    HomeComponent,
    CustomePizzaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
