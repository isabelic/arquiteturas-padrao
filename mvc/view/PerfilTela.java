package mvc.view;
import mvc.model.Perfil;

public class PerfilTela {
    public void mostrarPerfil(Perfil perfil){
        System.out.println("\n/////// PERFIL USUÁRIO ///////");

        System.out.println("NOME: " + perfil.getNome());
        System.out.println("IDADE: " + perfil.getIdade());
        System.out.println("PROFISSÃO: " + perfil.getProfissao());
        
    }
}
