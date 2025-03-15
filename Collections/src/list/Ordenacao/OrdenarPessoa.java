package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPessoa {
    private List<Pessoa> pessoaList;

    public OrdenarPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }


    public List<Pessoa> ordenadoPorAltura(){
        //forma antiga
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparetorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenarPessoa ordenarPessoa = new OrdenarPessoa();

        ordenarPessoa.adicionarPessoa("Caio", 20, 1.83);
        ordenarPessoa.adicionarPessoa("Bia", 28, 1.54);
        ordenarPessoa.adicionarPessoa("Ana", 20, 1.70);
        ordenarPessoa.adicionarPessoa("Jão", 23, 1.76);

        System.out.println("Sem ordenação");
        System.out.println(ordenarPessoa.pessoaList);

        System.out.println("Ordenar por Altura");
        System.out.println(ordenarPessoa.ordenadoPorAltura());

        System.out.println("Ordenar por Idade");
        System.out.println(ordenarPessoa.ordenadoPorIdade());

    }
}
