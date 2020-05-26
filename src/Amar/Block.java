
package Amar;
public class Block {
   void m1()
   {
       System.out.println("m1 method");
   }
   // instance block
   {
       System.out.println("instance block");
    }
   // static block
  static 
  {
       System.out.println("static block");
   }
    public static void main(String[] args)
    {
      Block obj = new Block();
      obj.m1();
    }
    
    
}
