import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        int opcao;

        Scanner input = new Scanner(System.in);
        double n1, n2, divisao, raio, area;

        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Divisão");
            System.out.println("2: Área do Círculo");
            System.out.println("3: Média de 5 números");
            System.out.println("4: Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite os números: ");
                    n1 = input.nextDouble();
                    n2 = input.nextDouble();
                    divisao = n1 / n2;
                    System.out.println("Resultado da divisão: " + divisao);
                    break;
                case 2:
                    System.out.println("Digite o raio: ");
                    raio = input.nextDouble();
                    area = Math.PI * Math.pow(raio, 2); // area = Math.PI * Math.pow(raio, 3); <- falha
                    System.out.format("Área do círculo: %.2f\n", area);
                    break;
                case 3:
                    System.out.println("Digite os 5 números: ");
                    double numeros[] = new double[5];
                    double soma = 0;
                    for (int i = 0; i < 5; i++) { // for (int i = 1; i <= 5; i++) <- defeito
                        numeros[i] = input.nextDouble();
                        soma = soma + numeros[i];
                    }
                    System.out.println("Média: " + soma / 5);

                    break;
                case 4:
                    System.out.println("Fim do programa!");
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4); // while (opcao <= 4); <- erro
    }

}
