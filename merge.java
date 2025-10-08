class merge {
    public static void main(String[] args) {
        int a[]={8,7,6,5,4,3,2,1};
        mergesort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    static void mergesort(int a[],int l,int h){
        if(l<h){
        int mid=(l+h)/2;
        mergesort(a,l,mid);
        mergesort(a,mid+1,h);
        merge(a, l, h);
        }
    }
 static void  merge(int a[],int l,int h){
    int x[]=new int[h-l+1];
    int mid=(l+h)/2;
    int j=mid+1;
    int i=l;
    int k=0;
    while(l<=mid && j<=h ){
        if(a[l]<a[j]){
            x[k]=a[l];
            k++;
            l++;
        }
            else{
                x[k]=a[j];
                k++;
                j++;
            }
        }
    while(l<=mid){
        x[k]=a[l];
        k++;
        l++;
    }
    while(j<=h){
        x[k]=a[j];
        k++;
        j++;
    }
   for (int p = 0; p < x.length; p++) {
    a[i+p] = x[p];
}
    }

}

