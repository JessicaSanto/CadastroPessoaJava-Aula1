import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema de cadastro de Pessoas Físicas e Juridicas");

        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {

            System.out.println("Escolha uma opção: 1 - Pessoa Física / 2 - Pessoa Jurídica / 0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoPf;

                    do {
                        System.out.println("Escolha uma opção: 1 - Cadastrar Pessoa Física / 2 - Listar Pessoa Física / 0 - Voltar ao menu anterior");

                        opcaoPf = scanner.nextInt();

                        switch (opcaoPf) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 0:
                                break;
                            default:
                                break;
                        }

                    } while (opcaoPf != 0);
                    break;

                case 2:
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        } while (opcao != 0);

    }
}