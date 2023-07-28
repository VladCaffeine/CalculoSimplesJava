import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("Valor A: ");
        int num1 = get.nextInt();

        System.out.print("Operador:\n+\n*\n-\n%\nEscolha: ");
        String operador = get.next();

        System.out.println("Valor B: ");
        int num2 = get.nextInt();

        Regra enter = new Regra();

        if ("+".equals(operador)) {
           int resultado1 = enter.soma(num1, num2);
           System.out.println(resultado1);
        }
        else if ("*".equals(operador)) {
            int resultado2 = enter.multiplicar(num1, num2);
            System.out.println(resultado2);
        }
        else if ("-".equals(operador)) {
            int resultado3 = enter.subtracao(num1, num2);
            System.out.println(resultado3);
        }
        else if ("%".equals(operador)) {
            int resultado4 = enter.divisao(num1, num2);
            System.out.println(resultado4);
        }
    }
}