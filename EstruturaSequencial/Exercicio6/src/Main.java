import java.util.Scanner;

public class Main {

    static void meuMetodo(int raio, double PI){
        System.out.println("A área é igual a: " + raio * PI);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio do circulo");
        meuMetodo(scanner.nextInt(), 3.14);
    }
}
