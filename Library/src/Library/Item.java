package Library;

public class Item {
    private String titulo;
    private String autor;
    private int anoLivro;
    private String genero;
    private int numeroPaginas;
    private int quantidadeEstoque;
    private boolean emprestado = false;

    

    public Item(String titulo, String autor, int anoLivro, String genero, int numeroPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoLivro = anoLivro;
		this.genero = genero;
		this.numeroPaginas = numeroPaginas;
		this.quantidadeEstoque = 1;
		this.emprestado = false;
	}
    
    public Item() {
    	
    }

	// Getters e setters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    // é necessario colocar um set ja que autor e titulo nao mudam?

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

	public int getAnoLivro() {
		return anoLivro;
	}

	public void setAnoLivro(int anoLivro) {
		this.anoLivro = anoLivro;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	

	
    
    
}