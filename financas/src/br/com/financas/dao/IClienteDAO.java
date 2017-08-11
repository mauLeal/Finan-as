package br.com.financas.dao;

import java.util.List;

import br.com.financas.model.Cliente;

public interface IClienteDAO {
	void inserir(Cliente c);
	void excluir(Cliente c);
	Cliente pesquisarID(int id);
	List<Cliente> listar();
	Cliente pesquisarCPF(String cpf);
	boolean verificaDuplicidade(Cliente c);
	
}
