package spotifach.Repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spotifach.Business.Album;

@Repository
public interface AlbumRepo extends CrudRepository<Album, Long> {

}

