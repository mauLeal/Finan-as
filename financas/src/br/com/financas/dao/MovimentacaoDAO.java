package br.com.financas.dao;

import java.awt.List;
import javax.persistence.EntityManager;

import br.com.financas.model.Movimentacao;
import br.com.financas.util.JPAUtil;

public class MovimentacaoDAO implements IMovimentacaoDAO{
	EntityManager em = new JPAUtil().getEntityManager();
	
	
	@Override
	public void inserir(Movimentacao m){
		em.getTransaction().begin();
		
		em.persist(m);
		
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void excluir(Movimentacao m) {
		em.getTransaction().begin();
		
		m = em.find(Movimentacao.class, m.getId());
		em.remove(m);
		
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void alterar(Movimentacao m) {
		em.getTransaction().begin();
		
		em.merge(m);
		
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movimentacao pesquisarID(int id) {
		em.getTransaction().begin();
		
		Movimentacao m = em.find(Movimentacao.class, id);
		
		em.getTransaction().commit();
		em.close();
		return m;
		
	}
}	
