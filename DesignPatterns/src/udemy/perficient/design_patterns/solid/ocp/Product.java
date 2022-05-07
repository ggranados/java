package udemy.perficient.design_patterns.solid.ocp;

public class Product {

    private Color color;
    private Size size;
    private String name;
    private Double price;

    public Product(Color color, Size size, String name, Double price) {
        this.color = color;
        this.size = size;
        this.name = name;
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "color=" + color +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

enum Color{
    GREEN,RED,BLUE,BLACK,WHITE,YELLOW
}

enum Size{
    SMALL,MEDIUM,LARGE
}
