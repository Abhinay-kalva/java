import java.util.*;
class thread1 implements Runnable{
    public void run(){
    for(int i=0;i<50;i++){
        if(i%2==0){
            System.out.println("thread1:"+i);
        }
    }
}
}
class thread2 implements Runnable{
   public  void run(){
    for(int i=0;i<50;i++){
        if(i%2==1){
            System.out.println("thread2:"+i);
        }
    }
}
}

class vishnu{
public static void main(String[] args){
thread1 t1=new thread1();
thread2 t2=new thread2();
Thread a=new Thread(t1);
Thread b=new  Thread(t2);
a.start();
b.start();
}
}
