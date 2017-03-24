package model;

public class Obra {
	
	String nomeArtista,
			tituloObra,
			categoria,
			tipoObra,
			data;

	public Obra(String nomeArtista, String tituloObra, String categoria, String tipoObra, String data) {
		super();
		this.nomeArtista = nomeArtista;
		this.tituloObra = tituloObra;
		this.categoria = categoria;
		this.tipoObra = tipoObra;
		this.data = data;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public String getTituloObra() {
		return tituloObra;
	}

	public void setTituloObra(String tituloObra) {
		this.tituloObra = tituloObra;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipoObra() {
		return tipoObra;
	}

	public void setTipoObra(String tipoObra) {
		this.tipoObra = tipoObra;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
