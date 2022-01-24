package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Persona;

@Repository
public interface PersonaRepo extends CrudRepository<Persona, Long> {

}
