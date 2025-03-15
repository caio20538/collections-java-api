package list.OperacoesBasicas;

public class Tarefa {
    //atributos

    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    //Necessário para que na saida retorne a variável
    @Override
    public String toString() {
        return descricao;
    }
}
