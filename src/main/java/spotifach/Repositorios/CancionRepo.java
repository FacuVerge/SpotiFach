package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Cancion;

@Repository
public interface CancionRepo extends CrudRepository<Cancion, Long> {

}
