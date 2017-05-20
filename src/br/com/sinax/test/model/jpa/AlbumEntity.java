package br.com.sinax.test.model.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	name="TB0004_ALBUM", 
		uniqueConstraints=@UniqueConstraint(columnNames={"TB0004_NOME_ALBUM"})
)
public class AlbumEntity{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TB0004_ID_ALBUM")
	private int idAlbum; 
	
	@Column(name="TB0004_NOME_ALBUM")
	private String nomeAlbum;
	
	@ManyToMany (mappedBy = "albuns", fetch = FetchType.LAZY)
	private List<MusicaEntity> musicas;

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNomeAlbum() {
		return nomeAlbum;
	}

	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}

	public List<MusicaEntity> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<MusicaEntity> musicas) {
		this.musicas = musicas;
	}

}
