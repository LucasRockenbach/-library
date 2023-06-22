package Library;

import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);
        
        
        	int opcao = 0;
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Inserir Livro"); // check
            System.out.println("2. Inserir Artigo"); // check
            System.out.println("3. Inserir pessoa"); // check
            System.out.println("4. Editar pessoa");
            System.out.println("5. Editar Livro");
            System.out.println("6. Editar Artigo");
            System.out.println("7. Emprestar Livro");
            System.out.println("8. Emprestar Artigo");
            //
            System.out.println("7. Devolver Livro");
            System.out.println("8. Excluir Livro");//check
            System.out.println("9. Excluir Artigo");//check
            System.out.println("10. Excluir Usuário");// check
            System.out.println("11. Exibir Livros da Biblioteca"); // check
            System.out.println("12. Exibir Usuários"); // check
            System.out.println("13. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
        
        
        
        switch (opcao) {
        case 1:
            System.out.print("Digite o título do livro: ");
            String tituloLivro = input.next();
            System.out.print("Digite o autor do livro: ");
            String autorLivro = input.next();
            System.out.print("Digite o ano do livro: ");
            int anoLivro = input.nextInt();
            System.out.print("Digite a editora do livro: ");
            String editora = input.next();
            System.out.print("Digite o genero do livro: ");
            String genero = input.next();
            System.out.print("Digite o numero de paginas do livro: ");
            int paginas = input.nextInt();
            System.out.print("Digite o numero da edição do livro: ");
            int edicao = input.nextInt();
            Livro livro = new Livro(tituloLivro, autorLivro, anoLivro, genero, paginas, editora, edicao);
            estoque.adicionarLivro(livro);
            livro.toString();


            
            break;
        case 2:
            System.out.print("Digite o título do Artigo: ");
            String tituloArtigo = input.next();
            System.out.print("Digite o autor do Artigo: ");
            String autorArtigo = input.next();
            System.out.print("Digite o ano do Artigo: ");
            int anoArtigo = input.nextInt();
            System.out.print("Digite o genero ");
            String generoArtigo = input.next();
            System.out.print("Digite o numero de paginas do Artigo: ");
            int paginasArtigo = input.nextInt();
            System.out.print("Digite a universidade que publicou o Artigo: ");
            String universidade = input.next();
            System.out.print("Digite o do orientador do Artigo: ");
            String orientador = input.next();
            Artigo artigo = new Artigo(tituloArtigo, autorArtigo, anoArtigo, generoArtigo, paginasArtigo, universidade, orientador);
            estoque.adicionarArtigo(artigo);


            
            break;
        case 3:
            System.out.println("Digite o nome da pessoa: ");
            String nome = input.next();
            System.out.println("Digite o cpf da pessoa: ");
            String cpf = input.next();
            System.out.println("Digite o telefone da pessoa: ");
            String telefone = input.next();
            System.out.println("Digite o e-mail da pessoa ");
            String email= input.next();
            Pessoa pessoa = new Pessoa(nome, cpf, telefone, email);
            cadastro.AdicionarPessoa(pessoa);
            break;
        case 4:
        	System.out.println("digite o nome da pessoa que deseja alterar: ");
        	nome = input.next();
        	System.out.print("Digite o nome da pessoa: ");
            String nomeAtualizado = input.next();
            System.out.print("Digite o telefone da pessoa: ");
            telefone = input.next();
            System.out.print("Digite o e-mail da pessoa ");
            email= input.next();
        	cadastro.alterarPessoa(nome, nomeAtualizado,telefone, email);
        	break;
        case 5:
        	System.out.println("digite o titulo do livro que deseja alterar:");
        	String titulo = input.next();
        	System.out.println("digite o novo titulo do livro ");
        	tituloLivro = input.next();
        	System.out.println("digite o novo autor do livro ");
        	autorLivro = input.next();
        	System.out.println("digite o novo ano do livro ");
        	anoLivro = input.nextInt();
        	estoque.alterarLivro(titulo, tituloLivro, autorLivro, anoLivro);
        	break;
        case 6:
        	System.out.println("digite o titulo do artigo que deseja excluir");
        	titulo = input.next();
        	System.out.println("digite o novo nome do artigo");
        	tituloArtigo = input.next();
        	System.out.println("digite o novo autor do artigo");
        	autorArtigo = input.next();
        	System.out.println("digite o novo ano do artigo");
        	anoArtigo = input.nextInt();
        	estoque.alterAritgo(titulo, tituloArtigo, autorArtigo, anoArtigo);
        	break;
        	
        case 8:
        	System.out.println("Digite o titulo do livro que deseja excluir");
        	titulo = input.next();
        	estoque.removerLivro(titulo);
        	break;
        	
        case 9:
        	System.out.println("Digite o titulo do artigo que deseja excluir");
        	titulo = input.next();
        	estoque.removerArtigo(titulo);
        	break;
        	
        case 10:
        	System.out.println("digite o nome do usuario que deseja excluir");
        	nome = input.next();
        	cadastro.removePessoa(nome);

        	break;
        case 11:
        	estoque.imprime();

        	break;
        case 12:
        	cadastro.imprime();
        	break;

        	
        case 13:
            System.out.print("Saindo... ");
            break;
            default:
                System.out.print("Opção invalida");
                break;

        

            
        
        }}while(opcao !=13);
        
        
    }
}