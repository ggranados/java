package udemy.perficient.design_patterns.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class SimpleFilter implements Filter<Product>{
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream()
                .filter(spec::isSatisfied);
    }
}
