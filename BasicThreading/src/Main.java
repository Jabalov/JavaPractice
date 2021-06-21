import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)
    {
        MyRunnable myRunObject = new MyRunnable("Runnable1");
        MyThread myThreadObj = new MyThread("Thread1");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                IntStream.range(1, 101).forEach(i -> {
                    System.out.println(i + " ,Obj. Runnable");
                    try {
                        Thread.sleep((int) Math.random() * 1000);
                    } catch (InterruptedException | IllegalMonitorStateException e) {
                        e.printStackTrace();
                    }
                });
            }
        };

        Thread th1 = new Thread(myRunObject);
        Thread th2 = new Thread(runnable);
        th1.start();
        th2.start();

        myThreadObj.start();
        new Thread(new MyRunnable("RUN")).start();
    }
}
