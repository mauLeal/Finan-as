package br.com.financas.dao;

import java.util.List;

import br.com.financas.model.Movimentacao;

public interface IMovimentacaoDAO {
	void inserir(Movimentacao m);
	void excluir(Movimentacao m);
	void alterar(Movimentacao m);
	Movimentacao pesquisarID(int id);
	List<Movimentacao> listar();
	
}
