package test;

import org.testng.annotations.Test;

public class Testclass2 extends Basetest {
  @Test
  public void Method1() throws InterruptedException {
	  System.out.println("Testclass2<<method1<<thread is"+Thread.currentThread().getId());
	  Thread.sleep(2000);
  }
  @Test
	  public void method2() throws InterruptedException {
	  System.out.println("Testclass2<<method2<<thread is"+Thread.currentThread().getId());
	  Thread.sleep(2000);
  }
  @Test
	public void method3() throws InterruptedException  {
  System.out.println("Testclass2<<method3<<thead is"+Thread.currentThread().getId());
  Thread.sleep(2000);
}
}