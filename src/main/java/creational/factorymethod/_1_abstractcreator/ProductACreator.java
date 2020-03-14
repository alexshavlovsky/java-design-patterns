package creational.factorymethod._1_abstractcreator;

import creational.factorymethod.product.Product;
import creational.factorymethod.product.ProductA;

public class ProductACreator extends AbstractCreator {
    @Override
    protected Product factoryMethod() {
        return new ProductA();
    }
}
