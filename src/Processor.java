import java.util.Scanner;

public class Processor {
	public void produce() throws InterruptedException {
		synchronized (this) {
			while (true) {
				System.out.println("Producer thread running...");
				wait();
				System.out.println("Producer thread resumed...");
				notify();
				//wait();
			}
		}
	}

	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Thread.sleep(2000);

		synchronized (this) {
			while (true) {
				System.out.println("Waiting for the return key ...");
				scanner.nextLine();
				System.out.println("Return key pressed...");
				notify();
				wait();
				// Thread.sleep(4000);
			}
		}
	}
}
