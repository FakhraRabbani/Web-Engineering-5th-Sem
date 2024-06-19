interface IM1 {
  abstract void test(int i); 
  int x = 10;
}

interface IM2 {
  abstract void test(String s);
}

public class MultiInterfaces implements IM1, IM2 {

  public void test(int i)   
  {   
    System.out.println("In MultInterfaces.IM1.test" + " " +i);
  }

  public void test(String s) 
  {  
    System.out.println("In MultInterfaces.IM2.test" +  " " +s); 
  }
 
  public static void main(String[] a) {

    MultiInterfaces t = new MultiInterfaces();
    t.test(42);
    t.test("Hello");
    
  }


}
