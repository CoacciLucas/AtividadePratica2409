public class Questao3A {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) { // <- Erro: Falta de um i++ dentro do while para incrementar o valor de i,
                         // fazendo com que o programa caia
                         // em um loop infinito
            System.out.println("Hello World\n");
        }

    }
}
