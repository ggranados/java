package cert.java11.ocp.chapter6.lambda.simple;

public class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}