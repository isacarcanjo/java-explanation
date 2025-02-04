# O que é Java?

Java é uma linguagem de programação de alto nível, orientada a objetos, criada em 1995 pela Sun Microsystems.
Foi projetada para ser independente de plataforma, ou seja, pode rodar em qualquer dispositivo utilizando a JVM (Java Virtual Machine).

## Alguns conceitos relacionados ao Java:

### Programação Orientada a Objetos (OOP):
Java segue os princípios da OOP, utilizando objetos e classes como meio principal para estruturar e organizar o código.

### Independência de Plataforma:
Java pode ser executado em qualquer lugar, pois é compilado para bytecode, utilizando a JVM, o que permite sua execução em qualquer dispositivo.

### Gerenciamento de Memória:
Java possui gerenciamento automático de memória por meio do coletor de lixo (Garbage Collector), alocando e desalocando memória automaticamente.

### Concorrência:
Java oferece suporte a multithreading, permitindo que os desenvolvedores criem programas que executam múltiplas tarefas simultaneamente.

## Sintaxe

### Variáveis
Você pode declarar variáveis em Java de duas formas:

```java
Tipo nomeVariavel = valor;
var nomeVariavel = valor;
```
Uma vez definido o tipo, ele não pode ser alterado posteriormente.

```java
String nome = "Isac";
nome = 10; // Erro

var nome = "Jose";
nome = 10; // Erro
```

### Tipos de Dados
Java possui 8 tipos primitivos.

#### Numéricos

```java
byte, short, int, long
```

A diferença entre eles é apenas o tamanho e a quantidade de dados que podem armazenar.

#### Booleano
```java
boolean estaOK = true;
```

#### Caractere
Armazena apenas um caractere.
```java
char letra = 'A';
char letra = "AB"; // Erro

// Para armazenar strings, use a classe String.
String nome = "ABC";
```

#### Ponto Flutuante
Ambos armazenam números com casas decimais, mas `double` é mais preciso.
```java
double altura = 20.5;
float peso = 20.5F; // Sempre adicionar 'F' no final.
```

## Condicionais
A estrutura é similar a outras linguagens:
```java
if (condicao) {
} else if (outraCondicao) {
} else {
}
```

## Arrays

### Tamanho Definido
```java
int[] idades = new int[10];
String[] nomes = new String[10];
boolean[] status = new boolean[10];

int tamanho = idades.length;
```

Ou com valores iniciais:
```java
boolean[] status = {true, false, true};
```

### Array Dinâmico
```java
ArrayList<Tipo> nomeLista = new ArrayList<>();
ArrayList<Integer> idades = new ArrayList<>();
idades.add(10);
idades.remove(0);
idades.get(0);
idades.size();
```

## Laços de Repetição

### `for`
```java
for (int i = 0; i < 10; i++) {
}
```

### `while`
```java
int i = 0;
while (i < 10) {
   i++;
}
```

## Conversão de Tipos (Casting)

### Implícito
```java
int idade = 10;
double idade2 = idade; // Correto

idade = idade2; // Erro
```

### Explícito
```java
int idade = 10;
double idade2 = idade;
idade = (int) idade2; // Correto
```

### Strings
```java
char letra = 'a';
String nome = String.valueOf(letra);
letra = nome.charAt(0);
String idadeStr = String.valueOf(idade);
idade2 = Integer.parseInt(idadeStr);
```

## JDK, JVM e JRE

### JDK (Java Development Kit)
Pacote de ferramentas para desenvolvimento Java, incluindo o JRE, compilador `javac`, depurador `jdb`, entre outros.

### JVM (Java Virtual Machine)
Executa o bytecode gerado pelo compilador Java e gerencia memória, threads e coleta de lixo.

### JRE (Java Runtime Environment)
Ambiente de execução para programas Java, contendo a JVM e bibliotecas padrão.

## Spring Boot

- `@RestController`: Marca uma classe como um controlador REST.
- `@RequestMapping`: Define a URL de um método controlador.
- `@Autowired`: Injeta dependências automaticamente.
- `@Component`: Marca uma classe como componente gerenciado pelo Spring.
- `@Service`: Define um serviço com regras de negócio.
- `@RestControllerAdvice`: Manipula exceções globais para controladores REST.

### Spring JPA
Biblioteca ORM do Spring para persistência de dados.

## PostgreSQL

### Tipos de JOIN

- **INNER JOIN**: Retorna apenas registros correspondentes em ambas as tabelas.
- **LEFT JOIN**: Retorna todos os registros da tabela esquerda e correspondentes da direita.
- **RIGHT JOIN**: Retorna todos os registros da tabela direita e correspondentes da esquerda.
- **FULL JOIN**: Retorna todos os registros de ambas as tabelas.

### Monitoramento e Otimização de Consultas SQL
Utilize `VACUUM ANALYZE;` ou `EXPLAIN ANALYZE;` para verificar a performance.

### Transações
Uma transação é um conjunto de operações SQL executadas como uma unidade lógica.

## Scrum

Metodologia ágil com papéis como **Product Owner**, **Scrum Master** e **Development Team**,
artefatos como **Product Backlog** e **Sprint Backlog**, e eventos como **Planning**, **Daily Scrum**, **Review** e **Retrospective**.

---

Este documento fornece uma visão geral de Java, Spring Boot, PostgreSQL e Scrum. Se precisar de mais detalhes sobre algum tópico, me avise!

