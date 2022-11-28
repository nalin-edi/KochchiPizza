import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee/component/employee-list/employee-list.component';
import { CreateEmployeeComponent } from './employee/component/create-employee/create-employee.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { CreatePizzaOrderComponent } from './customer-order/component/create-pizza-order/create-pizza-order.component';
import { PizzaOrderListComponent } from './customer-order/component/pizza-order-list/pizza-order-list.component';
import { PizzaCartComponent } from './customer-order/component/pizza-cart/pizza-cart.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './auth/component/login/login.component';
import { AdminComponent } from './admin/admin.component';
import { PizzaBaseComponent } from './pizza/component/pizza-base/pizza-base.component';
import { ToppingComponent } from './pizza/component/topping/topping.component';
import { ReadymadePizzaComponent } from './pizza/component/readymade-pizza/readymade-pizza.component';
import { CustomePzzaOrderComponent } from './customer-order/component/custome-pzza-order/custome-pzza-order.component';
import { NgSelectModule } from '@ng-select/ng-select';
import { HeaderComponent } from './common/component/header/header.component';
import { FooterComponent } from './common/component/footer/footer.component';
import { NavComponent } from './common/component/nav/nav.component';
import { ReadymadePizzaListComponent } from './customer-order/component/readymade-pizza-list/readymade-pizza-list.component';
import { ConfirmOrderComponent } from './customer-order/component/confirm-order/confirm-order.component';
import { PizzaCartItemComponent } from './customer-order/component/pizza-cart-item/pizza-cart-item.component';
import { EmployeeComponent } from './employee/component/employee/employee.component';
import { ReadymadePizzaItemComponent } from './customer-order/component/readymade-pizza-item/readymade-pizza-item.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeListComponent,
    CreateEmployeeComponent,
    CreatePizzaOrderComponent,
    PizzaOrderListComponent,
    PizzaCartComponent,
    HomeComponent,
    LoginComponent,
    AdminComponent,
    PizzaBaseComponent,
    ToppingComponent,
    ReadymadePizzaComponent,
    CustomePzzaOrderComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    ReadymadePizzaListComponent,
    ConfirmOrderComponent,
    PizzaCartItemComponent,
    EmployeeComponent,
    ReadymadePizzaItemComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule, ReactiveFormsModule,
    NgSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
