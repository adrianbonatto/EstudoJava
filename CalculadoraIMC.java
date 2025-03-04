import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso = 0, altura = 0; // Criação da Variavel
        
        // Loop para pegar um valor valido do peso
        while (true) {
            System.out.print("Digite seu peso: ");
            peso = scanner.nextDouble();
            
            if (peso > 0) {
                break;
            } else {
                System.out.println("Peso inválido! Digite um valor maior que zero.");
            }
        }
        
        // Loop para pegar um valor valido da altura
        while (true) {
            System.out.print("Digite sua altura: ");
            altura = scanner.nextDouble();
            
            if (altura > 0) {
                break;
            } else {
                System.out.println("Altura inválida! Digite um valor maior que zero.");
            }
        }
        
        // Calcula o IMC
        double imc = peso / (altura * altura);
        
        // Exibe a classificação do IMC
        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade Grau 1";
        } else if (imc < 39.9) {
            classificacao = "Obesidade Grau 2";
        } else {
            classificacao = "Obesidade Grau 3 (Mórbida)";
        }
        
        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f (%s)\n", imc, classificacao);
        
        scanner.close();
    }
} 