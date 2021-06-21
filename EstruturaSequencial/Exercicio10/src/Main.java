import java.util.Scanner;

public class Main {

    static void meuMetodo(double tempC){
        System.out.println("Em Fahrenheit a temperatura é igual a: " + ((tempC * 9 / 5) + 32));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius");
        meuMetodo(scanner.nextDouble());
    }
}
