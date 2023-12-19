package projetoindviagem.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import projetoindviagem.models.Cliente;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;

	private String name;

	private String contato;
	
	private LocalDate dataNasc;
	
	@Transient
	@OneToMany(mappedBy = "reservas" , cascade = {CascadeType.ALL})
	@JsonIgnore
	private Set<Reserva> reservas = new HashSet<>();
	
	
	public Long getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getContato() {
		return contato;
	}



	public void setContato(String contato) {
		this.contato = contato;
	}



	public LocalDate getDataNasc() {
		return dataNasc;
	}



	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}



	public Set<Reserva> getReservas() {
		return reservas;
	}



	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	
}
