import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { EmployeeService } from './servies';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent  {
 
  title = 'Demo1';
  profileForm = new FormGroup({
    firstname: new FormControl(''),
    lastname: new FormControl(''),
    email:new FormControl(''),
    addressline1: new FormControl(''),
    addressline2: new FormControl(''),
    state: new FormControl(''),
    city: new FormControl(''),
    pin: new FormControl(''),
  });

  constructor(private employeeService: EmployeeService) {}

  onSubmit() {
    console.warn(this.profileForm.value);
  
    let data={
      firstName:this.profileForm.controls["firstname"].value,
      lastName:this.profileForm.controls["lastname"].value,
      email:this.profileForm.controls["email"].value,
      employee_address_id:{
      addressline1:this.profileForm.controls["addressline1"].value,
      addressline2:this.profileForm.controls["addressline2"].value,
      state:this.profileForm.controls["state"].value,
      city:this.profileForm.controls["city"].value,
      pin:this.profileForm.controls["pin"].value
  
    }
   }

     this.employeeService.addEmployee(data).subscribe((res)=>{ 
       if(res){
         console.log("employee added")
       }
     })

  }
}


