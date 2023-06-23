package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        
        Controle controle = new Controle();
        Scanner input = new Scanner(System.in);
        
        
        
        
        	int opcao = 0;
        
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Inserir Livro"); // check
            System.out.println("2. Inserir Artigo"); // check
            System.out.println("3. Inserir pessoa"); // check
            System.out.println("4. Editar pessoa");// check
            System.out.println("5. Editar Livro");// check
            System.out.println("6. Editar Artigo"); // check
            System.out.println("7. Emprestar");
            System.out.println("8. Devolver");
            System.out.println("9. Excluir Livro");//check
            System.out.println("10. Excluir Artigo");//check
            System.out.println("11. Excluir Usuário");// check
            System.out.println("12. Exibir Livros da Biblioteca"); // check
            System.out.println("13. Exibir Usuários"); // check
            System.out.println("14. calcular multa"); // check

            System.out.println("15. Sair");
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
            controle.adicionarLivro(livro);
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
            controle.adicionarArtigo(artigo);


            
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
            controle.AdicionarPessoa(pessoa);
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
        	controle.alterarPessoa(nome, nomeAtualizado,telefone, email);
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
        	controle.alterarLivro(titulo, tituloLivro, autorLivro, anoLivro);
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
        	controle.alterAritgo(titulo, tituloArtigo, autorArtigo, anoArtigo);
        	break;
        case 7:
        	System.out.println("digite o titulo do livro ou artigo que deseja emprestar");
        	titulo = input.next();
        	System.out.println("digite o nome da pessoa que deseja emprestar");
        	nome = input.next();
        	controle.emprestar(titulo, nome);
        	break;
        case 8:
        	System.out.println("digite o titulo do livro ou artigo que esta sendo devolvido");
        	titulo = input.next();
        	System.out.println("digite o nome da pessoa que esta devolvendo");
        	nome = input.next();
        	System.out.println("quantos dias de atraso?");
        	int dias = input.nextInt();
        	controle.devolver(titulo, nome, dias);
        	break;

        	
        case 9:
        	System.out.println("Digite o titulo do livro que deseja excluir");
        	titulo = input.next();
        	controle.removerLivro(titulo);
        	break;
        	
        case 10:
        	System.out.println("Digite o titulo do artigo que deseja excluir");
        	titulo = input.next();
        	controle.removerArtigo(titulo);
        	break;
        	
        case 11:
        	System.out.println("digite o nome do usuario que deseja excluir");
        	nome = input.next();
        	controle.removePessoa(nome);

        	break;
        case 12:
        	controle.imprimeLivros();
        	break;
        case 13:
        	controle.imprimeCadastros();
        	break;

        	
        case 14:
            System.out.print("Saindo... ");
            break;
            default:
                System.out.print("Opção invalida");
                break;

        

            
        
        }}while(opcao !=14);
        
        
    }
}