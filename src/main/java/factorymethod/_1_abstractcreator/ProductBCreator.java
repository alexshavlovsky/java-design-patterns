package factorymethod._1_abstractcreator;

import factorymethod.product.Product;
import factorymethod.product.ProductB;

public class ProductBCreator extends AbstractCreator {
    @Override
    protected Product factoryMethod() {
        return new ProductB();
    }
}
