package projetoindviagem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import projetoindviagem.models.Pacote;

public interface PacoteRepository  extends JpaRepository<Pacote, Long>  {

}
