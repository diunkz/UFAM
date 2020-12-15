package base;

public class Eleitor {
	private int id;
	private String nome;
	private int titulo;
	
	public Eleitor() {	
	}
	
	public Eleitor(String nome, int titulo) {
		this.nome = nome;
		this.titulo = titulo;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTitulo() {
		return this.titulo;
	}

	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}	
	
}