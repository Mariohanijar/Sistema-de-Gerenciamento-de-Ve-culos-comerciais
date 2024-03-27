public class Deposito {
    Node head;

    public Deposito(){
        this.head = null;
    }

    public void empilharPacote(Pacote data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    public Pacote enviarPacote(){
        if (head == null) {
            System.out.println("Depósito vazio!");
            return null;
        } else {
            Pacote pacoteEnviado = head.data;
            head = head.next;
            return pacoteEnviado;
        }
    }

    public void visualizarPacotes(){
        Node current = head;
        while (current != null) {
            System.out.println("Nome do Pacote: " + current.data.getNome());
            System.out.println("Descrição do Conteúdo: " + current.data.getDescricao());
            System.out.println("Endereço de Destino: " + current.data.getEndereco());
            System.out.println("-------------------------");
            current = current.next;
        }
    }

    public void processarPedido(Balcao balcao) {
        Node proximoPedido = balcao.head;
        if (proximoPedido == null) {
            System.out.println("Balcão vazio!");
        } else {
            balcao.head = balcao.head.next;
            empilharPacote(proximoPedido.data);
            System.out.println("Pedido processado: " + proximoPedido.data.getNome());
        }
    }

}
