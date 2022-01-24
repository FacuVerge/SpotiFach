package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Repositorios.PersonaRepo;

@Service
public class PersonaSvc {

	@Autowired
	PersonaRepo personaRepo;

}
