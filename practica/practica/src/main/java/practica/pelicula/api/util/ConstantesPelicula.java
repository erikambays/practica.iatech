package practica.pelicula.api.util;

/**
 *
 */
public class ConstantesPelicula {

	public static final String URL_PAGINA_PELICULA = "https://api.themoviedb.org/3/";
	public static final String URL_PART_MOVIE = "movie/{&1}/lists?";
	public static final String URL_PART_API_KEY = "api_key={&2}";
	public static final String API_KEY_SECRET = "a8d96779659c3301c82e08fd2658877c";
	public static final String URL_PART_LANGUAGE = "&language={&3}";
	public static final String URL_PART_PAGE = "&page={&4}";
	
	public enum IdentificadorIdioma{
		EN
	}
	
	/**
	 * 
	 */
	private ConstantesPelicula() {}
	
}
