import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1, nota2, nota3, media; // Cria variavel que armazena numeros decimais
        
        while (true) {
            System.out.println("Digite a primeira nota:");
            nota1 = scanner.nextDouble(); // Captura o valor digitado
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            } else {
                break;
            } // se nota1 menor que 0 ou maior que 10 exibe mensagem e pede para digitar novamente
        }
        
        while (true) {
            System.out.println("Digite a segunda nota:");
            nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            } else {
                break;
            } // se nota2 menor que 0 ou maior que 10 exibe mensagem e pede para digitar novamente
        }
        
        while (true) {
            System.out.println("Digite a terceira nota:");
            nota3 = scanner.nextDouble();
            if (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            } else {
                break;
            } // se nota3 menor que 0 ou maior que 10 exibe mensagem e pede para digitar novamente
        }
        
        media = (nota1 + nota2 + nota3) / 3; // Calculo da média
        
        System.out.printf("A média das notas é: %.2f\n", media); // Exibe a média com formatação de 2 casas decimais
        
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");


        if (media >= 6 && media < 7) { // Se media for maior ou igual a 6 e menor que 7 exibe mensagem sobre arredondamento
            System.out.println("Deseja arrendondar a média para 7.0? (S/N)");
            char opcao = scanner.next().charAt(0); // Recebe a primeira letra digitada
            if (opcao == 'S' || opcao == 's') {
                media = 7.0; // Media do aluno recebe o valor 7
                System.out.printf("A média arredondada é: %.2f\n", media); 
            }
            if (opcao == 'N' || opcao == 'n') {
                System.out.println("Aluno reprovado.");
            }
            if (opcao != 'S' && opcao != 's' && opcao != 'N' && opcao != 'n') {
                System.out.println("Opção inválida!");
            } // se opcao diferente de S, s, N, n exibe mensagem de opção inválida
        }
        
        scanner.close();
    }
    }
}
