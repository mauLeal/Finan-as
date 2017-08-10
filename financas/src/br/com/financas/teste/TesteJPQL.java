package br.com.financas.teste;

import java.util.List;

import br.com.financas.dao.ContaDAO;
import br.com.financas.model.Conta;

public class TesteJPQL {
	public static void main(String[] args) {
		List<Conta> sasoa = new ContaDAO().listar();
		for (Conta c : sasoa) {
			System.out.println(c.getTitular());
		}
	}

}
