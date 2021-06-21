import java.util.Scanner;

public class Main {

    static void meuMetodo (int numero){
        System.out.println("O número digitado foi: " + numero);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        meuMetodo(scanner.nextInt());
    }
}
