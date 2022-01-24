package spotifach.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spotifach.Business.Cancion;
import spotifach.Servicios.CancionSvc;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api")
public class CancionesController {

	@Autowired
	private CancionSvc cancionSvc;

	@ResponseBody
	@GetMapping("/canciones")
	public ResponseEntity<List<Cancion>> todasLasCanciones(){
		try {
			return ResponseEntity.status(200).body(cancionSvc.findAll());
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}

	}

	@ResponseBody
	@GetMapping("/canciones/{genero}")
	public ResponseEntity<List<Cancion>> cancionesSegunGenero(@PathVariable String genero){
		try {
			return ResponseEntity.status(200).body(cancionSvc.findCancionesByGenero(genero));
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}
	}

}
