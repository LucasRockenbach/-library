package Library;

public class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private int livrosEmprestados;
	private double multa = 0;
	private int diasAtraso = 0;
	
	
	
	
	
	public Pessoa(String nome, String cpf, String telefone, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.multa = 0;
	}
	
	public String ToString() {
		return "nome: " + this.getNome() + " cpf: " + this.getCpf() + " telefone: " + this.getTelefone()
		+ " email: " + this.getEmail() + " livros emprestados: " + this.getLivrosEmprestados();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getLivrosDoados() {
		return livrosDoados;
	}
	public void setLivrosDoados(int livrosDoados) {
		this.livrosDoados = livrosDoados;
	}
	public double getMulta() {
		return multa;
	}
	public void setMulta(double multa) {
		this.multa = multa;
	}
	public int getLivrosEmprestados() {
		return livrosEmprestados;
	}
	public void setLivrosEmprestados(int livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	public int getDiasAtraso() {
		return diasAtraso;
	}

	public void setDiasAtraso(int diasAtraso) {
		this.diasAtraso = diasAtraso;
	}
	private int livrosDoados = 0;
	
	
	
	
	
	
}
