package projetoindviagem.dto;

import java.time.LocalDate;

public class ReservaDTO {

	private String clienteNome;
	
	private String pacoteNome;
	
	private LocalDate dataReserva;
	
	private String statusReserva;
	
	
	public String getClienteNome() {
		return clienteNome;
	}
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	public String getPacoteNome() {
		return pacoteNome;
	}
	public void setPacoteNome(String pacoteNome) {
		this.pacoteNome = pacoteNome;
	}
	public LocalDate getDataReserva() {
		return dataReserva;
	}
	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}
	public String getStatusReserva() {
		return statusReserva;
	}
	public void setStatusReserva(String statusReserva) {
		this.statusReserva = statusReserva;
	}
}
