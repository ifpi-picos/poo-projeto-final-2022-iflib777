import java.time.LocalDate;
import java.util.Scanner;
import Biblioteca.Emprestimo;
import Biblioteca.Endereco;
import Biblioteca.Livro;
import Biblioteca.Usuario;

public class App {  
  public static void main(String[] args) throws Exception {
    Endereco endereco = new Endereco("****", "Junco", "Picos", "PI", 260);
    
    Usuario usuario = new Usuario("Ézio", "teste@teste.com", LocalDate.of(2001, 9, 10), endereco);
    
    Livro livro = new Livro("***", "***", "***", LocalDate.of(2000, 1, 10), 1);
    
    Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.of(2022, 11, 13), null);
    
    Scanner leitor = new Scanner(System.in);

    int opcao = 0;

    System.out.println(
        "Digite:\n [1] Configuração de livro \n [2] Configuração de usuário \n [3] Empréstimo de livro \n [4] Sair do app ");
    opcao = leitor.nextInt();
  
    switch(opcao) {
      case 1:
        System.out.println("Digite: [1] Cadastro | [2]"); 
    }
  }

}
