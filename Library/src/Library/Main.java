package Library;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Inserir Livro");
            System.out.println("2. Inserir Artigo");
            System.out.println("3. Inserir pessoa");
            System.out.println("4. Editar pessoa");
            System.out.println("5. Editar Artigo");
            System.out.println("6. Editar Livro");
            System.out.println("7. Emprestar Livro");
            System.out.println("8. Emprestar Artigo");
            //
            System.out.println("7. Devolver Livro");
            System.out.println("8. Excluir Livro");
            System.out.println("9. Excluir Usuário");
            System.out.println("10. Exibir Livros da Biblioteca");
            System.out.println("11. Exibir Usuários");
            System.out.println("12. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();
        
        
        
        switch (opcao) {
        case 1:
            System.out.print("Digite o título do livro: ");
            String tituloLivro = input.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autorLivro = input.nextLine();
            System.out.print("Digite o ano do livro: ");
            int anoLivro = input.nextInt();
            System.out.print("Digite a editora do livro: ");
            String editora = input.nextLine();
            System.out.print("Digite o genero do livro: ");
            String genero = input.nextLine();
            System.out.print("Digite o numero de paginas do livro: ");
            int paginas = input.nextInt();
            System.out.print("Digite o numero da edição do livro: ");
            int edicao = input.nextInt();
            Livro livro = new Livro(tituloLivro, autorLivro, anoLivro, genero, paginas, editora, edicao);
            estoque.adicionarLivro(livro);


            
            break;
        case 2:
            System.out.print("Digite o título do Artigo: ");
            String tituloArtigo = input.nextLine();
            System.out.print("Digite o autor do Artigo: ");
            String autorArtigo = input.nextLine();
            System.out.print("Digite o ano do Artigo: ");
            int anoArtigo = input.nextInt();
            System.out.print("Digite o genero ");
            String generoArtigo = input.nextLine();
            System.out.print("Digite o numero de paginas do Artigo: ");
            int paginasArtigo = input.nextInt();
            System.out.print("Digite a universidade que publicou o Artigo: ");
            String universidade = input.next();
            System.out.print("Digite o do orientador do Artigo: ");
            String orientador = input.next();
            Artigo artigo = new Artigo(tituloArtigo, autorArtigo, anoLivro, generoArtigo, paginasArtigo, universidade, orientador);
            estoque.adicionarArtigo(artigo);


            
            break;
        case 3:
            System.out.print("Digite o nome da pessoa: ");
            String nome = input.nextLine();
            System.out.print("Digite o cpf da pessoa: ");
            String cpf = input.nextLine();
            System.out.print("Digite o telefone da pessoa: ");
            String telefone = input.nextLine();
            System.out.print("Digite o e-mail da pessoa ");
            String email= input.nextLine();
            Pessoa pessoa = new Pessoa(nome, cpf, telefone, email);
            cadastro.AdicionarPessoa(pessoa);
            break;
        case 4:
        	System.out.println("digite o nome da pessoa que deseja alterar");
        	nome = input.nextLine();
        	System.out.print("Digite o nome da pessoa: ");
            String nomeAtualizado = input.nextLine();
            System.out.print("Digite o telefone da pessoa: ");
            telefone = input.nextLine();
            System.out.print("Digite o e-mail da pessoa ");
            email= input.nextLine();
        	cadastro.alterarPessoa(nomeAtualizado, nome, telefone, email);
        	
        case 5:
        	System.out.println("digite o titulo do livro que deseja alterar");
        	String titulo = input.nextLine();
        	System.out.println("digite o novo titulo do livro ");
        	tituloLivro = input.nextLine();
        	System.out.println("digite o novo autor do livro ");
        	autorLivro = input.nextLine();
        	System.out.println("digite o novo ano do livro ");
        	anoLivro = input.nextInt();
        	estoque.alterarLivro(titulo, nomeAtualizado, autorArtigo, anoArtigo);
        	


        	

        	
        case 12:
            System.out.print("Saindo... ");
            break;
            default:
                System.out.print("Opção invalida");
                break;



            
        
        }
        }
 
        while(opcao != 11);
        
        
        

       /* Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");

        PessoaDoa pd1 = new PessoaDoa(null, "maria", "5555555", "1111111", "maria@gmail.com");
        
        PessoaEmpresta pe1 = new PessoaEmpresta(0, null, "pedro", "000000000", "454545", "LucasRockenbach@gmail.com");
        PessoaEmpresta pe2 = new PessoaEmpresta(0, null, "alvaro", "123456789", "14789", "alvaro@gmail.com");
        
        cadastro.AdicionarDoador(pd1);
        cadastro.AdicionarEmpresta(pe2);

        estoque.emprestar(livro1, pe1);
       
        estoque.doar(livro2, pd1);
        estoque.doar(livro1, pd1);
        
        estoque.emprestar(livro2, pe2);
        

        cadastro.pagarMulta(pe2);
    }
}*/