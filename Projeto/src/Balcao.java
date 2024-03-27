class Balcao {
    private Node head;
    private Node tail;

    public Balcao() {
        this.head = null;
        this.tail = null;
    }


    public void adicionarPacote(Pacote pacote) {
        Node temp = new Node(pacote);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    public void visualizarPedidos() {
        Node current = head;
        while (current != null) {
            System.out.println("Nome do pacote: " + current.data.getNome());
            System.out.println("Descrição do conteúdo: " + current.data.getDescricao());
            System.out.println("Endereço de destino: " + current.data.getEndereco());
            current = current.next;
        }
    }
}