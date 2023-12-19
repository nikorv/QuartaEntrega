package projetoindviagem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
import projetoindviagem.models.Reserva;

@Repository
public interface ReservaRepository  extends JpaRepository<Reserva, Long> {

	@Transactional
	@Modifying
	@Query(nativeQuery= true, value= "INSERT INTO reserva_cliente (reserva_id, cliente_id) VALUES (:reservaId, :clienteId)")
	void addRelationship(@Param("reservaId") Long reservaId, @Param("clienteId") Long clienteId);
	
	@Query(nativeQuery= true, 
			value = "SELECT DISTINCT r.reserva_name, c.cliente_name "
			+ " FROM reserva_cliente as rc"
			+ " INNER JOIN reserva as r"
			+ " ON r.id = rs.reserva_id"
			+ " INNER JOIN cliente as c"
			+ " ON c.id = cs.student_id"
			)
	List<Object> findAllRels();
	
	
	
	
	
}
