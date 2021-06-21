import java.util.Scanner;

public class Main {

    static void meuMetodo(double tempF){
        System.out.println("Essa temperatura em Celsius é igual a: " + 5 * ((tempF - 32) / 9 ));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit ");
        meuMetodo(scanner.nextDouble());
    }
}
