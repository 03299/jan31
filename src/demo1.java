class A{
    String name;
    public void eat(){
        System.out.println("i can eat");
    }
}
class B extends A{
    public void display(){
        System.out.println(("My name is "+name));
    }
}
public class demo1 {
    public static void main(String args[]) {
        B a=new B();
        a.name="Kanak";
        a.eat();
        a.display();
    }
}
