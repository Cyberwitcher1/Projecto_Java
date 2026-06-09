# Ordenação de coleções e arrays

<!-- TOC -->
* [Ordenação de coleções e arrays](#ordenação-de-coleções-e-arrays)
  * [1. Introdução](#1-introdução)
  * [2. Classe utilizada nos exemplos](#2-classe-utilizada-nos-exemplos)
  * [3. Obter os valores existentes num `HashMap`](#3-obter-os-valores-existentes-num-hashmap)
  * [4. Ordenação natural com `Comparable`](#4-ordenação-natural-com-comparable)
  * [5. Quando utilizar `Comparable`](#5-quando-utilizar-comparable)
  * [6. Ordenar com `Comparator`](#6-ordenar-com-comparator)
    * [7.6.1. Implementação tradicional](#761-implementação-tradicional)
  * [7. Classes anónimas](#7-classes-anónimas)
  * [8. Expressões lambda](#8-expressões-lambda)
  * [9. Método `Comparator.comparing()`](#9-método-comparatorcomparing)
  * [10. Ordenar texto sem distinguir maiúsculas de minúsculas](#10-ordenar-texto-sem-distinguir-maiúsculas-de-minúsculas)
  * [11. Métodos adequados para valores numéricos](#11-métodos-adequados-para-valores-numéricos)
    * [Ordenar por ano de publicação](#ordenar-por-ano-de-publicação)
    * [Ordenar por preço](#ordenar-por-preço)
  * [12. Ordenação descendente](#12-ordenação-descendente)
    * [Livros mais caros primeiro](#livros-mais-caros-primeiro)
    * [Livros mais recentes primeiro](#livros-mais-recentes-primeiro)
  * [13. Ordenação através de vários critérios](#13-ordenação-através-de-vários-critérios)
    * [Ordenar por autor e depois por título](#ordenar-por-autor-e-depois-por-título)
    * [Ordenar por preço e depois por título](#ordenar-por-preço-e-depois-por-título)
    * [Ordenar por ano de publicação descendente e depois por título](#ordenar-por-ano-de-publicação-descendente-e-depois-por-título)
  * [14. Ordenar uma lista sem alterar a lista original](#14-ordenar-uma-lista-sem-alterar-a-lista-original)
  * [15. `Comparable` ou `Comparator`?](#15-comparable-ou-comparator)
    * [Utilizar `Comparable`](#utilizar-comparable)
    * [Utilizar `Comparator`](#utilizar-comparator)
  * [Resumo](#resumo)
<!-- TOC -->

## 1. Introdução

Em muitas aplicações é necessário guardar objetos numa estrutura eficiente para pesquisa e, posteriormente, apresentar esses objetos segundo uma determinada ordem.

Por exemplo, uma aplicação poderá guardar livros num:

```java
HashMap<Integer, Book>
```

A chave permite encontrar rapidamente um livro através do seu identificador.

No entanto, os valores existentes num `HashMap` não se encontram automaticamente ordenados.

Quando se pretende apresentar os livros por título, preço ou ano de publicação, é necessário:

```text
1. Obter os valores existentes no HashMap
2. Criar uma lista com esses valores
3. Ordenar a lista
4. Percorrer a lista ordenada
```

---

## 2. Classe utilizada nos exemplos

Os exemplos seguintes utilizam uma classe simples denominada `Book`.

```java
public class Book {

    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    public Book(
            int id,
            String title,
            String author,
            int publicationYear,
            double price
    ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format(
                "[%d] %s - %s - %d - %.2f €",
                this.id,
                this.title,
                this.author,
                this.publicationYear,
                this.price
        );
    }
}
```

A aplicação poderá guardar os livros num mapa:

```java
HashMap<Integer, Book> books = new HashMap<>();
```

Exemplo de inserção:

```java
books.put(
        1,
        new Book(
                1,
                "The Hobbit",
                "J. R. R. Tolkien",
                1937,
                14.90
        )
);

books.put(
        2,
        new Book(
                2,
                "Clean Code",
                "Robert C. Martin",
                2008,
                32.50
        )
);

books.put(
        3,
        new Book(
                3,
                "Dune",
                "Frank Herbert",
                1965,
                18.75
        )
);
```

---

## 3. Obter os valores existentes num `HashMap`

O método:

```java
values()
```

devolve uma coleção com todos os valores existentes no mapa.

Exemplo:

```java
Collection<Book> values = books.values();
```

No entanto, para ordenar os objetos de forma simples, é conveniente criar uma lista:

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());
```

A partir deste momento, a lista pode ser ordenada sem alterar o `HashMap`.

```text
HashMap
└── mantém os dados originais

ArrayList
└── recebe uma cópia das referências
└── pode ser ordenado para apresentação
```

A lista contém referências para os mesmos objetos que se encontram no mapa. Os objetos não são duplicados.

---

## 4. Ordenação natural com `Comparable`

A interface:

```java
Comparable<T>
```

deve ser utilizada quando uma classe possui uma ordem natural evidente.

Por exemplo, poderá considerar-se que a ordem natural de um livro corresponde ao seu título.

Nesse caso, a classe poderá implementar:

```java
Comparable<Book>
```

Exemplo:

```java
public class Book implements Comparable<Book> {

    private int id;
    private String title;
    private String author;
    private int publicationYear;
    private double price;

    // Construtor, getters e restantes métodos

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(
                other.title
        );
    }
}
```

Depois de implementar `Comparable`, é possível ordenar uma lista através de:

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

Collections.sort(orderedBooks);
```

Também é possível utilizar:

```java
orderedBooks.sort(null);
```

Quando o argumento é `null`, é utilizada a ordenação natural definida pelo método:

```java
compareTo()
```

---

## 5. Quando utilizar `Comparable`

Deverá ser utilizado `Comparable` quando existe uma ordem natural principal para os objetos.

Exemplos:

```text
Pessoas por nome
Produtos por referência
Países por nome
Eventos por data
```

A implementação pertence à própria classe:

```java
public class Book implements Comparable<Book>
```

A classe define:

```java
@Override
public int compareTo(Book other) {
    // Critério de ordenação natural
}
```

Uma classe apenas pode possuir uma implementação de:

```java
compareTo()
```

Por esse motivo, `Comparable` não é suficiente quando se pretende ordenar os mesmos objetos através de vários critérios diferentes.

---

## 6. Ordenar com `Comparator`

A interface:

```java
Comparator<T>
```

permite definir uma ordenação alternativa sem alterar a ordem natural da classe.

Por exemplo, mesmo que os livros possuam uma ordenação natural por título, poderá ser necessário ordená-los por preço.

### 7.6.1. Implementação tradicional

Antes do Java 8, era habitual criar uma classe comparadora específica.

```java
import java.util.Comparator;

public class BookPriceComparator
        implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        return Double.compare(
                first.getPrice(),
                second.getPrice()
        );
    }
}
```

Utilização:

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        new BookPriceComparator()
);
```

Este formato continua a ser válido.

---

## 7. Classes anónimas

Quando o comparador apenas é utilizado num local, poderá ser criada uma classe anónima.

Exemplo: ordenar livros por ano de publicação.

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        new Comparator<Book>() {
            @Override
            public int compare(
                    Book first,
                    Book second
            ) {
                return Integer.compare(
                        first.getPublicationYear(),
                        second.getPublicationYear()
                );
            }
        }
);
```

Este código evita criar um ficheiro adicional.

No entanto, continua a ser relativamente extenso.

---

## 8. Expressões lambda

A partir do Java 8, uma implementação simples de `Comparator` pode ser escrita através de uma expressão lambda.

Exemplo: ordenar livros por ano de publicação.

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        (first, second) -> Integer.compare(
                first.getPublicationYear(),
                second.getPublicationYear()
        )
);
```

A expressão:

```java
(first, second) -> Integer.compare(
        first.getPublicationYear(),
        second.getPublicationYear()
)
```

substitui a implementação do método:

```java
compare()
```

---

## 9. Método `Comparator.comparing()`

Em muitos casos, é possível simplificar ainda mais a ordenação utilizando os métodos estáticos disponibilizados por `Comparator`.

Exemplo: ordenar livros por título.

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparing(
                Book::getTitle
        )
);
```

A expressão:

```java
Book::getTitle
```

é uma referência para o método:

```java
getTitle()
```

Este código indica que cada objeto deverá ser comparado através do respetivo título.

---

## 10. Ordenar texto sem distinguir maiúsculas de minúsculas

Ao ordenar texto, poderá ser necessário ignorar diferenças entre maiúsculas e minúsculas.

Exemplo:

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
        )
);
```

Desta forma:

```text
alice
Alice
ALICE
```

são tratados como valores equivalentes para efeitos de ordenação alfabética.

---

## 11. Métodos adequados para valores numéricos

Para ordenar valores inteiros, `double` ou `long`, existem métodos especializados:

```java
Comparator.comparingInt()
Comparator.comparingDouble()
Comparator.comparingLong()
```

### Ordenar por ano de publicação

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparingInt(
                Book::getPublicationYear
        )
);
```

### Ordenar por preço

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparingDouble(
                Book::getPrice
        )
);
```

Estes métodos devem ser preferidos quando o valor comparado é numérico.

---

## 12. Ordenação descendente

Por defeito, os valores são ordenados de forma crescente.

Exemplo:

```text
10
20
30
```

Para obter a ordem inversa, poderá ser utilizado:

```java
reversed()
```

### Livros mais caros primeiro

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparingDouble(
                Book::getPrice
        ).reversed()
);
```

Resultado esperado:

```text
32.50
18.75
14.90
```

### Livros mais recentes primeiro

```java
orderedBooks.sort(
        Comparator.comparingInt(
                Book::getPublicationYear
        ).reversed()
);
```

---

## 13. Ordenação através de vários critérios

Frequentemente, dois objetos possuem o mesmo valor no primeiro critério.

Por exemplo, poderão existir vários livros escritos pelo mesmo autor.

Nesse caso, deverá ser definido um segundo critério de ordenação através de:

```java
thenComparing()
```

### Ordenar por autor e depois por título

```java
ArrayList<Book> orderedBooks =
        new ArrayList<>(books.values());

orderedBooks.sort(
        Comparator.comparing(
                Book::getAuthor,
                String.CASE_INSENSITIVE_ORDER
        ).thenComparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
        )
);
```

A ordenação será efetuada da seguinte forma:

```text
1. Ordenar alfabeticamente pelo autor
2. Quando o autor é igual, ordenar alfabeticamente pelo título
```

### Ordenar por preço e depois por título

```java
orderedBooks.sort(
        Comparator.comparingDouble(
                Book::getPrice
        ).thenComparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
        )
);
```

### Ordenar por ano de publicação descendente e depois por título

```java
orderedBooks.sort(
        Comparator.comparingInt(
                Book::getPublicationYear
        ).reversed().thenComparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
        )
);
```

---

## 14. Ordenar uma lista sem alterar a lista original

O método:

```java
sort()
```

altera a própria lista.

Exemplo:

```java
orderedBooks.sort(
        Comparator.comparing(
                Book::getTitle
        )
);
```

Caso seja necessário preservar uma lista original, deverá ser criada uma nova lista:

```java
ArrayList<Book> originalBooks =
        new ArrayList<>(books.values());

ArrayList<Book> orderedBooks =
        new ArrayList<>(originalBooks);

orderedBooks.sort(
        Comparator.comparing(
                Book::getTitle
        )
);
```

Neste caso:

```text
originalBooks
└── mantém a ordem anterior

orderedBooks
└── fica ordenada por título
```

---

## 15. `Comparable` ou `Comparator`?

### Utilizar `Comparable`

Utilizar quando existe uma ordem natural principal para a classe.

Exemplo:

```java
public class Book implements Comparable<Book> {

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(
                other.title
        );
    }
}
```

Vantagem:

```text
A classe define a sua própria ordenação natural
```

Limitação:

```text
Apenas existe um método compareTo()
```

---

### Utilizar `Comparator`

Utilizar quando:

```text
Existem vários critérios possíveis
Não se pretende alterar a classe original
A ordenação apenas é necessária numa funcionalidade específica
É necessário combinar vários critérios
É necessário ordenar de forma descendente
```

Exemplo:

```java
Comparator<Book> byPrice =
        Comparator.comparingDouble(
                Book::getPrice
        );
```

Exemplo com vários critérios:

```java
Comparator<Book> byAuthorAndTitle =
        Comparator.comparing(
                Book::getAuthor,
                String.CASE_INSENSITIVE_ORDER
        ).thenComparing(
                Book::getTitle,
                String.CASE_INSENSITIVE_ORDER
        );
```

---

## Resumo

| Situação                                                | Solução recomendada                             |
| ------------------------------------------------------- | ----------------------------------------------- |
| A classe possui uma ordem natural evidente              | Implementar `Comparable<T>`                     |
| É necessário ordenar através de um critério alternativo | Utilizar `Comparator<T>`                        |
| O comparador é complexo e reutilizado em vários locais  | Criar uma classe que implementa `Comparator<T>` |
| O comparador é simples e usado apenas uma vez           | Utilizar uma expressão lambda                   |
| A ordenação é feita através de um getter                | Utilizar `Comparator.comparing()`               |
| O valor comparado é um `int`                            | Utilizar `Comparator.comparingInt()`            |
| O valor comparado é um `double`                         | Utilizar `Comparator.comparingDouble()`         |
| É necessário ordenar de forma descendente               | Utilizar `reversed()`                           |
| É necessário utilizar um segundo critério               | Utilizar `thenComparing()`                      |
| Os objetos encontram-se num `HashMap`                   | Criar um `ArrayList` a partir de `map.values()` |
| Os objetos encontram-se num array                       | Utilizar `Arrays.sort()`                        |

---
