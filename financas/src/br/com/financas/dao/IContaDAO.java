package br.com.financas.dao;


import java.util.List;

import br.com.financas.model.Conta;

public interface IContaDAO {
	
	void inserir(Conta c);
	void excluir(Conta c);
	void alterar(Conta c);
	Conta pesquisarID(int id);
	List<Conta> listar();
	
}
