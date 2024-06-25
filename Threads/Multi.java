//States of thread

class Counter 
{
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}


class WorkerThread extends Thread {
    private Counter counter;  // declaring a variable counter which is a Counter data type which is class type variable //non primitive

    public WorkerThread(Counter counter) //this calls instance of Counter class through constructor
    {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class Multi
{
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads that will increment the counter
        WorkerThread t1 = new WorkerThread(counter); //this calls instance of Counter class through constructor
        WorkerThread t2 = new WorkerThread(counter);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final count: " + counter.getCount());
    }
}

