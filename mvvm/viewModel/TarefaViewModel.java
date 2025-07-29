package mvvm.viewModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mvvm.model.Tarefa;

public class TarefaViewModel {
    private List<Tarefa> tarefas = new ArrayList<>();

    public void visualTarefa(String titulo, String prioridade) {
        tarefas.add(new Tarefa(titulo, prioridade));
    }

    public List<Tarefa> getTarefasListadas() {
       
        Collections.sort(tarefas, Comparator.comparingInt(this::prioridadeEscolha));
        return tarefas;
    }

    private int prioridadeEscolha(Tarefa tarefa) {
        String prioridade = tarefa.getPrioridade().toLowerCase();
    
        
        if (prioridade.equals("alta")) {
            return 1;
        } else if (prioridade.equals("media")) {
            return 2;
        } else if (prioridade.equals("baixa")) {
            return 3;
        } else {
            return 0;
        }
    }
    
}
