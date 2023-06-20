package Library;

import java.util.ArrayList;

public class Estoque implements Controle {
	
	private ArrayList<Item> livros = new ArrayList<>();    
	private int contadorDias;
    private int Atraso;

	public void doar(Item livro, Pessoa doador) {
        livros.add(livro);
        System.out.println("Livro doado: " + livro.getTitulo() + "livro doado por " + doador.getNome());
    }

    // Implementação do método emprestar da interface Controle
    @Override
    public void emprestar(Item livro, Pessoa empresta) {
        if (livro.isEmprestado()) {
            System.out.println("Livro já emprestado.");
        } else {
            livro.setEmprestado(true);
            System.out.println("Livro emprestado: " + livro.getTitulo() + " - Empréstimo para: " + empresta.getNome());
        }
    }

    // Implementação do método devolver da interface Controle
    @Override
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

	@Override
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
		
	}

	@Override
	public void adicionarArtigo(Artigo artigo) {
		livros.add(artigo);
		
	}
	
	
	public void alterarLivro(String titulo, String tituloAtualizado, String autor, int ano) {
    	for(int i = 0; i < livros.size(); i++ ) {
    		if(livros.get(i).getTitulo().equals(titulo)) {
    			livros.get(i).setTitulo(tituloAtualizado);
    			livros.get(i).setAutor(autor);
    			livros.get(i).setAnoLivro(ano);
    		}else {
    			System.out.println("emprestante não encontrado");
    		}
    	}
    	
    }



}
