package br.com.financas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
//	@ManyToMany
	//private List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();
	
	/**
	 * @return the movimentacoes
	 */
/*	
	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}
	/**
	 * @param movimentacoes the movimentacoes to set
	 */
//	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
//		this.movimentacoes = movimentacoes;
//	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
}
