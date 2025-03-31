import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subject } from 'rxjs';
import { Root } from '../interface';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  public cartAddedSubject = new Subject<boolean>();

  constructor(private http: HttpClient) { }

  getAllProducts(): Observable<Root> {
    return this.http.get<Root>("https://dummyjson.com/products");
  }

  addToCart(obj: Root) : Observable<Root> { //aggiunge gli oggetti al carrello  - output
    return this.http.post<Root>("",obj);
  }

  getCartItemsByCustId(custId: number) : Observable<Root>  { // aggiunge ai preferiti un prodotto in base all'id
    return this.http.get<Root>("" + custId);
  }
   removeCartItemById(cartId: number) : Observable<Root>  { // rimouve dai preferiti un prodotto in base all'id
    return this.http.get<Root>("" + cartId);
  }

  makeSale(obj: Root) : Observable<Root> { // termina l'acquisto con il carrello
    return this.http.post<Root>("",obj);
  }
}
