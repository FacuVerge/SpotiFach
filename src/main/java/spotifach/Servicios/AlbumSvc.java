package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Repositorios.AlbumRepo;

@Service
public class AlbumSvc {

	@Autowired
	AlbumRepo albumRepo;

}
