package br.com.financas.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.financas.model.Conta;
import br.com.financas.util.JPAUtil;

public class ContaDAO implements IContaDAO {

	EntityManager em = new JPAUtil().getEntityManager();

	public void inserir(Conta c) {
		em.getTransaction().begin();

		em.persist(c);

		em.getTransaction().commit();
		em.close();

	}

	public void excluir(Conta c) {
		em.getTransaction().begin();

		c = em.find(Conta.class, c.getId());
		em.remove(c);

		em.getTransaction().commit();
		em.close();

	}

	public List<Conta> listar() {
		em.getTransaction().begin();
		String jpql = "SELECT C FROM CONTA C";
		
		Query query = em.createQuery(jpql); 
		List<Conta> contas = query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return contas;
	}

	public void alterar(Conta c) {
		em.getTransaction().begin();

		em.merge(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public Conta pesquisarID(int id) {
		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, id);

		em.getTransaction().commit();
		em.close();
		return conta;

	}
}
