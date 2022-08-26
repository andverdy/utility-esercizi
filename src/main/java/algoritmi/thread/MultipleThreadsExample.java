package algoritmi.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.config.Task;

public class MultipleThreadsExample {
    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.setName("MyThread-1");
        NewThread t2 = new NewThread();
        t2.setName("MyThread-2");
        
        ExecutorService executor = Executors.newFixedThreadPool(10);
        executor.submit(() -> {
            new Task(t1);
        });
        
        t1.start();
        t2.start();
    }
}
