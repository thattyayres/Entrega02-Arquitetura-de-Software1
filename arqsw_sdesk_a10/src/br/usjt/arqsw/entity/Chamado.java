package br.usjt.arqsw.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Chamado {

	@NotNull
	private int id_chamado;
	
	@NotNull
	@Size(min=5, max=45, message="Insera uma descricao")
	private String descricao;
	@NotNull
	@Size(min=5, max=45, message="Informe um status")
	private String status;
	@NotNull
	private Date dt_abertura;
	@NotNull
	private Date dt_fechamento;
	@NotNull
	private Fila fila;
	
	public int getId_chamado() {
		return id_chamado;
	}
	public void setId_chamado(int id_chamado) {
		this.id_chamado = id_chamado;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDt_abertura() {
		return dt_abertura;
	}
	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura = dt_abertura;
	}
	public Date getDt_fechamento() {
		return dt_fechamento;
	}
	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	
	

}
