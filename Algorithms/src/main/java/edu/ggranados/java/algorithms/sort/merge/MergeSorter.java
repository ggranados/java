package edu.ggranados.java.algorithms.sort.merge;

import edu.ggranados.java.algorithms.sort.Sorter;

import java.util.ArrayList;
import java.util.List;

public class MergeSorter implements Sorter<Integer> {

    @Override
    public List<Integer> sort(List<Integer> elements) {

        //base case
        if (elements.size() == 1) return elements;

        //divide
        int h = elements.size() / 2;
        var left = elements.subList(0, h);
        var right = elements.subList(h, elements.size());
        left = sort(left);
        right = sort(right);
        //merge
        return merge(left, right);

    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> sorted = new ArrayList<>(left.size() + right.size());

        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                sorted.add(left.get(i));
                i++;
            } else {
                sorted.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            sorted.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            sorted.add(right.get(j));
            j++;
        }

        return sorted;
    }
}
