

class node<t>{
    t data;
    node<t>next;
    public node(t data){
        this.data=data;
        this.next=null;
    }
}
    class genstack<t>{
        node<t>front,rear;
        public genstack(){
            front=rear=null;
        }
        void push(t item){
            node<t> nn=new node<>(item);
           if(rear==null){
            front=rear=nn;
           }
           rear.next=nn;
           rear=nn;
           System.out.println(item);
           
        }
        void pop(){
            if(front==null){
                System.out.println("empty");
            }
            System.out.println(front.data);
            front=front.next;
            if(front==null)rear=null;
        }
        void display(){
            if(front==null){
                return;
            }
            node<t> temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
class StackLL{
    public static void main(String []args){
        genstack<Integer> g=new genstack<>();
        g.push(10);
        g.push(20);
        g.push(30);
        g.display();
        g.pop();
        g.push(55);
        g.display();

    }
}