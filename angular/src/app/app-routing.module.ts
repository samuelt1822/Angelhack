import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {UserComponent} from "./components/user/user.component";
import {LoginComponent} from "./components/login/login.component";
import {CreateaccountpageComponent} from "./components/createaccountpage/createaccountpage.component";
import {LandingPageComponent} from "./components/landing-page/landing-page.component";

const routes: Routes = [
  {path: '', component: LandingPageComponent},
  {path: 'account', component: UserComponent},
  {path: 'login', component: LoginComponent},
  {path: 'create-account', component: CreateaccountpageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
