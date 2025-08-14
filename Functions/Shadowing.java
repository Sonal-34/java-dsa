public class Shadowing {
//  class level static var(global for this class)
    static int x=90;
    public static void main(String[] args)
     {
      System.out.println("Class-level x: " + x);
      //shadowing starts here
      int x=80;//local variable shadows the class level x
      System.out.println("Local x: "+ x);
      
    //will print class level x bcz fun() has no local x
      fun();
    }

    static void fun(){
        System.out.println("Inside fun(), x: " + x);
    }
}
