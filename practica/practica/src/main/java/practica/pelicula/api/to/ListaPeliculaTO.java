package practica.pelicula.api.to;

import java.util.List;

import lombok.Data;

/**
 *
 */
@Data
public class ListaPeliculaTO {
	private Integer id;
	private Integer page;
	private List<PeliculaTO> results;
	private Integer total_pages;
	private Integer total_results;
}
