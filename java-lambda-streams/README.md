# Java - Lambda Expressions and Streams

## Streams e algumas características
- Streams são uma nova abstração introduzida no Java 8 para manipular coleções de dados de forma mais eficiente.
- Streams permitem que você execute operações em coleções de dados de forma paralela e concorrente.
- Streams são uma maneira mais eficiente de manipular coleções de dados do que as coleções tradicionais.
- Recebe outras funções como parâmetros.
  - Exemplo: `filter`, `map`, `reduce`, `forEach`.
  - Isso permite que você escreva código mais conciso e legível.
  - Isso também permite que você escreva código mais genérico e reutilizável.
- Streams são lazy, o que significa que eles não são executados até que uma operação terminal seja chamada.
- Streams são fluent, o que significa que você pode encadear várias operações em um único stream.
- Streams são imutáveis, o que significa que eles não podem ser modificados após a criação.
- Sobre efeito colateral: Streams não têm efeitos colaterais, o que significa que eles não alteram o estado dos objetos que estão sendo manipulados.
- As funções passadas para um stream são chamadas de funções lambda ou funções puras.
- O que é função pura? 
  - Uma função pura é uma função que não tem efeitos colaterais e sempre retorna o mesmo resultado para o mesmo conjunto de argumentos.


## Operações intermediárias - Stream API
- filter
- map
- flatMap
- distinct
- sorted
- peek
- limit
- skip
- takeWhile
- dropWhile

## Qual a diferença entre operações intermediárias e terminais?
- Operações intermediárias são aquelas que retornam um novo stream. Elas são usadas para construir uma sequência de operações a serem realizadas no stream.
- Operações terminais são aquelas que retornam um resultado final. Elas são usadas para finalizar a sequência de operações no stream.
- Operações intermediárias são lazy, ou seja, elas não são executadas até que uma operação terminal seja chamada.
- Operações terminais são eager, ou seja, elas são executadas imediatamente.
- Operações intermediárias são avaliadas em ordem, da primeira para a última.
- Operações terminais são avaliadas em ordem, da última para a primeira.
- Operações intermediárias são avaliadas uma vez.
- Operações terminais são avaliadas uma vez.


### filter

```java
List<String> list = Arrays.asList("a", "b", "c", "d", "e");
List<String> filteredList = list.stream()
    .filter(s -> s.compareTo("b") > 0)
    .collect(Collectors.toList());
```

### map

```java
List<String> list = Arrays.asList("a", "b", "c", "d", "e");
List<String> mappedList = list.stream()
    .map(s -> s.toUpperCase())
    .collect(Collectors.toList());
```

### flatMap
- flatMap é usado para transformar um stream de elementos em um stream de elementos diferentes.
- flatMap é útil quando você tem um stream de streams e deseja transformá-lo em um único stream.

```java
List<List<String>> list = Arrays.asList(
    Arrays.asList("a", "b"),
    Arrays.asList("c", "d"),
    Arrays.asList("e", "f")
);
List<String> flatMappedList = list.stream()
    .flatMap(l -> l.stream())
    .collect(Collectors.toList());
```

### distinct

```java
List<String> list = Arrays.asList("a", "b", "c", "a", "b", "c");
List<String> distinctList = list.stream()
    .distinct()
    .collect(Collectors.toList());
```

## Operações terminais - Stream API
- forEach
 - forEach é usado para iterar sobre os elementos do stream. 
- collect
 - toList
  - Converte o stream em uma lista. 
- reduce
  - reduce é usado para combinar os elementos de um stream em um único valor. 
- count
  - Retorna o número de elementos no stream. 
- min
  - Retorna o menor elemento do stream. 
- max
  - Retorna o maior elemento do stream.
- anyMatch
  - Retorna true se algum elemento do stream satisfaz a condição especificada.
- allMatch
  - Retorna true se todos os elementos do stream satisfazem a condição especificada.
- noneMatch
  - Retorna true se nenhum elemento do stream satisfaz a condição especificada. 
- findFirst
  - Retorna o primeiro elemento do stream. 
- findAny
  - Retorna qualquer elemento do stream. 
- toArray
  - Converte o stream em um array. 
- sum
  - Retorna a soma de todos os elementos do stream. 
- average
  - Retorna a média de todos os elementos do stream. 
- summaryStatistics
 - Retorna um objeto que contém várias estatísticas, como a soma, a média, o mínimo, o máximo e o número de elementos no stream. 
- groupingBy
 - Agrupa os elementos do stream com base em uma função de agrupamento. 
- partitioningBy
 - Divide os elementos do stream em dois grupos com base em uma condição booleana. 
- joining
 - Concatena os elementos do stream em uma única string. 
- counting
 - Retorna o número de elementos no stream. 
- summingInt
 - Retorna a soma dos valores inteiros no stream. 
- averagingInt
 - Retorna a média dos valores inteiros no stream. 