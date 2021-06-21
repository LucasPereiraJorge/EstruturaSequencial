import java.util.Scanner;

public class Main {

    static void meuMetodo (int número1 , int número2){
        System.out.println("A soma dos 2 numeros é igual a: " + número1 + número2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números");
        meuMetodo(scanner.nextInt(), scanner.nextInt());
    }
}
