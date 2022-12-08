package org.youtube.functionalprogramming.patterns.nullpointer;

import java.util.Optional;

public class Customer {
    private MemberCard memberCard;

    public Customer() {
    }

    public Customer(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public Optional<MemberCard> getMemberCard() {
        return Optional.ofNullable(memberCard);
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }
}
