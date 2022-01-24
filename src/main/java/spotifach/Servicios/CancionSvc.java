package spotifach.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spotifach.Business.Cancion;
import spotifach.Business.Genero;
import spotifach.Repositorios.CancionRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CancionSvc {

	@Autowired
	CancionRepo cancionRepo;

	public List<Cancion> findAll() {
		return (List<Cancion>) cancionRepo.findAll();
	}

	public List<Cancion> findCancionesByGenero(String genero) {
		return this.filtrarPorGenero((List<Cancion>) cancionRepo.findAll(), genero);
	}

	public List<Cancion> filtrarPorGenero(List<Cancion> canciones, String genero) {
		return canciones.stream().filter(cancion -> this.tieneComoGeneroA(cancion, genero)).collect(Collectors.toList());
	}

	public Boolean tieneComoGeneroA(Cancion cancion, String genero) {
		for(Genero generoCancion: cancion.getGeneros()) {
			if(generoCancion.getNombre().equals(genero)) {
				return true;
			}
		}
		return false;
	}
}
