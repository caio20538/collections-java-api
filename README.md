# Collection Framework API

- Uma coleção (collection) é uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade; estes elementos precisam ser objetos.
- Uma Collection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homogêneas de um tipo específico.
- O núcleo principal das coleções é formado pelas interfaces da figura abaixo; essas interfaces permitem manipular a coleção independentemente do nível de detalhe que elas representam.
- Temos quatro grandes tipos de coleções: List (lista), Set (conjunto), Queue (fila) e Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas que implementam várias formas diferentes de se trabalhar com cada coleção.

<p align="center">
<a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
</p>


- Todas as interfaces e classes são encontradas dentro do pacote (package) java.util.
- Embora a interface Map não seja filha direta da interface Collection, ela também é considerada uma coleção devido à sua função.

<p align="center">



<a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html">Method Sumary Collection Interface</a>
</p>


```mermaid
classDiagram
    direction TB
    class Collection {
        <<interface>>
    }
    class List {
        <<interface>>
    }
    class Set {
        <<interface>>
    }
    class Queue {
        <<interface>>
    }
    class Deque {
        <<interface>>
    }
    class Map {
        <<interface>>
    }

    Collection <|-- List
    Collection <|-- Set
    Collection <|-- Queue
    Queue <|-- Deque
    Map <|-- SortedMap

    class ArrayList
    class LinkedList
    class HashSet
    class LinkedHashSet
    class TreeSet
    class PriorityQueue
    class ArrayDeque
    class HashMap
    class LinkedHashMap
    class TreeMap

    List <|-- ArrayList
    List <|-- LinkedList
    Set <|-- HashSet
    Set <|-- LinkedHashSet
    Set <|-- TreeSet
    Queue <|-- PriorityQueue
    Deque <|-- ArrayDeque
    Map <|-- HashMap
    Map <|-- LinkedHashMap
    SortedMap <|-- TreeMap
```

---

### Referências:

[1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

[2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

[3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

[4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

[5] collections-java-api-2023 - DIO. Disponível em: https://github.com/cami-la/collections-java-api-2023.git
