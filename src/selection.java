public class selection {
    public static void main(String args[]){
        int a[]={38, 52, 9, 18, 6, 62, 1},min;
        for(int i=0; i<a.length; i++){
            min=i;
            for(int j=i+1; j<a.length; j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;
        }
        for(int i: a){
            System.out.println(i);
        }

    }
}
