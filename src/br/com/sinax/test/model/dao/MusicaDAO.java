package br.com.sinax.test.model.dao;

import br.com.sinax.test.model.dao.generic.GenericDAO;
import br.com.sinax.test.model.jpa.MusicaEntity;

public class MusicaDAO<T extends MusicaEntity> extends GenericDAO<T> {

	public MusicaDAO(Class<T> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	public void delete(T entity){
		em.getTransaction().begin();
		
		entity.getAlbuns().removeAll(entity.getAlbuns());
		entity.getAutores().removeAll(entity.getAutores());
		
		em.persist(entity);
		em.remove(entity);
		
		em.getTransaction().commit();

	}
}
