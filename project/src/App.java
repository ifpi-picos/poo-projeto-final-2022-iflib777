import java.time.LocalDate;

import Biblioteca.Emprestimo;
import Biblioteca.Endereco;
import Biblioteca.Livro;
import Biblioteca.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Endereco endereco = new Endereco("****", "Junco", "Picos", "PI", 260);
        Usuario usuario = new Usuario("Ézio", "teste@teste.com", LocalDate.of(2001,9,10) , endereco);
        Livro livro = new Livro("***", "***", "***", LocalDate.of(0000,0,0), 1);
        Emprestimo emprestimo = new Emprestimo(usuario, LocalDate.of(2022, 11, 13), null);
    }
}
