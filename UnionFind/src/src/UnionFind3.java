
/*第三版并查集*/
public class UnionFind3 implements UnionFind{
    private int[] parent;
    private int[] sz;  //sz[i]表示以i为根的集合中元素个数

    public UnionFind3(int size){
        parent = new int[size];
        sz = new int[size];
        /*每一个节点独立的是一棵树*/
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            sz[i] = 1;
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

    /* O(h)
    * 根据两个元素所在的树的元素个数不同判断合并方向
    * 将元素个数少的集合合并到元素个数多的集合上
    * */
    @Override
    public void unionElements(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;
        if (sz[pRoot] < sz[qRoot]){
            parent[pRoot]  = qRoot;
            sz[qRoot] += sz[pRoot];
        }
        else {
            parent[qRoot] =  pRoot;
            sz[pRoot] += sz[qRoot];
        }
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