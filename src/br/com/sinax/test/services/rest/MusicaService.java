package br.com.sinax.test.services.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sinax.test.model.dao.generic.GenericDAO;
import br.com.sinax.test.model.jpa.AlbumEntity;
import br.com.sinax.test.model.jpa.MusicaEntity;
import br.com.sinax.test.model.jpa.PessoaEntity;
import br.com.sinax.test.resources.general.impl.GeneralResouceImpl;

@Path("/musica")
public class MusicaService extends GeneralResouceImpl<MusicaEntity> {
	
	public MusicaService() {
		super(MusicaEntity.class);
	}

	@GET @Path("/filter/{filter}") @Produces(MediaType.APPLICATION_JSON) 
	public MusicaEntity getByFilter(@PathParam("filter") String filter) {
		// TODO Auto-generated method stub
		return null;
	}
/*	
	@POST @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public MusicaEntity add(MusicaEntity entity) {
		GenericDAO<MusicaAlbumEntity> daoMusicaAlbum = GenericDAO.getInstance(MusicaAlbumEntity.class);
		daoMusicaAlbum.em.getTransaction().begin();
		List<AlbumEntity> albuns = entity.getAlbuns();
		for (AlbumEntity albumEntity : albuns) {
			MusicaAlbumEntity ma = new MusicaAlbumEntity();
			ma.setIdMusica(entity.getIdMusica());
			ma.setIdAlbum(albumEntity.getIdAlbum());
			GenericDAO.getInstance(MusicaAlbumEntity.class).insert(ma);
		}
 		return super.add(entity);
	}
*/	
/*
	@PUT @Produces(MediaType.APPLICATION_JSON) 
	@Override
	public MusicaEntity update(MusicaEntity entity) {
		MusicaAlbumDAO<MusicaAlbumEntity> daoMusicaAlbum = new MusicaAlbumDAO<MusicaAlbumEntity>(MusicaAlbumEntity.class);
		daoMusicaAlbum.em.getTransaction().begin();
		daoMusicaAlbum.removeByIdMusica(entity.getIdMusica());
		List<AlbumEntity> albuns = entity.getAlbuns();
		for (AlbumEntity albumEntity : albuns) {
			MusicaAlbumEntity ma = new MusicaAlbumEntity();
			ma.setIdMusica(entity.getIdMusica());
			ma.setIdAlbum(albumEntity.getIdAlbum());
			daoMusicaAlbum.update(ma);
		}
		return super.update(entity);
	}
*/	
/*
	@DELETE @Path("/deleteByEntity") 
	public void deleteByEntity(MusicaEntity entity) {
		GenericDAO<MusicaEntity> daoMusicaAlbum = GenericDAO.getInstance(MusicaEntity.class);
		daoMusicaAlbum.em.getTransaction().begin();
		for (AlbumEntity album : entity.getAlbuns()) {
			
		}
		for (PessoaEntity autor : entity.getAutores()) {
			
		}
		for (PessoaEntity genero : entity.getAutores()) {
			
		}
		daoMusicaAlbum.em.getTransaction().commit();
		super.delete(entity.getIdMusica());
	}
*/	
}
