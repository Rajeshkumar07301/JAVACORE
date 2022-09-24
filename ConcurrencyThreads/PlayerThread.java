package com.rays.ConcurrencyThreads;

public class PlayerThread extends Thread{
	public PlayerThread(ThreadGroup tg , String name) {
		super(tg,name);
	}
	public void run() {
		for (int match = 0; match < 10 ; match++) {
			String msg = getName();
			msg += "played match#"+match;
			System.out.println(msg);
		}
	}
	public static void main(String[] args) {
		ThreadGroup team = new ThreadGroup("Team India");
		PlayerThread p1 = new PlayerThread(team ,"Jay");
		PlayerThread p2 = new PlayerThread(team,"Vijay");
		p1.start();
		p2.start();
		
		System.out.println("Thread Goup Info");
		
		System.out.println("Name:"+team.getName());
		System.out.println("Parent Group:" + team.getParent());
		
		System.out.println("Action Threads " + team.activeCount());
		
		System.out.println("Active subgroups " +team.activeGroupCount());
	}

}
