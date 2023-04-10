package edu.ggranados.java.algorithms.sort;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Lazy
@Component("insertSorterIterative")
public class InsertSorterIterative implements Sorter<Integer> {

    @Override
    public List<Integer> sort(List<Integer> elements){

        for (int currIndex = 1; currIndex < elements.size(); currIndex++) {

            int prevIndex = currIndex - 1;
            var current = elements.get(currIndex);

            while (prevIndex >= 0 && current < elements.get(prevIndex)) {
                elements.set(prevIndex + 1, elements.get(prevIndex));
                elements.set(prevIndex, current);
                prevIndex--;
            }

        }

        return elements;
    }

}
