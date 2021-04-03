package practica.pelicula.api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import practica.pelicula.api.service.PeliculaService;
import practica.pelicula.api.to.ListaPeliculaTO;
import practica.pelicula.api.util.ConstantesPelicula;
import practica.pelicula.api.util.ConstantesPelicula.IdentificadorIdioma;

/**
 * Servicio para obtener la lista de peliculas
 *
 */
@Service("peliculaService")
public class PeliculaServiceImpl implements PeliculaService{

	@Override
	public ListaPeliculaTO obtenerListaPelicula(Integer pagina) {
		String url = this.obtenerUrlListaPeliculas(pagina);
		return new RestTemplate().getForEntity(url, ListaPeliculaTO.class).getBody();
	}
	
	private String obtenerUrlListaPeliculas(Integer pagina) {
		return ConstantesPelicula.URL_PAGINA_PELICULA
				.concat(ConstantesPelicula.URL_PART_MOVIE.replace("{&1}", "550"))
				.concat(ConstantesPelicula.URL_PART_API_KEY.replace("{&2}", ConstantesPelicula.API_KEY_SECRET))
				.concat(ConstantesPelicula.URL_PART_LANGUAGE.replace("{&3}", IdentificadorIdioma.EN.name()))
				.concat(ConstantesPelicula.URL_PART_PAGE.replace("{&4}", pagina.toString()));
	}

}
