package org.youtube.functionalprogramming.patterns.nullpointer;

public class Customer {
    private MemberCard memberCard;

    public Customer(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public MemberCard getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }
}
