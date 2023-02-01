class divide{
    void mergesort(int a[], int l, int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(a, l, mid);
            mergesort(a,mid+1, r);
            merge(a, l, mid, r);
        }
    }
    void merge(int a[], int lef, int m, int rig){
        int n1=m-lef+1;
        int n2=rig-m;

        int L[]=new int[n1];
        int M[]=new int[n2];
    }

}
public class mergesort {
    public static void main(String args[]){
        int a[]={6,5,12,10,9,1};
        divide d=new divide();
        d.mergesort(a, 0, a.length-1);//array, first index, last index
    }

}
