package projetoindviagem.services;

import java.util.List;

import projetoindviagem.dto.ReservaDTO;
import projetoindviagem.models.Reserva;

public interface ReservaService {

	List<Reserva> getAllReservas();
	
	Reserva getReservaById(Long id);
	
	Reserva saveReserva(ReservaDTO reservaDTO);
	
	Reserva updateReserva(Long id, ReservaDTO reservaDTOUpdated);
	
	void deleteById(Long id);
	
	void addRelationship(Long reservaId, Long clienteId , Long pacoteId);
	
	List<Object> findAllRels();
	
	
	
	

}
