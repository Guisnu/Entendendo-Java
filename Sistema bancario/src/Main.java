import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);

        String tipoConta = "";
        String nome = "";

        int opcao = 0;

        while (opcao != 1 && opcao !=2) {

            System.out.print("Nome do cliente: ");
            nome = ls.nextLine();

            System.out.println("===== Tipo da conta =====");
            System.out.println("1-Corrente\n2-poupança");

            opcao = ls.nextInt();

            switch (opcao) {
                case 1:
                    tipoConta = "Corrente";
                    break;

                case 2:
                    tipoConta = "Poupança";
                    break;

                default:
                    System.out.println("opção inválida!");
                    break;
            }

        }

        double saldo = 0;

        System.out.println("====================");
        System.out.println("Dados iniciais do cliente\n");
        System.out.println("Nome:             " + nome);
        System.out.println("Tipo da conta:    " + tipoConta);
        System.out.println("Saldo             " + "R$" + String.format("%.2f", saldo) + "\n");
        System.out.println("====================");
        int opcao1 = 0;

        while(opcao1 != 4){

        System.out.println("""
                ** Selecione a opção desejada **
                
                1-Consultar saldo
                2-Depositar
                3-Sacar
                4-Sair
                
                """);

        opcao1 = ls.nextInt();

            switch (opcao1){
                case 1:
                    System.out.println("Saldo: R$" + String.format("%.2f", saldo) + "\n");
                    break;

                case 2:
                    System.out.print("Digite o valor que deseja depositar: ");
                    int valorDeposito = ls.nextInt();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Deposito realizado!!\n");
                        break;
                    }
                    System.out.println("O valor deve ser maior que zero!");
                    break;

                case 3:
                    System.out.print("Digite o valor que deseja sacar: ");
                    int valorSaque = ls.nextInt();
                    if (valorSaque <= saldo){
                        saldo -= valorSaque;
                        System.out.println("Saque Realizado!\n");
                        break;
                    }
                    System.out.println("Você não tem saldo suficiente!");
                    break;

                case 4:
                    System.out.println("Obrigado por usar nosso sistema!");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
                    break;
            }

        }

    ls.close();
    }
}
