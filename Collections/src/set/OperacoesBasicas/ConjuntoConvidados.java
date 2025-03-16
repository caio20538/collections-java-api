package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado) {
        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvidado){
                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        System.out.println("Existem " + convidados.contarConvidados() + " convidados");

        convidados.adicionarConvidado("Convidado 1", 1234);
        convidados.adicionarConvidado("Convidado 2", 1235);
        convidados.adicionarConvidado("Convidado 3", 1235);
        convidados.adicionarConvidado("Convidado 4", 1237);

        System.out.println("Existem " + convidados.contarConvidados() + " convidados");

        convidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + convidados.contarConvidados() + " convidados");

        convidados.exibirConvidados();
    }
}
