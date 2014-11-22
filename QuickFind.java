

/**
 * QuickFind[eager approach]
 * Union too expensive(N operations)
 * Trees are flat, but too expensive to keep them flat.
 */

public class QuickFind {
    //Integer array id[] of size N.
    private int[] id;
    
    public QuickFind(int n){
        id = new int[n];
        //set id of each obejects to itself
        for(int i=0;i<n;i++){
            id[i] = i;
        }
    }
    
    //p and q are connected if p and q have the same id.
    //Check if p and q have the same id.
    public boolean connected(int p, int q){
        return id[p] == id[q];
        
    }
    
    //To merge sets containing p and q, change all entries with id[p] to id[q].
    public void union(int p ,int q){
        int pid = id[p];
        int qid = id[q];
        for(int i=0;i<id.length;i++){
            if(id[i]==pid){
                id[i] = qid;
            }
        }
    }
    
    public static void main(String ar[]){
        QuickFind q = new QuickFind(10);
        q.union(3, 4);
        q.union(4, 9);
        q.union(8, 0);
        q.union(2, 3);
        q.union(5, 6);
        q.union(4, 9);
        q.union(7, 3);
        q.union(4, 8);
        q.union(6, 1);
        for (int i = 0; i < 10; i++) 
            System.out.print(q.id[i] + " ");
    }
}
