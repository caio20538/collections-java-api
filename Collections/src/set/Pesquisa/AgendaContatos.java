package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoesPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            // compara com o nome inicial
            // camila canvacante, camila cunha....
            if (c.getNome().startsWith(nome)){
                contatoesPorNome.add(c);
            }
        }

        return contatoesPorNome;
    }

    public Contato atualizarContato(String nome, int newNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(newNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.exibirContatos();

        contatos.adicionarContato("Caio Batista", 1234);
        contatos.adicionarContato("Carlos", 1234);
        contatos.adicionarContato("Caio Silva", 1235);
        contatos.adicionarContato("Jão", 1236);

        contatos.exibirContatos();

        System.out.println(contatos.pesquisarPorNome("Caio"));

        contatos.atualizarContato("Jão", 1237);

        contatos.exibirContatos();
    }
}
