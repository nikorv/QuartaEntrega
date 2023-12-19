package projetoindviagem.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projetoindviagem.models.Pacote;
import projetoindviagem.repositories.PacoteRepository;

import projetoindviagem.services.PacoteService;

@Service
public class PacoteServiceImpl implements PacoteService{
	@Autowired
	private PacoteRepository pr;

	@Override
	public List<Pacote> getAllPacotes() {

		return pr.findAll();
	}

	@Override
	public Pacote getPacoteById(Long id) {

		return pr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
	}

	@Override
	public Pacote savePacote(Pacote pacote) {

		return pr.save(pacote);
	}

	@Override
	public Pacote updatePacote(Long id, Pacote pacoteUpdated) {
		Pacote pacoteExists = pr.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Not Found"));
		pacoteExists.setDestino(pacoteUpdated.getDestino());

		return pr.save(pacoteExists);
	}

	@Override
	public void deleteById(Long id) {
		pr.deleteById(id);

	}


}
