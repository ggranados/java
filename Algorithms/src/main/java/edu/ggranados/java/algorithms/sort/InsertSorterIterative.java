package edu.ggranados.java.algorithms.sort;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Lazy
@Component("insertSorterIterative")
public class InsertSorterIterative implements Sorter<Integer> {

    @Override
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
