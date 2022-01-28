package spotifach.Business;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "album")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private Integer anio;
	private String urlPortada;

	@ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinTable(
			name = "album_x_artista",
			joinColumns = { @JoinColumn(name = "id_album") },
			inverseJoinColumns = { @JoinColumn(name = "id_artista") }
	)
	private Set<Artista> artistas;

	@OneToMany(mappedBy = "album", cascade = {CascadeType.ALL})
	@JsonBackReference(value = "canciones")
	private Set<Cancion> canciones;

}
