package mvvm.view;

import java.util.List;
import mvvm.model.Tarefa;

public class TelaTarefas {
    public void TarefasListadas(List<Tarefa> tarefas) {
        System.out.println("///////////// LISTA ORDENADA /////////////////");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
