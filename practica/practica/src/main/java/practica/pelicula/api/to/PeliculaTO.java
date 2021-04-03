package practica.pelicula.api.to;

import lombok.Data;

/**
 *
 */
@Data
public class PeliculaTO {
	private Integer id;
	private String description; 
	private Integer favorite_count;
	private Integer item_count;
	private String iso_639_1;
	private String list_type;
	private String name;
	private String poster_path;
}
