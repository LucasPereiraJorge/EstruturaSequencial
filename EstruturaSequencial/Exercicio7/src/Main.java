import java.util.Scanner;

public class Main {

    static  void meuMetodo(int lado){
        System.out.println("A área do quadrado é igual a: " + lado * lado + " , e o dobro dessa área é igual a: " + lado * lado * 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado");
        meuMetodo(scanner.nextInt());
    }
}
