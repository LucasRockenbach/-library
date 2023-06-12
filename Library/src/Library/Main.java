package Library;
/*package trabalho;

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
            System.out.println("2. Inserir emprestante");
            System.out.println("3. Inserir Livro na Biblioteca");
            System.out.println("4. Editar Livro");
            System.out.println("5. Editar Usuário");
            System.out.println("6. Emprestar Livro");
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
            
            System.out.println("Livro inserido: " + Livro.getTitulo());
            break;
        case 2:
            System.out.print("Digite o nome de quem empresta: ");
            String nome = input.nextLine();
            System.out.print("Digite o cpf de quem empresta: ");
            String cpf = input.nextLine();
            System.out.print("Digite o telefone de quem empresta: ");
            String telefone = input.nextLine();
            System.out.print("Digite o e-mail de quem empresta: ");
            String email= input.nextLine();
            System.out.print("Digite a data que esta emprestando: ");
            String dataEmprestimo = input.nextLine();
            PessoaEmpresta pessoaEmpresta = new PessoaEmpresta(null, nome, cpf, telefone, email);
            cadastro.AdicionarEmpresta(pessoaEmpresta);
            break;
        case 3:
        	System.out.println("digite o nome do usuario que deseja alterar");
        	nome = input.nextLine();
        	
        case 12:
            System.out.print("Saindo... ");
            break;
            default:
                System.out.print("Opção invalida");
                break;



            
        
        }
        }
 
        while(opcao != 12);
        
        
        

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