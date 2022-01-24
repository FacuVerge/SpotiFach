package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Business.Artista;
import spotifach.Repositorios.ArtistaRepo;

import java.util.Set;

@Service
public class ArtistaSvc {

	@Autowired
	ArtistaRepo artistaRepo;

	public Set<Artista> findAll(){
		return (Set<Artista>) artistaRepo.findAll();
	}
}
