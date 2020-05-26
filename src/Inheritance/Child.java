
package Inheritance;
class Parent
{
void m3()
{
    System.out.println("Paren-1 Method");
}
 void m4()
{
    System.out.println("Parent-2 Method");
}

}

public class Child extends Parent{
  void m1()
  {
      System.out.println("child class");
  }
    public static void main(String[] args) 
    {
      Child obj = new Child();
      obj.m1();
      obj.m3();
      obj.m4();
      
    }
  
    
}
