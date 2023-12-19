package projetoindviagem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoindviagem.models.Pacote;
import projetoindviagem.services.PacoteService;

@RestController
@RequestMapping("/pacote")
public class PacoteController {

	@Autowired
	private PacoteService ps;

	@PostMapping("/savepacote")
	public Pacote createPacote(@RequestBody Pacote pacote) {

		return ps.savePacote(pacote);
	}

	@GetMapping("/allpacotes")
	public List<Pacote> getAllPacotes() {

		return ps.getAllPacotes();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pacote> getPacoteById(@PathVariable Long id) {
		Pacote pacote = ps.getPacoteById(id);

		return ResponseEntity.ok(pacote);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Pacote> updatePacote(@PathVariable Long id, @RequestBody Pacote pacoteUpdated) {
		Pacote pacote = ps.getPacoteById(id);

		pacote.setDestino(pacoteUpdated.getDestino());

		ps.savePacote(pacote);

		return ResponseEntity.ok(pacote);
	}

	@DeleteMapping("/{id}")
	public void deletePacote(@PathVariable Long id) {
		ps.deleteById(id);
	}

}
