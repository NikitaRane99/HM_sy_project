import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminauthService {

  constructor() { }

  authenticate(username2:string, password2:string){
    if(username2=='nikita' && password2=='nikita@123'){
      sessionStorage.setItem('username2', username2);
      return true;

    }else{
      return false;
    }
  }

  isUserLoggedIn(){
    console.log("user logged");
    let user=sessionStorage.getItem('username2');

    return !(user==null);
  }

  logout(){
    console.log("Successfully loggout");
    sessionStorage.removeItem('username2');

  }
}
