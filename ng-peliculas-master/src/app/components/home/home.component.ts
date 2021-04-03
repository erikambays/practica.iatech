import { Component } from '@angular/core';
import { PeliculasService } from '../../services/peliculas.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styles: []
})

export class HomeComponent {

  listaPeliculas:any;
  results: any;

  constructor(private peliculasService: PeliculasService, private router:Router) {
    let siguientePagina: number = this.listaPeliculas == undefined ? 1: this.listaPeliculas.page++;

    this.peliculasService.getCartelera(siguientePagina)
      .subscribe( data => {
        this.listaPeliculas = data;
        this.results = this.listaPeliculas.results;
      });
  }

  mostrarDetalle(pelicula) {
    this.router.navigate(['/pelicula', pelicula.id]);
  }

  siguientePagina(){
    
    let siguientePagina: number = this.listaPeliculas == undefined ? 1: this.listaPeliculas.page++;
    
    console.log(siguientePagina);

    this.peliculasService.getCartelera(siguientePagina)
        .subscribe( data => {
          this.listaPeliculas = data;
          this.results = this.listaPeliculas.results;
        });
  }

}

