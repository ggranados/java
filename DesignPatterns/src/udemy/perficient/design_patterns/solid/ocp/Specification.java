package udemy.perficient.design_patterns.solid.ocp;

@FunctionalInterface
public interface Specification <T>{

    boolean isSatisfied(T item);

    default Specification<T> and(Specification<T> spec){
        return item -> {
            return this.isSatisfied(item)
                    && spec.isSatisfied(item);
        };
    }
}
