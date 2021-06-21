import java.util.stream.IntStream;

public class MyRunnable implements Runnable
{

    private String name;
    public MyRunnable(String name)
    {
        this.name = name;
    }
    @Override
    public void run()
    {
        IntStream.range(1, 101).forEach(i -> {
            System.out.println(i + " ,Obj. Name : " + name);
            try {
                Thread.sleep((int) Math.random() * 1000);
            } catch (InterruptedException | IllegalMonitorStateException e) {
                e.printStackTrace();
            }
        });

    }
}
