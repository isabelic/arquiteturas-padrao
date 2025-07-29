package cqrs.query;
import cqrs.model.Livro;
import java.util.List;

public class ConsultarLivrosQuery {

    public void mostrarLivros(List<Livro> livros){

        System.out.println("Livros disponíveis:");
        
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }
}
