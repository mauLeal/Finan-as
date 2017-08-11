package br.com.financas.teste;

import br.com.financas.dao.ClienteDAO;
import br.com.financas.model.Cliente;

public class TesteJPQL {
	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		Cliente c = dao.pesquisarCPF("704205332-09");
		boolean flag = dao.verificaDuplicidade(c);
		
		System.out.println("TRUE"+flag);
	}
}
