package br.com.sinax.test.services.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.sinax.test.model.dao.MusicaDAO;
import br.com.sinax.test.model.jpa.MusicaEntity;
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
	@DELETE @Path("/deleteByEntity") 
	public void deleteByEntity(MusicaEntity entity) {
		MusicaDAO<MusicaEntity> daoMusica = new MusicaDAO<MusicaEntity>(MusicaEntity.class);
		daoMusica.delete(entity);
	}
}
