package udemy.perficient.design_patterns.solid.ocp;

public interface Specification <T>{
    boolean isSatisfied(T item);
}
