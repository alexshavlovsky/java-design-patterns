package factorymethod._1_abstractcreator;

import factorymethod.product.Product;
import factorymethod.product.ProductA;

public class ProductACreator extends AbstractCreator {
    @Override
    protected Product factoryMethod() {
        return new ProductA();
    }
}
