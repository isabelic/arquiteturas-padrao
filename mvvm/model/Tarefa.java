package mvvm.model;

public class Tarefa {
    String titulo;
    String prioridade;

    public Tarefa(String titulo, String prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return titulo + " - " + prioridade;
    }
}
