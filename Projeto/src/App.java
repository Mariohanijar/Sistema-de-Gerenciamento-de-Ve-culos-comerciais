import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    Balcao balcao = new Balcao();
    Deposito deposito = new Deposito();

    String nomePacote;
    String conteudoPacote;
    String enderecoPacote;
    String escolha;

    while(true){

        System.out.println(" [1] Criar pacote\n [2] Visualizar pacotes\n [3] Processar pacote\n [4] Visualizar pacotes processados\n [5] Enviar proximo pacote\n [6] Sair da aplicação");
        escolha = scan.nextLine();

        if(escolha.equals("1")){
            System.out.println("Qual o nome do pacote: ");
            nomePacote = scan.nextLine();
            System.out.println("Qual o conteúdo do pacote: ");
            conteudoPacote = scan.nextLine();
            System.out.println("Qual o endereço do pacote: ");
            enderecoPacote = scan.nextLine();
            balcao.adicionarPacote(new Pacote(nomePacote, conteudoPacote, enderecoPacote));
        }
        else if(escolha.equals("2")){
            balcao.visualizarPedidos();
        }
        else if(escolha.equals("3")){
            deposito.processarPedido(balcao);
            
        }
        else if(escolha.equals("4")){
            deposito.visualizarPacotes();
            
        }
        else if(escolha.equals("5")){
            deposito.enviarPacote();
        }
        else if(escolha.equals("6")){
            break;
        }
        else{
            System.out.println("Opção inválida");
        }

    }

    }
}