package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        /**
         * crio uma lista vazia, armazeno todos os dados da lista descricao que quero remover nela
         * Depois chamo o método removeALL que deletará todas as descrições que estão armazenadas no
         * tarefasParaRemover
         */
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //Cria um parâmetro T do tipo Tarefa
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotal(){
        return tarefaList.size();
    }

    public void obterDescricao(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa =  new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotal());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotal());

        listaTarefa.obterDescricao();

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotal());

        listaTarefa.obterDescricao();
    }
}
