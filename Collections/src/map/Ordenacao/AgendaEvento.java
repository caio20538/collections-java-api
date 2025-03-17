package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        //como estou usando LocalDate não preciso criar um comparable, já que ela já implementa
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
        /* são 2 coleções totalmente independente uma da outra
        como quero pegar uma determinada data e retornar um determinado elemento eu não
        posso usar essas 2 coleções
        //retorna um set com todas as keys
        Set<LocalDate> dataSet = eventoMap.keySet();

        //Retorna uma coleção com todos os valores
        Collection<Evento> values = eventoMap.values();

         */

        //eventoMap.get(); também não retornará o proximo evento

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry: eventoTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEvento evento = new AgendaEvento();

        evento.adicionarEvento(LocalDate.of(2195, Month.JANUARY, 15), "Evento1", "Atração1");
        evento.adicionarEvento(LocalDate.of(2196, Month.JANUARY, 16), "Evento1", "Atração1");
        evento.adicionarEvento(LocalDate.of(2021, Month.FEBRUARY, 10), "Evento2", "Atração2");
        evento.adicionarEvento(LocalDate.of(2023, Month.MARCH, 5), "Evento3", "Atração3");
        evento.adicionarEvento(LocalDate.of(2022, Month.MAY, 31), "Evento4", "Atração4");

        evento.exibirAgenda();

        evento.obterProximoEvento();
    }
}
