package Library;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Item> livros = new ArrayList<>();    
	private int contadorDias;
    private int Atraso;

	public void doar(Item livro, Pessoa doador) {
        livros.add(livro);
        System.out.println("Livro doado: " + livro.getTitulo() + "livro doado por " + doador.getNome());
    }

 
    /*public void emprestar(String genero, String autor, ) {
    	
    	for(int i = 0; i<livros.size(); i++) {
    		if(livros.get(i).getGenero().equalsIgnoreCase(genero) && livros.get(i).getAutor().equalsIgnoreCase(autor) && livros.get(i).getQuantidadeEstoque() > 0){
    			for(int i; )
    		}
    		
    	}*/
    	
    	
        /*if (livro.getQuantidadeEstoque() == 0) {
            System.out.println("Livro já emprestado.");
        } else {
        	if(empresta.getLivrosEmprestados() >= 3) {
        		System.out.println("voce atingiu seu limite de livros emrpestados");
        	}else {
        		 livro.setEmprestado(true);
                 empresta.setLivrosEmprestados(empresta.getLivrosEmprestados() + 1);
             	System.out.println("Livro emprestado: " + livro.getTitulo() + " - Empréstimo para: " + empresta.getNome());
        	}
           
        }
    }*/

    // Implementação do método devolver da interface Controle
  
    public void devolver(Item livro, Pessoa empresta) {
        if (!livro.isEmprestado()) {
            System.out.println("Livro não estava emprestado.");
        } else {
            livro.setEmprestado(false);
            Atraso = contadorDias - 7; // Verifica se houve atraso na devolução
        }
            if (Atraso > 0) {
                int multa = Atraso * 2; // Cada dia de atraso tem multa de R$ 2
                empresta.setMulta(empresta.getMulta() + multa);
                System.out.println("Livro devolvido com atraso de " + Atraso + " dias. Multa aplicada: R$ " + multa);
            } else {
                System.out.println("Livro devolvido: " + livro.getTitulo() + " - Devolvido por: " + empresta.getNome());
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
	
	public void imprime () {
		for(int i = 0; i < livros.size(); i++) {
			System.out.println(livros.get(i).ToString());
		}
	}
    



}
