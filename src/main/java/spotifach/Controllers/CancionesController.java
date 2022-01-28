package spotifach.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spotifach.Business.Cancion;
import spotifach.Servicios.CancionSvc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/canciones")
public class CancionesController {

	@Autowired
	private CancionSvc cancionSvc;

	@ResponseBody
	@GetMapping("")
	public ResponseEntity<List<Cancion>> todasLasCanciones(){
		try {
			return ResponseEntity.status(200).body(cancionSvc.findAll());
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}

	}

	@ResponseBody
	@GetMapping("/{genero}")
	public ResponseEntity<List<Cancion>> cancionesSegunGenero(@PathVariable String genero){
		try {
			List<Cancion> canciones = cancionSvc.findCancionesByGenero(genero);
			for (Cancion cancion : canciones) {

				cancion.setArtistasMapeados(String.join(", ", cancion.getArtistas().stream().flatMap(artista -> Stream.of(artista.getNombre())).collect(Collectors.toSet())));
			}
			return ResponseEntity.status(200).body(canciones);
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
