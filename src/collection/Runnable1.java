package collection;

public class Runnable1 {
        
	public static void main(String[] args)
    {
        System.out.println("Main thread is- "
                        + Thread.currentThread().getName());
        Thread t1 = new Thread(new Runnable1().new RunnableImp());
        t1.start();
    }

	private class RunnableImp implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + ", executing run() method!");
		}
	}
	
}
