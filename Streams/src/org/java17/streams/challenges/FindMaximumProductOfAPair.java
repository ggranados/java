package org.java17.streams.challenges;

import java.util.Arrays;

public class FindMaximumProductOfAPair {

    public static final String NOT_AS_EXPECTED = "Maximum product = %d from array is not as expected";

    public static void main(String[] args) {
        int[] array1 = {5,3,1,5,7};
        int[] array2 = {-2,-1,-3,4,8,0};
        int[] array3 = {-20,-10,3,9,-8};

        FindMaximumProductOfAPair finder = new FindMaximumProductOfAPair();

        int product = finder.find(array1);
        assert product == 35 : String.format(NOT_AS_EXPECTED, product);

        product = finder.find(array2);
        assert product == 32 : String.format(NOT_AS_EXPECTED, product);

        product = finder.find(array3);
        assert product == 200 : String.format(NOT_AS_EXPECTED, product);

        product = finder.findByOrdering(array1);
        assert product == 35 : String.format(NOT_AS_EXPECTED, product);

        product = finder.findByOrdering(array2);
        assert product == 32 : String.format(NOT_AS_EXPECTED, product);

        product = finder.findByOrdering(array3);
        assert product == 200 : String.format(NOT_AS_EXPECTED, product);
    }

    private int find(int[] array) {

        if(array.length < 2)
            return 0;

        int firstMax = Arrays.stream(array).distinct().max().orElse(0);
        int secondMax = Arrays.stream(array).distinct().filter(i -> i != firstMax).max().orElse(0);

        int firstMin = Arrays.stream(array).distinct().min().orElse(0);
        int secondMin = Arrays.stream(array).distinct().filter(i -> i != firstMin).min().orElse(0);

        int maxProduct = firstMax*secondMax;
        int minProduct = firstMin*secondMin;

        return Math.max(maxProduct,minProduct);
    }

    private int findByOrdering(int[] array){

        if(array.length < 2)
            return 0;

        Arrays.sort(array);

        int firstMax = array[array.length-1];
        int secondMax = array[array.length-2];
        int maxProduct = firstMax*secondMax;

        int firstMin = array[0];
        int secondMin = array[1];
        int minProduct = firstMin*secondMin;

        return Math.max(maxProduct,minProduct);

    }
}
