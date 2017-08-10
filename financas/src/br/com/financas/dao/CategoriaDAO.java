package br.com.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.financas.model.Categoria;
import br.com.financas.util.JPAUtil;

public class CategoriaDAO implements ICategoriaDAO {
	EntityManager em = new JPAUtil().getEntityManager();

	@Override
	public void inserir(Categoria c) {
		em.getTransaction().begin();

		em.persist(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void excluir(Categoria c) {
		em.getTransaction().begin();

		c = em.find(Categoria.class, c.getId());
		em.remove(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void alterar(Categoria c) {
		em.getTransaction().begin();

		em.merge(c);

		em.getTransaction().commit();
		em.close();

	}

	@Override
	public Categoria pesquisarID(int id) {
		em.getTransaction().begin();

		Categoria categoria = em.find(Categoria.class, id);

		em.getTransaction().commit();
		em.close();
		return categoria;
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
