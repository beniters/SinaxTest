package br.com.sinax.test.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sinax.test.model.jpa.GeneroEntity;
import br.com.sinax.test.model.jpa.MusicaEntity;
import br.com.sinax.test.resources.general.impl.GeneralResouceImpl;

@Path("/genero")
public class GeneroService extends GeneralResouceImpl<GeneroEntity> {
	
	public GeneroService() {
		super(GeneroEntity.class);
	}

	@GET @Path("/filter/{filter}") @Produces(MediaType.APPLICATION_JSON) 
	public MusicaEntity getByFilter(@PathParam("filter") String filter) {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	@GET @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public List<MusicaEntity> getAll() {
		List<MusicaEntity> musicas = new ArrayList<MusicaEntity>();
		MusicaEntity m1 = new MusicaEntity();
		m1.setIdMusica(1);
		m1.setNomeMusica("Não deixe o samba morrer");
		
		MusicaEntity m2 = new MusicaEntity();
		m2.setIdMusica(2);
		m2.setNomeMusica("Malandramente");
		
		MusicaEntity m3 = new MusicaEntity();
		m3.setIdMusica(3);
		m3.setNomeMusica("Malandragem");
		
		musicas.add(m1);
		musicas.add(m2);
		musicas.add(m3);
		
		return musicas;
	}
	
	@GET @Path("one") @Produces(MediaType.APPLICATION_JSON) 
	public MusicaEntity getOne() {
		MusicaEntity m1 = new MusicaEntity();
		m1.setIdMusica(1);
		m1.setNomeMusica("Não deixe o samba morrer");
		
		return m1;
	}
	*/
	
}
