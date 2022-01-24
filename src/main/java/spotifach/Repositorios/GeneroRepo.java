package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Genero;

@Repository
public interface GeneroRepo extends CrudRepository<Genero, Long> {

}
