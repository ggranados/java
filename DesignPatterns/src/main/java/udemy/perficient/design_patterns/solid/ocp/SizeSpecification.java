package udemy.perficient.design_patterns.solid.ocp;

public record SizeSpecification(
        Size size) implements Specification<Product>{

    @Override
    public boolean isSatisfied(Product item) {
        return this.size == item.getSize();
    }
}
