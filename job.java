import java.util.*;
class j{
    char id;
    int deadline;
    int profit;
    j(char id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
public class job {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        j jobs[]=new j[n];
       for(int i=0;i<n;i++){
        jobs[i]=new J(s.next().charAt(0), s.nextInt(), s.nextInt());
       }
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int max=Integer.MIN_VALUE;
        for(j i:jobs){
            if(i.deadline>max){
                max=i.deadline;
            }
        }
        boolean[]a=new boolean[max];
        char result[]=new char[max];
        int maxprofit=0;
        for(j i:jobs){
            for(int k=Math.min(max,i.deadline)-1;k>=0;k--){
                if(!a[k]){
                    a[k]=true;
                    result[k]=i.id;
                    maxprofit+=i.profit;
                    break;
                }
            }
        }
        System.out.println(maxprofit);
    }
}
