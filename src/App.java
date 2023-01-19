import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Biblioteca.Emprestimo;
import Biblioteca.Endereco;
import Biblioteca.Livro;
import Biblioteca.Usuario;

public class App {
  public static void main(String[] args) throws Exception {
    // Endereco endereco = new Endereco("Junco", "Picos", "PI", 260);

    // Usuario usuario = new Usuario("Ézio", "teste@teste.com", LocalDate.of(2001,
    // 9, 10), endereco);

    // Livro livro = new Livro("***", "***", "***", LocalDate.of(2000, 1, 10), 1);

    // Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.of(2022, 11, 13),
    // null);

    Scanner leitor = new Scanner(System.in);

    int opcao = 0;
    int opcaoConfigLivro;
    ArrayList<Livro> arrayDeLivros = new ArrayList<Livro>();
    ArrayList<Usuario> arrayDeUsuarios = new ArrayList<Usuario>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    
    while (opcao != 4) {
      System.out
          .println("Digite: [1] Config de livro | [2] Config de usuário | [3] Empréstimo de livro | [4] Sair do app");
      opcao = leitor.nextInt();
      leitor.nextLine();

      switch (opcao) {
        case 1:
          System.out.println("Digite: [1] Cadastro | [2] Listar livros disponiveis");
          opcaoConfigLivro = leitor.nextInt();

          if (opcaoConfigLivro == 1) {
            System.out.println("Insira o título do livro: ");
            String titulo = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira o autor do livro: ");
            String autor = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira a area de conhecimento: ");
            String areaConhecimento = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira a data de lançamento do livro (yyyy-MM-dd): ");
            LocalDate dataLancamento = LocalDate.parse(leitor.nextLine());
            leitor.nextLine();
            System.out.println("Insira o numero de livros no acervo: ");
            int quantidadeLivros = leitor.nextInt();
            leitor.nextLine();
            Livro livro = new Livro(titulo, autor, areaConhecimento, dataLancamento, quantidadeLivros);
            arrayDeLivros.add(livro);
          } else {

            if (arrayDeLivros.size() == 0) {
              System.out.println("Nenhum livro cadastrado!");
            } else {
              arrayDeLivros.forEach(livro -> {
                System.out.println("-------------------------------");
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getAreaConhecimento());
                System.out.println("Data de lançamento: " + livro.getDataPublicacao());
                System.out.println("Numero de paginas: " + livro.getQuantidadeLivros());
                System.out.println("-------------------------------");
              });
            }
          }

        case 2:
          System.out.println("Digite: [1] Cadastro | [2] Listar Usuarios | [3] Alterar usuario | [4] Remover usuario");
          int opcaoUsuario = leitor.nextInt();
          if (opcaoUsuario == 1) {
            System.out.println("Insira o nome do usuario: ");
            String nome = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira o email do usuario: ");
            String email = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira a data de nascimento do usuario (yyyy-MM-dd): ");
            LocalDate dataNascimento = LocalDate.parse(leitor.nextLine());
            leitor.nextLine();
            System.out.println("Insira a rua do endereço: ");
            String rua = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira o bairro do endereço: ");
            String bairro = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira a cidade do endereço: ");
            String cidade = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira o estado do endereço: ");
            String uf = leitor.nextLine();
            leitor.nextLine();
            System.out.println("Insira o numero do endereço: ");
            int numero = leitor.nextInt();
            leitor.nextLine();

            Endereco endereco = new Endereco(bairro, cidade, uf, rua, numero);
            Usuario usuario = new Usuario(nome, email, dataNascimento, endereco);

            arrayDeUsuarios.add(usuario);
          } else if (opcaoUsuario == 2) {
            arrayDeUsuarios.forEach(usuario -> {
              System.out.println("Nome: " + usuario.getNome());
              System.out.println("Email: " + usuario.getEmail());
              System.out.println("Data de nascimento: " + usuario.getDataNascimento());
              System.out
                  .println("Endereço:  " + usuario.getEndereco().getRua() + ", " + usuario.getEndereco().getBairro()
                      + ", " + usuario.getEndereco().getCidade()
                      + ", " + usuario.getEndereco().getUf() + ", " + usuario.getEndereco().getNumero());
            });
          } else if (opcaoUsuario == 3) {
            System.out.println("Insira o nome do usuario que deseja alterar: ");
            String nomeProcurado = leitor.nextLine();
            arrayDeUsuarios.forEach(usuario -> {
              boolean usuarioEncontrado = false;
              if (usuario.getNome().equals(nomeProcurado)) {
                usuarioEncontrado = true;
                System.out.println("Usuario encontrado!");
                System.out.println("Insira o novo nome do usuario: ");
                String novoNome = leitor.nextLine();
                usuario.setNome(novoNome);
                System.out.println("Insira o novo email do usuario: ");
                String novoEmail = leitor.nextLine();
                usuario.setEmail(novoEmail);
                System.out.println("Insira a nova data de nascimento do usuario (yyyy-MM-dd): ");
                LocalDate novaDataNascimento = LocalDate.parse(leitor.nextLine());
                usuario.setDataNascimento(novaDataNascimento);
                System.out.println("Insira o novo endereço do usuario: ");
                System.out.println("Rua: ");
                String novaRua = leitor.nextLine();
                usuario.getEndereco().setRua(novaRua);
                System.out.println("Bairro: ");
                String novoBairro = leitor.nextLine();
                usuario.getEndereco().setBairro(novoBairro);
                System.out.println("Cidade: ");
                String novaCidade = leitor.nextLine();
                usuario.getEndereco().setCidade(novaCidade);
                System.out.println("UF: ");
                String novoUf = leitor.nextLine();
                usuario.getEndereco().setUf(novoUf);
                System.out.println("Numero: ");
                int novoNumero = leitor.nextInt();
                usuario.getEndereco().setNumero(novoNumero);
                leitor.nextLine();
              } else if (!usuarioEncontrado) {
                System.out.println("Usuario não encontrado");
              }
            });
          } else if (opcaoUsuario == 4) {
            System.out.println("Insira o nome do usuario que deseja deletar: ");
            String nomeProcurado = leitor.nextLine();

            arrayDeUsuarios.removeIf(usuario -> usuario.getNome().equals(nomeProcurado));
          }

        case 3:

          System.out.println("Insira o nome do usuario: ");
          String nomeUsuario = leitor.nextLine();

          boolean usuarioEncontrado = false;
          Usuario usuario = null;
          for (Usuario user : arrayDeUsuarios) {
            if (user.getNome().equals(nomeUsuario)) {
              usuarioEncontrado = true;
              usuario = user;
              break;
            }
          }

          if (usuarioEncontrado) {
            System.out.println("Usuario encontrado!");
            boolean emprestimoAtivo = false;
            for (Emprestimo emprestimo : emprestimos) {
              if (emprestimo.getUsuario().equals(usuario) && emprestimo.getDataDevolucao() == null) {
                emprestimoAtivo = true;
                break;
              }
            }
            if (emprestimoAtivo) {
              System.out.println("Usuario ja possui um emprestimo ativo!");
            } else {
              System.out.println("Insira o nome do livro: ");
              String nomeLivro = leitor.nextLine();
              boolean livroEncontrado = false;
              Livro livro = null;
              for (Livro livroAtual : arrayDeLivros) {
                if (livroAtual.getTitulo().equals(nomeLivro)) {
                  livroEncontrado = true;
                  livro = livroAtual;
                  break;
                }
              }
              if (livroEncontrado) {
                if (livro.getQuantidadeLivros() > 0) {
                  System.out.println("Livro disponivel!");
                  System.out.println("Insira a data do emprestimo (yyyy-MM-dd): ");
                  LocalDate dataEmprestimo = LocalDate.parse(leitor.nextLine());
                  livro.setQuantidadeLivros(livro.getQuantidadeLivros() - 1);
                  System.out.println("Insira a data da devolucao (yyyy-MM-dd): ");
                  LocalDate dataDevolucao = LocalDate.parse(leitor.nextLine());
                  Emprestimo emprestimo = new Emprestimo(usuario, dataEmprestimo, dataDevolucao, livro);
                  emprestimos.add(emprestimo);
                } else {
                  System.out.println("Livro nao disponivel.");
                }
              } else {
                System.out.println("Livro nao encontrado.");
              }
            }
          } else {
            System.out.println("Usuario nao encontrado.");
          }
        default:
          System.out.println("Opção inválida!");
      }
    }
    System.out.println("Pressione enter para sair");
    System.in.read();
    leitor.close();
  }
}
