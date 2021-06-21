import java.util.Scanner;

public class Main {
    static void meuMetodo(double ganhoPorHora, int horasTrabalhadas){
        System.out.println("O seu salário é igual a: " + ganhoPorHora * horasTrabalhadas);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quanto você ganha por hora e quantas horas você trabalha no dia");
        meuMetodo(scanner.nextDouble(), scanner.nextInt());
    }
}
