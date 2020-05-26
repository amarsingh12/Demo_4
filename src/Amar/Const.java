
package Amar;

public class Const {
  Const(int a)
  {
      System.out.println(a);
  }
   Const(int a,int b)
  {
      System.out.println(a);
      System.out.println(b);
  }
    Const(String ch)
  {
      System.out.println(ch);
  }
  
    public static void main(String[] args) 
    {
       Const obj = new Const(10); 
        Const obj1 = new Const(10,20); 
         Const obj2 = new Const("amar"); 
    }
  
}
