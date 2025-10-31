import java.util.*;
public class dijsktra {
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[][]=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[i][j]=s.nextInt();
        }
    }
    dik(a,n);
s.close();
}
static void dik(int a[][],int n){
    boolean vis[]=new boolean[n];
    int dis[]=new int[n];
    Arrays.fill(dis,1000);
    dis[0]=0;
    for(int count=0;count<n-1;count++){
        int x=min(dis,vis,n);
        vis[x]=true;
        for(int i=0;i<n;i++){
            if(!vis[i]&& a[x][i]!=0 && dis[x]!=1000 && dis[x]+a[x][i]<dis[i]){
                dis[i]=dis[x]+a[x][i];
            }
        }

    }
    System.out.println("distance vector");
    for(int i=0;i<n;i++){
        System.out.println(dis[i]);
    }
}
static int min(int []dis,boolean []vis,int n){
    int m=Integer.MAX_VALUE,index=-1;
    for(int i=0;i<n;i++){
        if(!vis[i]&& dis[i]<=m){
            m=dis[i];
            index=i;
        }
    }
    return index;
}    
}
