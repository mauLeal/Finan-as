package br.com.financas.dao;

import java.awt.List;

import javax.persistence.EntityManager;

import br.com.financas.modelo.Conta;
import br.com.financas.util.JPAUtil;

public class ContaDAO implements IContaDAO{
	
	
	public void inserir(Conta c){
		JPAUtil jpa = new JPAUtil();
		EntityManager em =  jpa.getEntityManager();

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
	}
	
	public void excluir(Conta c){
		
	}
	
	public List listar(){
		return new List();
	}
	
	public void alterar(Conta c){
		
	}
		
}
