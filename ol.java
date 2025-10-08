
class a{
    int x,y,z;
    a(){}
void sum(int x,int y){
    this.x=x;
    this.y=y;
    System.out.println(x+y);

}
void sum(int x,int y,int z){
    this.x=x;
    this.y=y;
    this.z=z;
    System.out.println(x+y+z);
}
}
class ol{
    public static void main(String [] args){
        a A=new a();
        A.sum(2, 03);
        A.sum(1,2,3);

    }
}