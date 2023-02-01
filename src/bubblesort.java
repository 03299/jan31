public class bubblesort {
    public static void main(String args[]){
        int a[]={38,52,9, 18,6,62,13};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }

        }
        for(int k=0; k<a.length; k++){
            System.out.print(a[k]+" ");
        }
    }
}
