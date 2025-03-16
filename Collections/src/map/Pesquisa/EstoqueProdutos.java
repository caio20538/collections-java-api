package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProduto.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProduto);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProduto.isEmpty()){
            for (Produto p : estoqueProduto.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return  valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(122, "Pão", 10, 12.00);
        estoque.adicionarProduto(123, "Queijo", 1, 29.00);
        estoque.adicionarProduto(124, "Requeijão", 1, 9.99);
        estoque.adicionarProduto(125, "Iorgute", 8, 6.00);
        estoque.adicionarProduto(126, "Salada", 1, 12.00);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());

        System.out.println("Valor do produto mais caro: R$" + estoque.obterProdutoMaisCaro());
        System.out.println("Valor do produto mais barato: R$" + estoque.obterProdutoMaisBarato());




    }

}
