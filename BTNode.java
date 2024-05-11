class BTNode<E> {
    BTNode left, right;
    E data;

    // konstruktor
    public BTNode() {
        left = null;
        right = null;
        data = null;
    }

    // konstruktor
    public BTNode(E item) {
        left = null;
        right = null;
        data = item;
    }

    // berfungsi untuk mengatur simpul kiri
    public void setLeft(BTNode n) {
        left = n;
    }

    // berfungsi untuk mengatur node yang tepat
    public void setRight(BTNode n) {
        right = n;
    }

    // berfungsi untuk mendapatkan simpul kiri
    public BTNode getLeft() {
        return left;
    }

    // berfungsi untuk mendapatkan node yang tepat
    public BTNode getRight() {
        return right;
    }

    // berfungsi untuk mengatur data ke node
    public void setData(E d) {
        data = d;
    }

    // berfungsi untuk mengambil data dari node
    public E getData() {
        return data;
    }
}