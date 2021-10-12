package cert.java11.ocp.chapter18.concurrency.creatingthread;

public class ReadInventoryThread extends Thread {
    @Override public void run() { // Overrides method in Thread
        System.out.println("Printing zoo inventory");
    }
    public static void main(String[] args) {
        (new ReadInventoryThread()).start();
    }
}