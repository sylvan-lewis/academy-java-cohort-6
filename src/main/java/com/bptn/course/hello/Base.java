package com.bptn.course.hello;

public class Base {
	
		   public void methodOne() {
		     System.out.print('A');
		     methodTwo();
		   }

		   public void methodTwo() {
		     System.out.print('B');
		   }
		}

		public class Derived extends Base {
		   public void methodOne() {
		      super.methodOne();
		      System.out.print('C');
		   }

		   public void methodTwo() {
		     super.methodTwo();
		     System.out.print('D');
		   }
		}
}
