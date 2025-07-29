package cqrs.command;
import java.util.ArrayList;
import java.util.List;

public class CadastrarLivroCommand {
    public static void main(String[] args) {

    List <String> livros = new ArrayList<>();
    
    livros.add("Livro 1");
    livros.add("Livro 2");
    livros.add("Livro 3");

    System.out.println("Livros cadastrados:");
    for (String livro : livros) {
        System.out.println(livro);
    }
   
}
}