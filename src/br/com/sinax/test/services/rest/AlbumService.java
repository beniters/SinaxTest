package br.com.sinax.test.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sinax.test.model.jpa.AlbumEntity;
import br.com.sinax.test.resources.general.impl.GeneralResouceImpl;

@Path("/album")
public class AlbumService extends GeneralResouceImpl<AlbumEntity> {
	
	public AlbumService() {
		super(AlbumEntity.class);
	}

	@GET @Path("/filter/{filter}") @Produces(MediaType.APPLICATION_JSON) 
	public AlbumEntity getByFilter(@PathParam("filter") String filter) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}
}
