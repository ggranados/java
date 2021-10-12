package cert.java11.ocp.chapter18.concurrency.creatingthread;

public class PrintData implements Runnable {
    @Override public void run() { // Overrides method in Runnable
        for(int i = 0; i < 3; i++)
            System.out.println("Printing record: "+i);
    }
    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}