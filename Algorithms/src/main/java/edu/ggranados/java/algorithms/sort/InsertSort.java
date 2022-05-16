package edu.ggranados.java.algorithms.sort;

import java.util.List;

public class InsertSort {

    public static final int ZERO = 0;
    public static final int FIRST_CURRENT_INDEX = 1;

    public List<Integer> sort(List<Integer> elements){

        for(int j = 1; j < elements.size(); j++){

            int key = elements.get(j);

            int i = j -1;

            while( i >= 0 && key < elements.get(i)) {
                elements.set(i +1, elements.get(i));
                elements.set(i, key);
                i--;
            }


        }

        return elements;
    }

    public List<Integer> sortRecursive(List<Integer> elements){
        return sortRecursive(elements, FIRST_CURRENT_INDEX);
    }

    public List<Integer> sortRecursive(List<Integer> elements, int currentIndex){

        if (sizeHasBeenExceeded(elements.size(), currentIndex)) {
            return elements;
        }

        int currentElement = elements.get(currentIndex);
        int fromIndex = currentIndex - 1;
        replaceBackwards(currentElement, elements, fromIndex);
        return sortRecursive(elements, ++currentIndex);

    }

    private boolean sizeHasBeenExceeded(int size, int currentIndex) {
        return !isLowerThan(currentIndex, size);
    }

    private boolean isLowerThan( int a, int b) {
        return a < b;
    }

    private void replaceBackwards(int currentElement, List<Integer> elements, int fromIndex){

        if(isGreaterOrEqualsThan(fromIndex, ZERO) && isLowerThan(currentElement, elements.get(fromIndex))){
            elements.set(fromIndex + 1, elements.get(fromIndex));
            elements.set(fromIndex, currentElement);
            replaceBackwards(currentElement, elements, --fromIndex);
        }

    }

    private boolean isGreaterOrEqualsThan(int a, int b) {
        return a >= b;
    }


}
