import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Operation } from '../model/operation';

@Injectable({
  providedIn: 'root'
})
export class CalculateService {

  private baseUrl = 'http://localhost:9191/api'; 
  
    constructor(private http: HttpClient) { }
  
    calculate(operation: Operation): Observable<number> {
      return this.http.post<number>(`${this.baseUrl}/calculate`, operation);
    }
  }

