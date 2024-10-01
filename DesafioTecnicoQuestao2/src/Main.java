import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int fibo = 0;
        int aux = 1;

        System.out.println("Informe um número:");
        numero = entrada.nextInt();
        entrada.close();


        while (!(numero<=fibo)) {
            fibo += aux;
            aux = fibo - aux;
//            System.out.println(fibo);
        }

        if (numero==fibo) {
            System.out.println("\nO número " + numero + " pertence a sequência de Fibonacci!");
        } else {
            System.out.println("\nO número " + numero + " não pertence a sequência de Fibonacci!");
        }
    }
}
