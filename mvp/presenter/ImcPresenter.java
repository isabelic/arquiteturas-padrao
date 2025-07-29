package mvp.presenter;
import mvp.model.*;

public class ImcPresenter {
    public Double medirIMC(Pessoa pessoa){
        double medirIMC =  pessoa.getPeso() / Math.pow(pessoa.getAltura(), 2);

          String classificacao =
            (medirIMC < 18.5) ? "Abaixo do peso" :
            (medirIMC < 25)   ? "Peso normal" :
            (medirIMC < 30)   ? "Sobrepeso" :
                           "Obesidade";

        
        System.out.println("IMC: " + medirIMC + " - " + classificacao);
        return medirIMC;
    }

    }

