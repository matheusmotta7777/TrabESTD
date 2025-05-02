import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(1, "Lâmpada do Quarto");
        DispositivoService service = new DispositivoService();
        Conectavel conexao = lampada;

        Scanner scanner = new Scanner(System.in);
        System.out.println(conexao.conectar());

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Executar Ação");
            System.out.println("4 - Desconectar e Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            String resposta;
            switch (opcao) {
                case 1:
                    resposta = service.ligarDispositivo(lampada);
                    break;
                case 2:
                    resposta = service.desligarDispositivo(lampada);
                    break;
                case 3:
                    resposta = service.executarAcao(lampada);
                    break;
                case 4:
                    resposta = conexao.desconectar();
                    break;
                default:
                    resposta = "Opção inválida!";
            }

            System.out.println(resposta);

        } while (opcao != 4);

        scanner.close();
        System.out.println("Aplicação encerrada.");
    }
}
