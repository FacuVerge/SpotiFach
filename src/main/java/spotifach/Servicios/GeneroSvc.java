package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Business.Genero;
import spotifach.Repositorios.GeneroRepo;

import java.util.List;

@Service
public class GeneroSvc {

	@Autowired
	GeneroRepo generoRepo;

	public List<Genero> findAll() {
		return (List<Genero>) generoRepo.findAll();
	}

}
