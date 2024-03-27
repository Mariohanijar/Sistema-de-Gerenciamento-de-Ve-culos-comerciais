public class App {
    public static void main(String[] args) throws Exception {
        
        Balcao balcao = new Balcao();

        balcao.adicionarPacote(new Pacote("Pacote 1", "Conteúdo do pacote 1", "Endereço do pacote 1"));
        balcao.adicionarPacote(new Pacote("Pacote 2", "Conteúdo do pacote 2", "Endereço do pacote 2"));
        balcao.adicionarPacote(new Pacote("Pacote 3", "Conteúdo do pacote 3", "Endereço do pacote 3"));
        balcao.adicionarPacote(new Pacote("Pacote 4", "Conteúdo do pacote 4", "Endereço do pacote 4"));
        balcao.adicionarPacote(new Pacote("Pacote 5", "Conteúdo do pacote 5", "Endereço do pacote 5"));

        balcao.visualizarPedidos();


    }
}
