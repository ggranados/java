package udemy.perficient.design_patterns.solid.ocp;

public record ColorSpecification(
        Color color) implements Specification<Product> {

    @Override
    public boolean isSatisfied(Product item) {
        return this.color == item.getColor();
    }
}
