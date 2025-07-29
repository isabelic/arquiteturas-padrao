package mvc.controller;
import mvc.model.Perfil;

public class PerfilController {
    public Perfil criacaoPerfil(String nome, String profissao, int idade){
        return new Perfil(nome,profissao,idade);
    }

    

}
