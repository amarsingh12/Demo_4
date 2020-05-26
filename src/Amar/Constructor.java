
package Amar;

public class Constructor {
  Constructor()
  {
      System.out.println("Default Constructor");
      int x = 1;
      int a;
      a = ++x + x++;
      System.out.println(a+"  "+x);
  }
  void m1()
  {
      System.out.println("m1 method");
  }
    public static void main(String[] args) 
    {
     Constructor obj = new Constructor();
     obj.m1();
    }
  
}
