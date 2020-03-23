package item03CreateThread;

public class RunnableImpl2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("HelloWord --> "+i);
        }
    }
}
