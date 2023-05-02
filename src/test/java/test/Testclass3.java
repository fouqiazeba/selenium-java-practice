package test;

import org.testng.annotations.Test;

public class Testclass3  extends Basetest {
  @Test
  public void method1() throws InterruptedException {
	 System.out.println("Testclass3<<method1<<thread is"+Thread.currentThread().getId()) ;
	 Thread.sleep(2000);
  }
  @Test
  public void method2() throws InterruptedException {
	  System.out.println("Testclass3<<method2<thread is"+Thread.currentThread().getId());
	  Thread.sleep(2000);
	  
  }
  @Test
  public void method3() throws InterruptedException {
	  System.out.println("Testclass3<<method3<<threas is "+Thread.currentThread().getId());
	  Thread.sleep(2000);
}
}