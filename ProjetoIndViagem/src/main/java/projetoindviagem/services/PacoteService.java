package projetoindviagem.services;


import java.util.List;

import projetoindviagem.models.Pacote;

public interface PacoteService {
		
		List<Pacote> getAllPacotes();
		
		Pacote getPacoteById(Long id);
		
		Pacote savePacote(Pacote pacote);
		
		Pacote updatePacote(Long id, Pacote pacoteUpdated);
		
		void deleteById(Long id);
		
		
}
