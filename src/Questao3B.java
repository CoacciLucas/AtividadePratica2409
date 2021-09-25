import java.util.Scanner;

public class Questao3B {

    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];

        Scanner input = new Scanner(System.in); // <- Defeito: Falta do import java.util.Scanner; para que o scanner
                                                // possa ser utilizado
                                                // Erro: falta do método close() para fechar o Scanner()

        for (int i = 0; i < 10; i++) { // <- Defeito: Presença de i <= 10 faz com que haja uma tentativa de se
                                       // adicionar 11 índices em um vetor com 10 índices
            System.out.println("Informe um numero: ");
            vetor1[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {// <- Defeito: Presença de i <= 10 faz com que haja uma tentativa de se
                                      // adicionar 11 índices em um vetor com 10 índices
            // for (int j = 0; j < 10; j++) {// <- Defeito: Presença de j <= 10 faz com que
            // haja 100 verificações em um
            // vetor com 10 indices

            if (vetor1[i] == vetor2[i]) {
                cont++;
            }
            // }
        }
        input.close();

    }

}
