import java.util.Scanner;

public class Trapezio {
    static void calcTrapezio() {
        float altura, baseMaior, baseMenor, area, mE;
        Scanner input = new Scanner(System.in);// Erro: falta do método close() para fechar o Scanner()
        System.out.print("Informe a altura do trapézio: ");
        altura = input.nextFloat();
        System.out.print("Informe a base maior do trapézio: ");
        baseMaior = input.nextFloat();
        System.out.print("Informe a base menor do trapézio: ");
        baseMenor = input.nextFloat();
        area = ((baseMaior + baseMenor) * altura) / 2;
        mE = (baseMaior - baseMenor) / 2;
        System.out.println("A area é: " + area);
        System.out.println("A mediana de Euler é: " + mE);
        input.close();// <- Método adicionado
    }

    public static void main(String Args[]) {

        calcTrapezio();

    }
}
