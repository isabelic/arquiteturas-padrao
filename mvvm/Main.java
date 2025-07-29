package mvvm;

import mvvm.view.TelaTarefas;
import mvvm.viewModel.TarefaViewModel;

public class Main {
    public static void main(String[] args) {
        TarefaViewModel viewModel = new TarefaViewModel();

        viewModel.visualTarefa("Estudar Java", "Alta");
        viewModel.visualTarefa("Fazer exercícios", "Média");
        viewModel.visualTarefa("Estudar Front-End", "Baixa");
        viewModel.visualTarefa("Estudar POO", "Alta");
        viewModel.visualTarefa("--------", "--------");

        TelaTarefas tela = new TelaTarefas();
        tela.TarefasListadas(viewModel.getTarefasListadas());
    }
}
