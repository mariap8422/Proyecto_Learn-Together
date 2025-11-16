public class Stack {
    private LinkedListNode top;

    public Stack() {
        this.top = null;
    }

    public void push(Publicacion p) {
        LinkedListNode node = new LinkedListNode(p);
        node.siguiente = top;
        top = node;
    }

    public Publicacion pop() {
        if (top == null) return null;
        Publicacion value = top.dato;
        top = top.siguiente;
        return value;
    }
}