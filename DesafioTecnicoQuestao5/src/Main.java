import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        int inicio = 0;
        int fim;
        char[] caracteres;
        char[] caracteresInvertidos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma String:");
        str = entrada.nextLine();

        fim = str.length() - 1;
        caracteres = str.toCharArray();
        caracteresInvertidos = str.toCharArray();

        for (int i = fim; i >= 0; i--) {
            caracteresInvertidos[inicio] = caracteres[i];
            inicio++;
//            System.out.println(new String(caracteresInvertidos));
        }

        str = new String(caracteresInvertidos);

        System.out.println("\nString com os caracteres invertidos:");
        System.out.println(str);
    }
}
