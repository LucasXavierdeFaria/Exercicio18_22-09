public class Main {
    public static void main(String[] args) {
        // Criar uma biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Cadastrar livros
        biblioteca.cadastrarLivro("1984", "George Orwell");
        biblioteca.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");

        // Cadastrar usuários
        biblioteca.cadastrarUsuario("Alice");
        biblioteca.cadastrarUsuario("Bob");

        // Exibir livros e usuários cadastrados
        biblioteca.exibirLivros();
        biblioteca.exibirUsuarios();

        // Buscar usuário e livro
        Usuario alice = biblioteca.buscarUsuario("Alice");
        Livro livro1984 = biblioteca.buscarLivro("1984");

        // Alice empresta o livro "1984"
        if (alice != null && livro1984 != null) {
            alice.emprestarLivro(livro1984);
        }

        // Verificar a disponibilidade do livro "1984"
        System.out.println("Disponibilidade de '1984': " + (livro1984.isDisponivel() ? "Disponível" : "Indisponível"));

        // Alice devolve o livro "1984"
        if (alice != null && livro1984 != null) {
            alice.devolverLivro(livro1984);
        }

        // Verificar a disponibilidade do livro "1984" novamente
        System.out.println("Disponibilidade de '1984': " + (livro1984.isDisponivel() ? "Disponível" : "Indisponível"));
    }
}
