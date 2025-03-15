package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
       this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor,  anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
            List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> PesquisarPorIntervaloPorAno(int anoInicial, int anoFinal ) {
        List<Livro> livrosPorIntervaloPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloPorAno.add(l);
                }
            }
        }
        return livrosPorIntervaloPorAno;
    }

    public Livro PesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return  livroPorTitulo;
    }

    public static void main(String[] args) {
            CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Livro1", "Autor1", 2000);
        catalogoLivros.adicionarLivros("Livro1", "Autor2", 2004);
        catalogoLivros.adicionarLivros("Livro3", "Autor3", 2010);
        catalogoLivros.adicionarLivros("Livro4", "Autor3", 2014);
        catalogoLivros.adicionarLivros("Livro5", "Autor5", 2025);

        System.out.println("Por intervalo de Ano");
        System.out.println(catalogoLivros.PesquisarPorIntervaloPorAno(2000, 2008));

        System.out.println("Por título");
        System.out.println(catalogoLivros.PesquisarPorTitulo("Livro1"));

        System.out.println("Por autor");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor3"));
    }
}
