package Library;

import java.util.ArrayList;

public class Controle {

	private ArrayList<Item> livros = new ArrayList<>(); 
	private ArrayList<Pessoa> pessoa = new ArrayList<>();


    public void emprestar(String titulo, String nome) {
    	for(int i = 0; i<livros.size(); i++) {
    		if(livros.get(i).getTitulo().equalsIgnoreCase(titulo) && livros.get(i).getQuantidadeEstoque() > 0) {
    			for(int cont = 0; cont< pessoa.size(); cont++) {
    				if(pessoa.get(i).getNome().equalsIgnoreCase(nome)) {
    					if(pessoa.get(cont).getLivrosEmprestados() < 3) {
    				pessoa.get(cont).setLivrosEmprestados(pessoa.get(cont).getLivrosEmprestados() + 1);
    				livros.get(i).setQuantidadeEstoque(livros.get(i).getQuantidadeEstoque() - 1);
    				}else {
    					System.out.println("você atingiu o seu limite de emprestimos");
    					break;
    				}
    				
    			}else {
    				System.out.println("pessoa não encontrada");
    				break;
    			
    			}
    			}
    			
    		}else {
    			System.out.println("não há livro em estoque ");
    		}
    	}
    	
    }

    // Implementação do método devolver da interface Controle
  
    public void devolver(String titulo, String nome, int atraso) {
    	for(int i = 0; i<livros.size(); i++) {
    		if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
    			for(int cont = 0; cont< pessoa.size(); cont++) {
    				if(pessoa.get(i).getNome().equalsIgnoreCase(nome)) {
    					pessoa.get(i).setDiasAtraso(atraso);
    					if(pessoa.get(cont).getDiasAtraso() <= 1) {
    						pessoa.get(cont).setLivrosEmprestados(pessoa.get(cont).getLivrosEmprestados() - 1);
    						livros.get(i).setQuantidadeEstoque(livros.get(i).getQuantidadeEstoque() + 1);
    					}else {
    						System.out.println("Voce esta com livro atrasado");
    						break;
    					}
    				}else {
					System.out.println("Pessoa não encontrada");
					break;
    			}
    			}
    		}else {
    			System.out.println("Livro não encontrado");
    		}
    	}
    }


	public void adicionarLivro(Livro livro) {
		livros.add(livro);
		livro.setQuantidadeEstoque(livro.getQuantidadeEstoque() + 1);
		System.out.println("Livro adicionado ao estoque com sucesso");
		
	}


	public void adicionarArtigo(Artigo artigo) {
		livros.add(artigo);
		System.out.println("Artigo adicionado ao estoque com sucesso");
		
	}
	
	public void removerLivro(String titulo){
		for(int i = 0; i < livros.size(); i++ ) {
    		if(livros.get(i).getGenero() != "artigo"){
    			if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
    				livros.remove(i);
    				System.out.println("Livro excluido com sucesso");
    			}else {
    				System.out.println("Livro não encontrado");
    			}
    		}
    	}
		
	}
	public void removerArtigo(String titulo){
		for(int i = 0; i < livros.size(); i++ ) {
    		if(livros.get(i).getGenero().equalsIgnoreCase("artigo")){
    			if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
    				livros.remove(i);
    				System.out.println("Artigo excluido com sucesso");
    			}else {
    				System.out.println("Artigo não encontrado");
    			}
    		}
    	}
		
	}
	
	
	public void alterarLivro(String titulo, String tituloAtualizado, String autor, int ano) {
    	for(int i = 0; i < livros.size(); i++ ) {
    		if(livros.get(i).getGenero() != "artigo"){
    			if(livros.get(i).getTitulo().equals(titulo)) {
    				livros.get(i).setTitulo(tituloAtualizado);
    				livros.get(i).setAutor(autor);
    				livros.get(i).setAnoLivro(ano);
    				System.out.println("Livro alterado com sucesso");
    				
    				}else {
    					System.out.println("Livro não encontrado");
    				}
    			}
    		}
    	
    }
	
	public void alterAritgo(String titulo, String tituloAtualizado, String autor, int ano) {
		for(int i = 0; i < livros.size(); i++ ) {
			if(livros.get(i).getGenero().equalsIgnoreCase("artigo")){
						if(livros.get(i).getTitulo().equals(titulo)) {
							livros.get(i).setTitulo(tituloAtualizado);
							livros.get(i).setAutor(autor);
							livros.get(i).setAnoLivro(ano);
							System.out.println("Artigo alterado com sucesso");
							}else {
		    					System.out.println("Artigo não encontrado");
		    					}
			}	
		}
	}
	
	public void imprimeLivros () {
		for(int i = 0; i < livros.size(); i++) {
			System.out.println(livros.get(i).ToString());
		}
	}
	
	// ------------------------------------------------------------------
	
	
	public void multa(String nome) {
		for(int i = 0; i<pessoa.size(); i++) {
			if(pessoa.get(i).getNome().equalsIgnoreCase(nome)) {
			}
		}
	}
    
    public void AdicionarPessoa(Pessoa newpessoa) {
    	pessoa.add(newpessoa);
    	System.out.println(newpessoa.getNome() + " adicionado com sucesso");
    }
    

    
    public void alterarPessoa(String nome, String nomeAtualizado,String telefone, String email) {
    	for(int i = 0; i < pessoa.size(); i++ ) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.get(i).setNome(nomeAtualizado);
    			pessoa.get(i).setTelefone(telefone);
    			pessoa.get(i).setEmail(email);
    		}else {
    			System.out.println("emprestante não encontrado");
    		}
    	}
    	
    }
    
    public void removePessoa(String nome) {
    	for(int i = 0; i< pessoa.size(); i++) {
    		if(pessoa.get(i).getNome().equals(nome)) {
    			pessoa.remove(i);
    			System.out.println("Pessoa excluida com sucesso");
    		}else {
    			System.out.println("emprestante não encontrado");

    		}
    	}
    }

	public void imprimeCadastros() {
		for(int i = 0; i< pessoa.size(); i ++) {
			System.out.println(pessoa.get(i).ToString());
		}
		
	}
}
