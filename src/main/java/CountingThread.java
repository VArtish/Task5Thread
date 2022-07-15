public class CountingThread implements Runnable {
    private final int finalNumber = 100;
    private static Integer count = 0;
    private int id;

    public CountingThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while(count != finalNumber) {
            synchronized (count) {
                count++;
                System.out.println("id = " + id + " count = " + count);
            }
        }
    }
}
