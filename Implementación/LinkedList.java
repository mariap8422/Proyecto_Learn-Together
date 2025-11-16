public class LinkedList {
    private LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAfter(LinkedListNode prev, Publicacion p) {
        if (prev == null) return;
        LinkedListNode newNode = new LinkedListNode(p);
        newNode.siguiente = prev.siguiente;
        prev.siguiente = newNode;
    }

    public void insert(int index, Publicacion p) {
        LinkedListNode newNode = new LinkedListNode(p);
        if (index == 0) {
            newNode.siguiente = head;
            head = newNode;
            return;
        }

        LinkedListNode current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.siguiente;
            i++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        newNode.siguiente = current.siguiente;
        current.siguiente = newNode;
    }

    public LinkedListNode lookup(int index) {
        LinkedListNode current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.siguiente;
            i++;
        }
        return current;
    }

    public void delete(int index) {
        if (head == null) return;

        if (index == 0) {
            head = head.siguiente;
            return;
        }

        LinkedListNode current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.siguiente;
            i++;
        }

        if (current == null || current.siguiente == null) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        current.siguiente = current.siguiente.siguiente;
    }
}