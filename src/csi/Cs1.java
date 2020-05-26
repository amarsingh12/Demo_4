package csi;

public class Cs1 {
    int a = 10;
    int b = 20;
    
   void m1(int a, int b)// Instance method
    {
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(a);
        System.out.println(b);
    }
 
    
   public static void main(String[] args) 
   {
       Cs1 obj = new Cs1();
       obj.m1(100, 200);
     
      
    }
 
}
