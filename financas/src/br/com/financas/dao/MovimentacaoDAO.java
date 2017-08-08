package br.com.financas.dao;

import java.awt.List;
import javax.persistence.EntityManager;
import br.com.financas.modelo.Movimentacao;
import br.com.financas.util.JPAUtil;

public class MovimentacaoDAO implements IMovimentacaoDAO{
	
	@Override
	public void inserir(Movimentacao m){
		JPAUtil jpa = new JPAUtil();
		EntityManager em =  jpa.getEntityManager();

		em.getTransaction().begin();
		em.persist(m);
		em.getTransaction().commit();
		
		em.close();
	}

	@Override
	public void excluir(Movimentacao m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Movimentacao m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}
}	
