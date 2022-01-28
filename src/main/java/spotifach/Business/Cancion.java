package spotifach.Business;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "cancion")
public class Cancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String urlPista;

	@ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinTable(
			name = "cancion_x_artista",
			joinColumns = { @JoinColumn(name = "id_cancion") },
			inverseJoinColumns = { @JoinColumn(name = "id_artista") }
	)
	private Set<Artista> artistas;

	@ManyToOne
	@JoinColumn(name = "id_album")
	@JsonManagedReference(value = "cancion")
	private Album album;

	@ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinTable(
			name = "cancion_x_genero",
			joinColumns = { @JoinColumn(name = "id_cancion") },
			inverseJoinColumns = { @JoinColumn(name = "id_genero") }
	)
	private Set<Genero> generos;

	@Transient
	private String artistasMapeados;

}
