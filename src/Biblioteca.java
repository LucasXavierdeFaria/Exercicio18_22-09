import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Método para cadastrar um livro
    public void cadastrarLivro(String titulo, String autor) {
        Livro novoLivro = new Livro(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro cadastrado: " + titulo + " por " + autor);
    }

    // Método para cadastrar um usuário
    public void cadastrarUsuario(String nome) {
        Usuario novoUsuario = new Usuario(nome);
        usuarios.add(novoUsuario);
        System.out.println("Usuário " + nome + " foi cadastrado.");
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        System.out.println("Livro " + titulo + " não encontrado.");
        return null;
    }

    // Método para buscar um usuário pelo nome
    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário " + nome + " não encontrado.");
        return null;
    }

    // Exibe todos os livros cadastrados
    public void exibirLivros() {
        System.out.println("Livros cadastrados na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    // Exibe todos os usuários cadastrados
    public void exibirUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNome());
        }
    }
}
