import { Injectable } from '@angular/core';
import { Jsonp, Http } from '@angular/http'
import 'rxjs/Rx';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class PeliculasService {
  private urlMoviedb:string = "http://localhost:8080/api/peliculas/listar/{&1}";

  peliculas:any[] = [];

  constructor( private jsonp:Jsonp, private http:Http ) {  }

  getCartelera(pagina: number): Observable<any> {
    return this.http.get(this.urlMoviedb.replace("{&1}", pagina.toString())).map(data => data.json());
  }
}
