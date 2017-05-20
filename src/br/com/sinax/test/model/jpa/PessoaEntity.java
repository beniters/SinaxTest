package br.com.sinax.test.model.jpa;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(	name="TB0003_PESSOA", 
		uniqueConstraints=@UniqueConstraint(columnNames={"TB0003_NOME_PESSOA"})
)
public class PessoaEntity{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TB0003_ID_PESSOA")
	private int idPessoa; 
	
	@Column(name="TB0003_NOME_PESSOA")
	private String nomePessoa;
	
	// por padrão o fecth é LAZY
	@ManyToMany
	@JoinTable(name="TB0006_AUTORIA_MUSICA_PESSOA", joinColumns = @JoinColumn(name = "TB0001_ID_MUSICA"), inverseJoinColumns = @JoinColumn(name = "TB0003_ID_PESSOA"))
	private List<MusicaEntity> musicas;
	
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public List<MusicaEntity> getMusicas() {
		return musicas;
	}

	public void setMusicas(List<MusicaEntity> musicas) {
		this.musicas = musicas;
	}
	
}
