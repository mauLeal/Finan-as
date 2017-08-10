package br.com.financas.teste;

import br.com.financas.dao.ContaDAO;
import br.com.financas.dao.IContaDAO;
import br.com.financas.model.Conta;

public class TesteDAO {

	public static void main(String[] args) {
		//Instancia de dao utilizando conceito de generics
		IContaDAO dao = new ContaDAO();
		Conta c = new Conta();
		c.setTitular("Mauricio Leal");
		c.setNumero("66666-6");
		c.setBanco("497 - Caixa Economica");
		c.setAgencia("666");
		
		dao.inserir(c);
	}
	
	
}
