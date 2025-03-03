import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Atribui o usuario e senha ja cadastrados
        String usuarioCadastrado = "admin";
        String senhaCadastrada = "1234";
        
        // Atribui o numero de tentativas restantes
        int tentativasRestantes = 3;
        
        // Titulo do sistema
        System.out.println("=== Sistema de Login ===");
        
        while (tentativasRestantes > 0) {
            // Pergunta o nome de usuário
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();
            
            // Pergunta a senha
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            
            // Verifica se o login está correto
            if (usuario.equals(usuarioCadastrado) && senha.equals(senhaCadastrada)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + ".");
                break;
            } else {
                tentativasRestantes--;
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
                
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Tente novamente mais tarde.");
                }
            }
        }
        
        scanner.close();
    }
}
