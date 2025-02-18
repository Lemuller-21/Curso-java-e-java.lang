package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Leonardo M�ller
 * 
 * @version 16.0.1
 */

public class Cliente {
	String nome;
	String cpf;
	String profissao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
}
