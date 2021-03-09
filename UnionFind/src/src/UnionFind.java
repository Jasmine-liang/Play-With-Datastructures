public interface UnionFind {

    int getSize();
    /*是否属于同一个集合*/
    boolean isConnected(int p, int q);

    void unionElements(int p, int q);


}
