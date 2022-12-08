package org.youtube.functionalprogramming.patterns.nullpointer;

public class MemberCard {

    public Integer fidelityPoints;

    public MemberCard(Integer fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }


    @Override
    public String toString() {
        return "MemberCard{" +
                "getFidelityPoints=" + fidelityPoints;
    }


    public void setFidelityPoints(Integer fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }

    public Integer getFidelityPoints() {
        return fidelityPoints;
    }
}
