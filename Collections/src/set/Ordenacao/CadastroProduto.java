package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        //deixa organizado
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProduto cadastroProdutoproduto = new CadastroProduto();

        System.out.println(cadastroProdutoproduto.exibirPorPreco());
        System.out.println(cadastroProdutoproduto.exibirProdutosPorNome());

        cadastroProdutoproduto.adicionarProduto(123L, "pão", 10.00, 12);
        cadastroProdutoproduto.adicionarProduto(124L, "pão", 15.00, 19);
        cadastroProdutoproduto.adicionarProduto(125L, "queijo", 20.00, 1);
        cadastroProdutoproduto.adicionarProduto(125L, "Iorgute", 12.00, 1);
        cadastroProdutoproduto.adicionarProduto(126L, "salada", 12.00, 1);

        System.out.println(cadastroProdutoproduto.produtoSet);

        System.out.println(cadastroProdutoproduto.exibirProdutosPorNome());

        System.out.println(cadastroProdutoproduto.exibirPorPreco());
    }
}
