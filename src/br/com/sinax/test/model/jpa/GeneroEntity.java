package br.com.sinax.test.model.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	name="TB0002_GENERO", 
		uniqueConstraints=@UniqueConstraint(columnNames={"TB0002_NOME_GENERO"})
)
public class GeneroEntity{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TB0002_ID_GENERO")
	private int idGenero; 
	
	@Column(name="TB0002_NOME_GENERO")
	private String nomeGenero;
	
	/*@OneToMany
	@JoinColumn(name="TB0001_ID_MUSICA")
	public List<MusicaEntity> musicas;*/

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getNomeGenero() {
		return nomeGenero;
	}

	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
/*
	public List<MusicaEntity> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<MusicaEntity> musicas) {
		this.musicas = musicas;
	}
*/
}
