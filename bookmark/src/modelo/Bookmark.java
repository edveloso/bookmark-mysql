package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bookmark {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="user")
	private String usuario;
	
	private String url;
	
	private String descricao;
	
	public Bookmark() {
		
	}

	public Bookmark(String usuario, String descricao, int id) {
		this.usuario = usuario;
		this.descricao = descricao;
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
