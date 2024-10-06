public class Questao1 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k<indice){
            k++;
            soma += k;
            System.out.println(soma);
        }

        System.out.println("\nO valor da variável soma é: " + soma);
    }
}
