package computerClub;
import java.util.ArrayList;

public class ComputerClub {
	
	private int computers;
	private ArrayList<Integer> customers;
	private Computer[] threads;
	
	public ComputerClub(int customers, int computers) {
		this.computers = computers;
		this.customers = new ArrayList<Integer>(customers);
		
		for(int i = 0; i < customers; i++) {
			this.customers.add((int) (Math.random() * 8 + 1) );
		}
		
		logic();
	}
	
	private void logic() {
		
		int queue = 0;
		
		if(customers.size() < computers)
			queue = customers.size();
		else
			queue = computers;
		
		threads = new Computer[queue];
		
		for(int i = 0; i < queue; i++) {
			threads[i] = new Computer(customers.get(i), i, i);
			threads[i].start();
		}
			
		for (int i = queue; i < customers.size(); i++) {
			if(!threads[i % computers].isAlive()) {
				threads[i % computers] = new Computer(customers.get(i), i, i % computers);
				threads[i % computers].start();
			} else
				i--;
		}
	}
}