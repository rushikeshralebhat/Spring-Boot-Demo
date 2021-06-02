import { Injectable } from "@angular/core";

import { HttpClient,} from '@angular/common/http';
import { Observable } from "rxjs";
import { environment } from "src/environments/environment";

@Injectable({
    providedIn: 'root'
  })
  export class EmployeeService {
      

    
    constructor(private http: HttpClient) {}
  
    addEmployee(data: any): Observable<any> {
      return this.http.post<any>(`${environment.baseUrl}/employees`, data)
  }
}