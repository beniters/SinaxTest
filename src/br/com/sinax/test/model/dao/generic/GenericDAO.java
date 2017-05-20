package br.com.sinax.test.model.dao.generic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class GenericDAO<T> {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SinaxTestJPA");
	public EntityManager em = emf.createEntityManager();
	private final Class<T> entityClass;
	
	public GenericDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public List<T> getAll() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(this.entityClass);
		Root<T> meta = cq.from(this.entityClass);
		meta.getFetches();
		CriteriaQuery<T> all = cq.select(meta);
//		SingularAttribute<? super T, T> id = meta.getModel().getId(this.entityClass);
//		cq.orderBy(cb.asc(meta.get(id.getName())));
		TypedQuery<T> allQuery = em.createQuery(all);
//		try {
//			Class.forName(entityClass.getName());
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		List<T> resultList = allQuery.getResultList();
//		for (T t : resultList) {
//			JSONObject j = new JSONObject(t);
//			System.out.println(j);
//		}
		return resultList;
	}
	
	public T getById(Integer id){
		return em.find(entityClass, id);
	}
	
	public T insert(T entity){
		if(!em.getTransaction().isActive())
			em.getTransaction().begin();
		
		em.persist(entity);
		em.getTransaction().commit();
		return entity;
	}
	
	public T update(T entity){
		if(!em.getTransaction().isActive())
			em.getTransaction().begin();
		
		em.merge(entity);
		em.getTransaction().commit();
		return entity;
	}
	
	public void remove(T entity){
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}
	
	public void removeById(Integer id){
		em.getTransaction().begin();
		T entity = this.getById(id);
		em.remove(entity);
		em.getTransaction().commit();
	}
	
	public static <F> GenericDAO<F> getInstance(Class<F> entityClass){
		return new GenericDAO<F>(entityClass);
	}
}
