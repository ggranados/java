package cert.java11.ocp.chapter18.concurrency.creatingthread;

import cert.java11.ocp.chapter18.concurrency.creatingthread.PrintData;
import cert.java11.ocp.chapter18.concurrency.creatingthread.ReadInventoryThread;

public class Main {

    public static void main(String[] args) {
	    System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");
    }
}
