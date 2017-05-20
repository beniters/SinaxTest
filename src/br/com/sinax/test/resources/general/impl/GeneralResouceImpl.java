package br.com.sinax.test.resources.general.impl;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sinax.test.model.dao.generic.GenericDAO;
import br.com.sinax.test.resources.general.GeneralResource;

public abstract class GeneralResouceImpl<T> implements GeneralResource<T> {
	
	public final Class<T> entityClass;
	
	public GeneralResouceImpl(Class<T> entityClass) {
		this.entityClass= entityClass;
	}

	@GET @Path("/{id}") @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public T getById(@PathParam("id") Integer id) {
		return GenericDAO.getInstance(entityClass).getById(id);
	}

	@GET @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public List<T> getAll() {
		return GenericDAO.getInstance(entityClass).getAll();
	}

	@POST @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public T add(T entity) {
		return GenericDAO.getInstance(entityClass).insert(entity);
	}

	@DELETE @Path("/delete/{id}") @Produces(MediaType.APPLICATION_JSON)
	@Override
	public void delete(@PathParam("id") Integer id) {
		GenericDAO.getInstance(entityClass).removeById(id);
	}

	@PUT @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public T update(T entity) {
		return GenericDAO.getInstance(entityClass).update(entity);
	}

}
