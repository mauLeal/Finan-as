package br.com.financas.dao;

import java.awt.List;

import br.com.financas.modelo.Conta;

public interface IContaDAO {
	
	void inserir(Conta c);
	void excluir(Conta c);
	void alterar(Conta c);
	Conta pesquisarID(int id);
	List listar();
	
}
