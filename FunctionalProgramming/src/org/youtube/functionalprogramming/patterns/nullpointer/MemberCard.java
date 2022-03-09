package org.youtube.functionalprogramming.patterns.nullpointer;

public class MemberCard {

    public Integer getFidelityPoints;

    public MemberCard(Integer fidelityPoints) {
        getFidelityPoints = fidelityPoints;
    }


    @Override
    public String toString() {
        return "MemberCard{" +
                "getFidelityPoints=" + getFidelityPoints;
    }

    public Integer getGetFidelityPoints() {
        return getFidelityPoints;
    }

    public void setGetFidelityPoints(Integer getFidelityPoints) {
        this.getFidelityPoints = getFidelityPoints;
    }

}
