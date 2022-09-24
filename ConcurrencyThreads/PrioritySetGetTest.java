package com.rays.ConcurrencyThreads;

public class PrioritySetGetTest {

	public static void main(String[] args) {
		
			PrioritySetGet t1 = new PrioritySetGet("Hare Krishna");
			PrioritySetGet t2 = new PrioritySetGet("Hare Rama");
			PrioritySetGet t3 = new PrioritySetGet("Hare Hare");
			
			t1.setPriority(10);//(MAX_PRIORITY);
			t2.setPriority(5);//(MIN_PRIORITY);
			t3.setPriority(1);//(NORM_PRIORITY);
			
			t1.start();
			t2.start();
			t3.start();
		}
		

	}


