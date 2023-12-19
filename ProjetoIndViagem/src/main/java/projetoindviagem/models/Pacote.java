package projetoindviagem.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pacote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPacote;
	
	private String destino;
	
	private int preco;
	
	private LocalDate data;
	
	private String vagasDisp;
	
	private String descPacote;
	
	@Transient
	@OneToMany(mappedBy = "reservas" , cascade = {CascadeType.ALL})
	@JsonIgnore
	private Set<Reserva> reservas = new HashSet<>();

	

	public Long getIdPacote() {
		return idPacote;
	}

	public void setIdPacote(Long idPacote) {
		this.idPacote = idPacote;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getVagasDisp() {
		return vagasDisp;
	}

	public void setVagasDisp(String vagasDisp) {
		this.vagasDisp = vagasDisp;
	}

	public String getDescPacote() {
		return descPacote;
	}

	public void setDescPacote(String descPacote) {
		this.descPacote = descPacote;
	}

	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}
}
