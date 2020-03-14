package creational.factorymethod._1_abstractcreator;

import creational.factorymethod.product.Product;
import creational.factorymethod.product.ProductB;

public class ProductBCreator extends AbstractCreator {
    @Override
    protected Product factoryMethod() {
        return new ProductB();
    }
}
