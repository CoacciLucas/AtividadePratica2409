import java.util.Scanner;

public class Trapezio {
    static void calcTrapezio(float altura, float baseMaior, float baseMenor) {
        float area, mE;
        area = ((baseMaior + baseMenor) * altura) / 2;
        mE = (baseMaior - baseMenor) / 2;
        System.out.println("A area é: " + area);
        System.out.println("A mediana de Euler é: " + mE);
    }

    public static void main(String Args[]) {

        float altura, baseMaior, baseMenor;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a altura do trapézio: ");
        altura = input.nextFloat();
        System.out.print("Informe a base maior do trapézio: ");
        baseMaior = input.nextFloat();
        System.out.print("Informe a base menor do trapézio: ");
        baseMenor = input.nextFloat();

        calcTrapezio(altura, baseMaior, baseMenor);
    }
}
