public class Queue {
    private LinkedListNode front;
    private LinkedListNode back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(Publicacion p) {
        LinkedListNode node = new LinkedListNode(p);
        if (back == null) {
            front = back = node;
        } else {
            back.siguiente = node;
            back = node;
        }
    }

    public Publicacion dequeue() {
        if (front == null) return null;
        Publicacion value = front.dato;
        front = front.siguiente;
        if (front == null) back = null;
        return value;
    }
}