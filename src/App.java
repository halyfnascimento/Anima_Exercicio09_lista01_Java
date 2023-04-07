import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Variaveis.
        double Fahrenheit;
        double Celsius;
        double conversor;
        Scanner teclado = new Scanner(System.in);
        // Ação 1.
        System.out.println("Qual a temperatura em Fahrenheit");
        Fahrenheit = teclado.nextDouble();
        teclado.close();
        // Calculo de Variaveis.
        conversor = (Fahrenheit - 32);
        Celsius = (conversor / 1.8);
        // Ação 2.
        System.out.println("A temperatura em Celsius é");
        System.out.println(Celsius);

    }
}