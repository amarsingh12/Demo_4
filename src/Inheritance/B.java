
package Inheritance;

public class B extends A {
    int a = 100;
    int b = 200;
    void add(int a , int b)
    {
        System.out.println(a+" "+b);
        System.out.println(this.a+" "+this.b);
        System.out.println(super.a+" "+super.b);
    }
    
    public static void main(String[] args)
    {
      B obj = new B(); 
      obj.add(500, 600);
    }
    
}
