package cert.java11.ocp.chapter18.concurrency;

public class CalculateAverage implements Runnable{

    private double[] scores;

    public CalculateAverage(double[] scores){
        this.scores = scores;
    }

    @Override
    public void run() {
        // Define work here that uses the scores object
    }
}
