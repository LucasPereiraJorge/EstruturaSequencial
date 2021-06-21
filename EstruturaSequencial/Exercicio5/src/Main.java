import java.util.Scanner;

public class Main {

    static void meuMetodo(int QuantidadeEmMetros){
        System.out.println("Convertendo o valor para centímetros é igual a: " + QuantidadeEmMetros * 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo, aqui convertemos certimímetros para metros, por favor infome a quantidade em centímetros");
    }
}
