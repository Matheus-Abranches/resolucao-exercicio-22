import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Divisao divisao = new Divisao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o valor A");
        int valorA = scanner.nextInt();
        System.out.println("digite o valor B");
        int valorB = scanner.nextInt();

        divisao.divisaoEntreAeB(valorA, valorB);


    }
}