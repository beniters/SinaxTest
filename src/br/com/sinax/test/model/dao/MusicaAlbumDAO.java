package br.com.sinax.test.model.dao;

import br.com.sinax.test.model.dao.generic.GenericDAO;

public class MusicaAlbumDAO<T> extends GenericDAO<T> {

	public MusicaAlbumDAO(Class<T> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
/*	
	public void removeByIdMusica(Integer id){
		TypedQuery<MusicaAlbumEntity> query = em.createQuery("DELETE FROM MusicaAlbumEntity ma WHERE ma.idMusica = :id", MusicaAlbumEntity.class);
		query.setParameter("id", id.intValue()).executeUpdate();
	}
*/
}
