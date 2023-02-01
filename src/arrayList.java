import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        ArrayList<Integer> a=new ArrayList<>();
        a.add(20);
        a.add(56);
        for(int i=0; i<3; i++){
            int tmp=sc.nextInt();
            a.add(tmp);
        }
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }
        for(int i: a){
            System.out.println(i);
        }
    }
}
