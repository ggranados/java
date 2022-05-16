package edu.ggranados.java.algorithms.sort;

import java.util.List;

public class InsertSort {

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


}
