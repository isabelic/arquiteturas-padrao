package mvc.model;

public class Perfil {
    private String nome;
    private int idade;
    private String profissao;


    public Perfil(String nome, String profissao, int idade){
        this.nome= nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


}
