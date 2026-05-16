import java.util.Scanner;
public class cad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("===Sistema De Cadastro===");
        
        // System.out.println("Digite seu nome completo:");
        // String nome = scanner.nextLine();
        
        // System.out.println("Digite a sua idade :");
        // int idade = scanner.nextInt();

        // System.out.println("\n===Resultado===");

        // System.out.println("Nome: " + nome);
        // System.out.println("Idade" + idade);

        // if (idade >= 18) {
        //     System.out.println("Status: Maior de idade");
        // }else{ 
        //     System.out.println("Status: Menor de idade");
        //     }
        //     System.out.println("===============");






           System.out.println("===Sistema De Cadastro===");
        
        System.out.println("Digite o nome do Curso:");
        String Curso = scanner.nextLine();
        
        System.out.println("Digite a sua nota :");
        int nota = scanner.nextInt();
        
        scanner.nextLine();
        System.out.println("Digite a sua idade :");
        int idade = scanner.nextInt();


        System.out.println("\n===Resultado===");

        System.out.println("curso: " + Curso);
        System.out.println("Idade" + idade);
        System.out.println("Nota" + nota);


        if (idade >= 18) {
            System.out.println("Status idade: Maior de idade");
        }else{ 
            System.out.println("Status idade: Menor de idade");
            }
        
        if (nota >= 7) {
            System.out.println("Status curso: Aprovado");
        }else{ 
            System.out.println("Status curso: Reprovado");
            }
            System.out.println("===============");

            scanner.close();
    }
}