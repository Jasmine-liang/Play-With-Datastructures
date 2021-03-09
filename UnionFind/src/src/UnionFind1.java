public class UnionFind1 implements UnionFind{

    private int[] id;

    public UnionFind1(int size)
    {
        id = new int[size];
        for (int i = 0; i < id.length; i++) {
                id[i]  =  i;
        }
    }
    @Override
    public int getSize() {
        return id.length;
    }

    /*是否属于同一个集合*/
    @Override
    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    /*合并元素p,q所属集合, O(n)*/
    @Override
    public void unionElements(int p, int q) {
            int pId = find(p);
            int qId = find(q);

            if (qId == pId) return;
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId)
                id[i] = qId;
        }
    }

    /*查找元素p所对应的集合编号, O(1)*/
    private int find(int p){
        if (p < 0 && p >= id.length)
            throw new IllegalArgumentException("p is out of bound.");

        return id[p];
    }
}
