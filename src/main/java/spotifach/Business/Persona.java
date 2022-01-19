package spotifach.Business;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@DiscriminatorValue("Persona")
public class Persona extends Artista {

	@ManyToOne
	@JoinColumn(name = "id_banda")
	@JsonBackReference(value = "integrantes")
	private Banda banda;

	private Integer edad;
	private String nacionalidad;

}
