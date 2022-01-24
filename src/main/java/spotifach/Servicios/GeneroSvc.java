package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Repositorios.GeneroRepo;

@Service
public class GeneroSvc {

	@Autowired
	GeneroRepo generoRepo;

}
