package Library;

public class Artigo extends Item {
	
	private String universidade;
	private String orientador;
	
	
	public Artigo(String titulo, String autor, int anoLivro, String genero,int numeroPagina, String universidade,
			String orientador) {
		super(titulo, autor, anoLivro, genero, numeroPagina);
		this.universidade = universidade;
		this.orientador = orientador;
	}
	
	public Artigo() {
		
	}

	public String getUniversidade() {
		return universidade;
	}

	public String getOrientador() {
		return orientador;
	}
	
	
	
	
	
	
	
	
	

}
