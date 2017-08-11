package br.com.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.financas.model.Cliente;
import br.com.financas.util.JPAUtil;

public class ClienteDAO implements IClienteDAO {
	EntityManager em = new JPAUtil().getEntityManager();

	@Override
	public void inserir(Cliente c) {
		em.getTransaction().begin();

		em.persist(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void excluir(Cliente c) {
		em.getTransaction().begin();

		em.remove(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public Cliente pesquisarID(int id) {
		em.getTransaction().begin();

		Cliente c = em.find(Cliente.class, id);
		
		em.getTransaction().commit();
		em.close();
		
		return c;
		
	}
	
	@Override
	public Cliente pesquisarCPF(String cpf){
		em.getTransaction().begin();
		
		Query query = em.createQuery("select c from Cliente c where c.cpf = :pCpf");
		Query setParameter = query.setParameter("pCpf", cpf);
		Cliente c = (Cliente) setParameter.getSingleResult();
		
		em.getTransaction().commit();
		em.close();
		
		return c;
		
	}
	
	@Override
	public boolean verificaDuplicidade(Cliente c){
		em.getTransaction().begin();
		
		Query query = em.createQuery("select c from Cliente c where c.cpf = :pCpf");
		Query setParameter = query.setParameter("pCpf", c.getCpf());
		Cliente cliente = (Cliente) setParameter.getSingleResult();
		
		em.getTransaction().commit();
		em.close();
		
		return true;
	
	}

	@Override
	public List<Cliente> listar() {
		em.getTransaction().begin();
		
		Query query = em.createQuery("select c from Cliente c");
		List<Cliente> lista = query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return lista;
		
	}
}
