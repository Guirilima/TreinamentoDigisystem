package com.cadastramento.cadastramento.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Criando Entidade BD
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	//Irá gerar automaticamente um código do tipo long
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long codigo;
	
	private String nome;
	private String localizacao;
	private String cnpj;
	private String qtd;
	
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getQtd() {
		return qtd;
	}
	public void setQtd(String qtd) {
		this.qtd = qtd;
	}
}
