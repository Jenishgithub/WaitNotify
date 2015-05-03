public class App {
	public static void main(String[] args) throws InterruptedException {
		final Processor processor = new Processor();
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				try {
					processor.produce();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				try {
					processor.consume();
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
//
//		t1.join();
//		t2.join();

	}

}
