import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void reverseHello() {
        String text = "hello";
        int length = text.length();
        String reverse = "";
        for (int i=0; i < length; i++) {
            reverse = text.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }

    public static void sumNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void highestNumber() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        IntSummaryStatistics sum = list.stream().mapToInt((i) -> i).summaryStatistics();
        System.out.println(sum.getMin());
        System.out.println(sum.getMax());
    }
}
// listas, árvores, grafos, pilhas, filas, e hashmaps.
// programação orientada a objetos, exceções, coleções, streams, e lambdas.
// funciona a gestão de memória (heap, stack) e garbage collection.
// funcionamento do Spring Data JPA, incluindo mapeamento de entidades e o uso de repositórios.
// Reforce conhecimentos sobre consultas SQL, especialmente JOINs, subqueries, e agregações.
// Entenda o papel de cada membro da equipe dentro do Scrum (Product Owner, Scrum Master, Desenvolvedor).
//