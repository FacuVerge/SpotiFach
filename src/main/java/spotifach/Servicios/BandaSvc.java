package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Repositorios.BandaRepo;

@Service
public class BandaSvc {

	@Autowired
	BandaRepo bandaRepo;

}
