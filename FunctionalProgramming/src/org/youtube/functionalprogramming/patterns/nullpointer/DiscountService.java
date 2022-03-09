package org.youtube.functionalprogramming.patterns.nullpointer;

public class DiscountService {

    private String getDiscountLine(Customer customer){
        return  "Discount%: " + getDiscountPercentage(customer.getMemberCard());
    }

    private Integer getDiscountPercentage(MemberCard card){
        if (card.getFidelityPoints >= 100){
            return 5;
        }

        if (card.getFidelityPoints >= 50){
            return 3;
        }

        return null;
    }

    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        System.out.println(service.getDiscountLine(new Customer(new MemberCard (60))));
    }
}
