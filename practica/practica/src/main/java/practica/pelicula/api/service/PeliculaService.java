package practica.pelicula.api.service;

import practica.pelicula.api.to.ListaPeliculaTO;

/**
 * Contrato para manejo de listas de peliculas
 */
public interface PeliculaService {
	
	/**
	 * Obtiene una lista de peliculas dada una pagina
	 * @param pagina
	 * @return
	 */
	ListaPeliculaTO obtenerListaPelicula(Integer pagina);
	
}
