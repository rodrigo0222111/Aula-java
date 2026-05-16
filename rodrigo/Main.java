import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
        System.out.println("Atalho - sysout");
       // String nome = "Rodrigo";
        //int idade = 39;
        //double altura = 1.78;
        //boolean aluno = false;
        
        //System.out.println(nome);
        //System.out.println(idade);
        //System.out.println(altura);
        //System.out.println(aluno);
        
       //Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite seu nome");
        //String nome = scanner.nextLine();
        //System.out.println("Olá  " + nome);

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Digite seu nome: ");
        // String nome = scanner.nextLine();
    //    System.out.println("Digite a sua idade:");
    //     int idade = scanner.nextInt();
    //     scanner.nextLine();
    //     System.out.println("Digite a sua cidade:");
    //     String cidade = scanner.nextLine();
    //     System.out.println("Sua cidade é: " + cidade + ".  Sua idade é: " + idade+ ".  Olá " + nome);
        
    //Teste de maioridade!!
    System.out.println("Digite a sua idade:");
    int idade = scanner.nextInt();
    if (idade >=18) {
        System.out.println("Maior de idade");
    }else{
        System.out.println("Menor de idade");
    }

    scanner.close();

    }
}
