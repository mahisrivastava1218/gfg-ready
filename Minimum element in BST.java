class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if(node==null) return -1;
        Node cur=node;
        while(cur.left != null){
            cur=cur.left;
        }
        return cur.data;
    }
}
