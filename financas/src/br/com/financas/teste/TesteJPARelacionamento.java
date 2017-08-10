package br.com.financas.teste;

import java.util.Calendar;

import br.com.financas.dao.ContaDAO;
import br.com.financas.dao.MovimentacaoDAO;
import br.com.financas.model.Conta;
import br.com.financas.model.Movimentacao;
import br.com.financas.util.TipoMovimentacal;

public class TesteJPARelacionamento {
	public static void main(String[] args) {
		MovimentacaoDAO mdao = new MovimentacaoDAO();
		ContaDAO cdao = new ContaDAO();
		
		Conta c = new Conta();
		c.setAgencia("0102");
		c.setBanco("Itaú");
		c.setNumero("1234");
		c.setTitular("Leonardo");
		
		Movimentacao m = new Movimentacao();
		m.setData(Calendar.getInstance());
		m.setDescricao("Churrascaria");
		m.setTipo(TipoMovimentacal.SAIDA);
		m.setValor(200d);
		m.setConta(c);
		
		cdao.inserir(c);
		mdao.inserir(m);
	}
}
