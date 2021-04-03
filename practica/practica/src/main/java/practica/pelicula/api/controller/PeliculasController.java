package practica.pelicula.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practica.pelicula.api.service.PeliculaService;
import practica.pelicula.api.to.ListaPeliculaTO;

@CrossOrigin
@RestController
@RequestMapping("/api/peliculas")
public class PeliculasController {
	
	@Autowired
	PeliculaService peliculaService;
	
	/**
	 * Permite listar las peliculas
	 */
	@GetMapping("/listar/{pagina}")
	public ResponseEntity<ListaPeliculaTO> listarUsuarios(@PathVariable("pagina") Integer pagina) {
		
		ListaPeliculaTO listaPeliculaTO = peliculaService.obtenerListaPelicula(pagina);
		
		return new ResponseEntity<>(listaPeliculaTO, HttpStatus.OK);
	}
}
