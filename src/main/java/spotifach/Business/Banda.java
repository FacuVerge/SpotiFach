package spotifach.Business;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue("Banda")
public class Banda extends Artista {

	@OneToMany(mappedBy = "banda", cascade = {CascadeType.ALL})
	@JsonManagedReference(value = "integrantes")
	private Set<Persona> integrantes;

}
