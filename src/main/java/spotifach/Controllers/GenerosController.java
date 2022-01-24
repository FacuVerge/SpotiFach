package spotifach.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spotifach.Business.Genero;
import spotifach.Servicios.GeneroSvc;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/generos")
public class GenerosController {

	@Autowired
	private GeneroSvc generoSvc;

	@ResponseBody
	@GetMapping("")
	public ResponseEntity<List<Genero>> todosLosGeneros(){
		try {
			return ResponseEntity.status(200).body(generoSvc.findAll());
		} catch (Exception ex) {
			return ResponseEntity.status(400).build();
		}

	}

}
