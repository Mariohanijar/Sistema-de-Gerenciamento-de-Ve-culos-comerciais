class Balcao {
    Node head;
    Node tail;

    public Balcao() {
        this.head = null;
        this.tail = null;
    }


    public void adicionarPacote(Pacote data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void visualizarPedidos() {
        Node current = head;
        System.out.println("Pacotes no Balcao aguardando processamento:");
        while (current != null) {
            System.out.println("Nome do pacote: " + current.data.getNome());
            System.out.println("Descrição do conteúdo: " + current.data.getDescricao());
            System.out.println("Endereço de destino: " + current.data.getEndereco());
            System.out.println();
            current = current.next;
        }
    }
}