package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Com generics n pode usar o int, double...
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        //serve para atualizar e adicionar
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroDeContato = null;
        if (!agendaContatoMap.isEmpty()){
            numeroDeContato = agendaContatoMap.get(nome);
        }

        return numeroDeContato;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Caio", 6666);
        contatos.adicionarContato("Caio", 6667);
        contatos.adicionarContato("Pedro", 8782);
        contatos.adicionarContato("Jão", 3298329);
        contatos.adicionarContato("Carlos", 38276392);

        contatos.exibirContato();

        contatos.removerContato("Pedro");
        contatos.exibirContato();

        System.out.println("O número é: " + contatos.pesquisarPorNome("Jão"));
    }
}
