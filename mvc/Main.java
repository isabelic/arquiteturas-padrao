package mvc;
import mvc.controller.PerfilController;
import mvc.model.Perfil;
import mvc.view.PerfilTela;

public class Main {
    public static void main(String[] args) {
         PerfilController control = new PerfilController();

         Perfil perfil = new Perfil("izinha", "TI", 10 );

         PerfilTela ttp = new PerfilTela();
        ttp.mostrarPerfil(perfil);

    }




}
