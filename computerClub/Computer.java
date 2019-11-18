package computerClub;

public class Computer extends Thread{

	private int time = 0;
	private int user = 0;
	private int computerIdx = 0;
	
	public Computer(int time, int user, int computerIdx) {
		this.time = time;
		this.user = user;
		this.computerIdx = computerIdx;
	}

	@Override
	public synchronized void run() {
		
		System.out.println("Customer " + user + " is ordered computer " + computerIdx + " on " + time * 15 + " minutes.");
		
		try {
			sleep(time*15*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Computer " + computerIdx + " is free at the moment.");
	}
}
