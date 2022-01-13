package Business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Album {

	private String nombre;
	private Integer anio;
	//private Imagen portada;
	private Set<Artista> artistas;

}
