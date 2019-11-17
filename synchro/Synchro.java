package synchro;

public class Synchro extends Thread{

	private Object ob1, ob2;

	public Synchro(Object ob1, Object ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	public void run() {
		synchronized (ob1) {
			System.out.println(getName() + " lock");
			
			try {
				sleep(500);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (ob2) {
				System.out.println(getName() + " lock");
			}
		}
	}
	
}
