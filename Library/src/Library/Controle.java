package Library;

public interface Controle {
    // Método para doar um livro para o estoque da biblioteca
    void doar(Item livro, Pessoa doador);

    // Método para emprestar um livro para um usuário
    void emprestar(Item livro, Pessoa empresta);

    // Método para devolver um livro à biblioteca
    void devolver(Item livro, Pessoa empresta);

}
