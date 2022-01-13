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

public class Cancion {

	private String nombre;
	// private pista;
	private Set<Artista> artistas;
	private Album album;
	private Set<Genero> generos;

}
