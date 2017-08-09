package br.com.financas.dao;

import java.awt.List;

import javax.persistence.EntityManager;

import br.com.financas.modelo.Conta;
import br.com.financas.util.JPAUtil;

public class ContaDAO implements IContaDAO{
	
	EntityManager em = new JPAUtil().getEntityManager();
	
	public void inserir(Conta c){
		em.getTransaction().begin();
		
		em.persist(c);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void excluir(Conta c){
		em.getTransaction().begin();
		
		c = em.find(Conta.class, c.getId());
		em.remove(c);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List listar(){
		
		return new List();
	}
	
	public void alterar(Conta c){
		em.getTransaction().begin();
		
		em.merge(c);
		
		em.getTransaction().commit();
		em.close();
		
	}
	@Override
	public Conta pesquisarID(int id){
		em.getTransaction().begin();
		
		Conta conta = em.find(Conta.class, id);
		
		em.getTransaction().commit();
		em.close();
		return conta;
		
	}
}
