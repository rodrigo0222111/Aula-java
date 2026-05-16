import java.util.Scanner;
public class Merc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Sistema de Mercado====");
        //produto
        System.out.println("Digite o nome do produto");
        String produto = scanner.nextLine();
        //preço
        System.out.println("Digite o preço do produto");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade");
        int quantidade = scanner.nextInt();
        //Cálculo total
        double total = preco * quantidade;
        //variável de desconto
        double desconto = 0;
        //regra do desconto
        if (total >= 100) {
            desconto = total * 0.10;
        }
        //Valor final
        double Valorfinal = total -desconto;

        System.out.println("\n=== RESUMO DA COMPRA ====");

        System.out.println("Produto  " + produto);
        System.out.println("Preço  " + preco);
        System.out.println("Quantidade  " + quantidade);

        System.out.println("Total sem desconto: R$" + total);
        System.out.println("Desconto: " + desconto);
        
        System.out.println("Valor final: R$" + Valorfinal);

        System.out.println("=============");

        scanner.close();
    }
}
