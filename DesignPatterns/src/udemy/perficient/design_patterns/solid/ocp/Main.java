package udemy.perficient.design_patterns.solid.ocp;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static udemy.perficient.design_patterns.solid.ocp.Color.*;
import static udemy.perficient.design_patterns.solid.ocp.Size.*;

public class Main {

    private static  final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(RED, SMALL, "Apple", 1_000.00),
                new Product(BLUE,MEDIUM,"Bag",3_000.00),
                new Product(WHITE, SMALL, "Candy", 100.00),
                new Product(BLACK, LARGE, "House", 200_000.00),
                new Product(BLUE, LARGE, "Auto", 30_000.00)

        );

        //Simple filter example
        Filter<Product> filter = new SimpleFilter();

        logger.log(Level.INFO, "Blue items:");
        filter.filter(products, new ColorSpecification(BLUE))
                .forEach(p -> logger.log(Level.INFO, p::toString));

        logger.log(Level.INFO, "Large items:");
        filter.filter(products, new SizeSpecification(LARGE))
                .forEach(p -> logger.log(Level.INFO, p::toString));

        logger.log(Level.INFO, "White and small items");
        filter.filter(products, new ColorSpecification(WHITE)
                .and(new SizeSpecification(SMALL)))
                .forEach(product -> logger.log(Level.INFO, product::toString));

    }

}
