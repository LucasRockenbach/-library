package Library;

public class Artigo extends Item implements Multa {
	
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

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	@Override
	public double calcularMulta(Pessoa atraso) {
		double multa = atraso.getDiasAtraso() * 0.20;
		return multa;
	}
	
	
	
	
	
	
	
	
	
	
	

}
