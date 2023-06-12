package Library;

public class Livro extends Item{
	
	private String editora;
	private int numeroEdicao;
	
	
	public Livro(String titulo, String autor, int anoLivro, String genero,int numeroPaginas,String editora, int numeroEdicao) {
		super(titulo, autor, anoLivro, genero, numeroPaginas);
		this.editora = editora;
		this.numeroEdicao = numeroEdicao;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getNumeroEdicao() {
		return numeroEdicao;
	}


	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
	
}
