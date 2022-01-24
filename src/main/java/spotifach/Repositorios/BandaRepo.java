package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Banda;

@Repository
public interface BandaRepo extends CrudRepository<Banda, Long> {

}
