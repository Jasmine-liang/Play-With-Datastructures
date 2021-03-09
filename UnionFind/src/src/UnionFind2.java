public class UnionFind2 implements UnionFind{
    private int[] parent;

    public UnionFind2(int size){
        parent = new int[size];
        /*每一个节点独立的是一棵树*/
        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }


    @Override
    public int getSize() {
        return parent.length;
    }

    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /* O(h)*/
    @Override
    public void unionElements(int p, int q) {
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) return;
            parent[pRoot]  = qRoot;
    }
    /*
    * 查找元素p所对应的集合编号，即根节点。
    * 树的结构是孩子指向父亲
    * O(h)复杂度， h为树的高度
    * */
    private int find(int p){
        if (p < 0 && p >= parent.length)
            throw new IllegalArgumentException("p is out of bound.");

        while(p != parent[p]){
            p = parent[p];
        }
        return p;
    }
}
