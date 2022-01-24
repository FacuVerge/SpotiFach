package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Artista;

@Repository
public interface ArtistaRepo extends CrudRepository<Artista, Long> {

}
