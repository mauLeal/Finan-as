package br.com.financas.dao;

import java.util.List;

import br.com.financas.model.Categoria;

public interface ICategoriaDAO {
	
	void inserir(Categoria c);
	void excluir(Categoria c);
	void alterar(Categoria c);
	Categoria pesquisarID(int id);
	List<Categoria> listar();
}
