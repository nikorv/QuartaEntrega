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

import projetoindviagem.dto.ReservaDTO;
import projetoindviagem.models.Reserva;
import projetoindviagem.services.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {

	@Autowired
	private ReservaService rs;

	@PostMapping("/savereserva")
	public Reserva createReserva(@RequestBody ReservaDTO reservaDto) {

		return rs.saveReserva(reservaDto);
	}

	@GetMapping("/allreservas")
	public List<Reserva> getAllReservas() {

		return rs.getAllReservas();
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Reserva> getReservaById(@PathVariable Long id){
		Reserva reserva = rs.getReservaById(id);
		
		return ResponseEntity.ok(reserva);
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Reserva> updateReserva(@PathVariable Long id, @RequestBody ReservaDTO reservaDTOUpdated){
		Reserva reserva = rs.getReservaById(id);
		
	
		
		rs.updateReserva(id, reservaDTOUpdated);
		
		return ResponseEntity.ok(reserva);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteReserva(@PathVariable Long id) {
		rs.deleteById(id);
	}
	
	

}