import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("|| Conversor de Temperatura ||");
        
        int origem = 0;
        int destino = 0;
        
        // Confere o valor entrado seja valido
        while (true) {
            System.out.println("Escolha a unidade de origem:");
            System.out.println("1 - Celsius\n2 - Fahrenheit\n3 - Kelvin");
            origem = scanner.nextInt();
            if (origem >= 1 && origem <= 3) {
                break;
            } else {
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
            }
        }
        
        // Confere o valor entrado seja valido
        while (true) {
            System.out.println("Escolha a unidade de destino:");
            System.out.println("1 - Celsius\n2 - Fahrenheit\n3 - Kelvin");
            destino = scanner.nextInt();
            if (destino >= 1 && destino <= 3) {
                break;
            } else {
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
            }
        }
        
        System.out.print("Digite o valor da temperatura: ");
        double valor = scanner.nextDouble();
        
        double resultado = 0;
        String unidadeDestino = "";
        
        // Realiza os calculos de conversão com base na escolha
        if (origem == 1 && destino == 2) {
            resultado = (valor * 9/5) + 32;
            unidadeDestino = "Fahrenheit";
        } else if (origem == 1 && destino == 3) {
            resultado = valor + 273.15;
            unidadeDestino = "Kelvin";
        } else if (origem == 2 && destino == 1) {
            resultado = (valor - 32) * 5/9;
            unidadeDestino = "Celsius";
        } else if (origem == 2 && destino == 3) {
            resultado = (valor - 32) * 5/9 + 273.15;
            unidadeDestino = "Kelvin";
        } else if (origem == 3 && destino == 1) {
            resultado = valor - 273.15;
            unidadeDestino = "Celsius";
        } else if (origem == 3 && destino == 2) {
            resultado = (valor - 273.15) * 9/5 + 32;
            unidadeDestino = "Fahrenheit";
        }
        
        // Exibe o resultado da conversão
        System.out.printf("Resultado: %.2f %s\n", resultado, unidadeDestino);
        
        scanner.close();
    }
}
