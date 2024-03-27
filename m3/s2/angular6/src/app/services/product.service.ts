import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public cartAddedSubject = new Subject<boolean>();

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<any[]> {
    return this.http.get<any[]>("https://dummyjson.com/products");
  }

  addToCart(obj: any) : Observable<any> {
    return this.http.post<any>("",obj);
  }

  getCartItemsByCustId(custId: number) : Observable<any[]>  {
    return this.http.get<any[]>("https://dummyjson.com/products/" + custId);
  }
   removeCartItemById(cartId: number) : Observable<any[]>  {
    return this.http.get<any[]>("https://dummyjson.com/products/" + cartId);
  }

  makeSale(obj: any) : Observable<any> {
    return this.http.post<any>("",obj);
  }
}
