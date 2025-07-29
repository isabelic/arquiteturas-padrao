package mvp;

import mvp.model.*;
import mvp.presenter.*;
import mvp.view.IMCalculado;

public class Main {
    public static void main(String[] args) {

        
        Pessoa pessoa = new Pessoa(72.5, 1.65);

        
        ImcPresenter presenter = new ImcPresenter();

       
        double result = presenter.medirIMC(pessoa);

        
        String resultado = String.format("%.2f", result);

        
        IMCalculado imc = new IMCalculado();
        imc.resultadoIMC(resultado);
    }
}
