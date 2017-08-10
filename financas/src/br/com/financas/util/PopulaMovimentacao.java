package br.com.financas.util;

import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.financas.dao.ContaDAO;
import br.com.financas.dao.MovimentacaoDAO;
import br.com.financas.model.Categoria;
import br.com.financas.model.Conta;
import br.com.financas.model.Movimentacao;

public class PopulaMovimentacao {
	
	public static void main(String[] args) {
		//Instancias
		Conta c1 = new ContaDAO().pesquisarID(1);
		Categoria cat1 = new Categoria();
		Categoria cat2 = new Categoria();
		Movimentacao m1 = new Movimentacao();
		//
		
		//Persistencias de uma nova tabela no bd
		cat1.setNome("Viagem");
		cat2.setNome("Négocios");
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cat1);
		em.persist(cat2);
		
		
		em.getTransaction().commit();
		em.close();
		//
		
		
		m1.setConta(c1);
		m1.setValor(100d);
		m1.setData(Calendar.getInstance());
		m1.setTipo(TipoMovimentacal.ENTRADA);
		m1.setDescricao("Viagem a sp");
		m1.setCategorias(Arrays.asList(cat1,cat2));
		
		new MovimentacaoDAO().inserir(m1);
	}
}

