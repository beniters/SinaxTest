package br.com.sinax.test.model.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	name="TB0001_MUSICA", 
		uniqueConstraints=@UniqueConstraint(columnNames={"TB0001_NOME_MUSICA"})
)
public class MusicaEntity{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TB0001_ID_MUSICA")
	private int idMusica; 

	@Column(name="TB0001_FAIXA_MUSICA")
	private String faixaMusica;
	
	@Column(name="TB0001_NOME_MUSICA")
	private String nomeMusica;
	
	@Column(name="TB0001_DURACAO")
	private String duracaoMusica;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="TB0002_ID_GENERO")
	private GeneroEntity genero; 

	@ManyToMany (mappedBy = "musicas", fetch = FetchType.EAGER)
	private List<AlbumEntity> albuns; 
	
	@ManyToMany (mappedBy = "musicas", fetch = FetchType.EAGER)
	private List<PessoaEntity> autores;
	
	public int getIdMusica() {
		return idMusica;
	}

	public void setIdMusica(int idMusica) {
		this.idMusica = idMusica;
	}

	public String getFaixaMusica() {
		return faixaMusica;
	}

	public void setFaixaMusica(String faixaMusica) {
		this.faixaMusica = faixaMusica;
	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}

	public String getDuracaoMusica() {
		return duracaoMusica;
	}

	public void setDuracaoMusica(String duracaoMusica) {
		this.duracaoMusica = duracaoMusica;
	}

	public GeneroEntity getGenero() {
		return genero;
	}

	public void setGenero(GeneroEntity genero) {
		this.genero = genero;
	}

	public List<AlbumEntity> getAlbuns() {
		return albuns;
	}

	public void setAlbuns(List<AlbumEntity> albuns) {
		this.albuns = albuns;
	}

	public List<PessoaEntity> getAutores() {
		return autores;
	}

	public void setAutores(List<PessoaEntity> autores) {
		this.autores = autores;
	}
}
