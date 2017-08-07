package br.com.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.financas.modelo.Conta;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.setAgencia("123");
		c.setBanco("Caixa Economica");
		c.setTitular("Kakaroto");
		c.setNumero("456");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
}
