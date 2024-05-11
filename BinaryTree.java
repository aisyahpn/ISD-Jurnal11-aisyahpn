class BinaryTree<E> {
    private BTNode root;

    // konstruktor
    public BinaryTree() {
        root = null;
    }

    // berfungsi untuk memeriksa apakah pohon (tree) kosong
    public boolean isEmpty() {
        return root == null;        // mengembalikan akar; dan juga berfungsi
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk memasukkan data
    public void insert(E data) {        // publik, dapat diakses di luar kelas ini
        root = insert(root, data);      // root untuk memanggil metode penyisipan yang berada tepat di bawah metode ini
    }

    // berfungsi untuk memasukkan data secara rekursif
    private BTNode insert(BTNode node, E data) {        // tidak ada konflik meskipun kedua metode tersebut memiliki nama yang sama
        if (node == null) {                             // karena pengubah akses metode ini adalah PRIVATE yang dapat diakses
            node = new BTNode(data);                    // hanya di dalam kelas ini ( dapat digunakan metode penyisipan di dalam di atas). dibutuhkan 2 parameter
        }
        else {
            if (node.getLeft() == null) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk menghitung jumlah node
    public int countNodes() {
        return countNodes(root);
    }

    // berfungsi untuk menghitung jumlah node secara rekursif
    private int countNodes(BTNode r) {
        if (r == null) {
            return 0;
        } else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk mencari suatu elemen
    public boolean search(E val) {
        return search(root, val);
    }

    // berfungsi untuk mencari elemen secara rekursif
    private boolean search(BTNode r, E val) {
        if (r.getData() == val) {
            return true;
        }
        if (r.getLeft() != null)  {
            if (search(r.getLeft(), val)) {
                return true;
            }
        }
        if (r.getRight() != null) {
            if (search(r.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk traversal inorder
    public void inorder() {             // publik, dapat diakses di luar kelas ini
        inorder(root);                  // root untuk memanggil metode inorder dengan argumen yang tepat di bawah metode ini
    }

    // traversal inorder secara rekursif
    private void inorder(BTNode r) {                    // ini adalah metode PRIVATE yang digunakan di dalam metode inorder
        if (r != null) {                                // tepat di atas metode ini. dibutuhkan satu parameter
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk traversal preorder
    public void preorder() {
        preorder(root);
    }

    // traversal preorder secara rekursif
    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

// ----------------------------------------------------------------------------

    // berfungsi untuk traversal postorder
    public void postorder() {
        postorder(root);
    }

    // traversal postorder secara rekursif
    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
}
