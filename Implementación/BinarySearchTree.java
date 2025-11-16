public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Usuario u) {
        root = insertRec(root, u);
    }

    private TreeNode insertRec(TreeNode current, Usuario u) {
        if (current == null) return new TreeNode(u);

        if (u.getMateria().compareTo(current.dato.getMateria()) < 0) {
            current.left = insertRec(current.left, u);
        } else if (u.getMateria().compareTo(current.dato.getMateria()) > 0) {
            current.right = insertRec(current.right, u);
        }
        return current;
    }

    public Usuario findByMateria(String materia) {
        TreeNode found = findRec(root, materia);
        return found != null ? found.dato : null;
    }

    private TreeNode findRec(TreeNode current, String materia) {
        if (current == null || current.dato.getMateria().equals(materia)) {
            return current;
        }

        if (materia.compareTo(current.dato.getMateria()) < 0) {
            return findRec(current.left, materia);
        }
        return findRec(current.right, materia);
    }

    public Usuario findIterative(String materia) {
        TreeNode current = root;
        while (current != null && !current.dato.getMateria().equals(materia)) {
            if (materia.compareTo(current.dato.getMateria()) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return current != null ? current.dato : null;
    }
}