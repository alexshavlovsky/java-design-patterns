package factorymethod._1_abstractcreator;

import factorymethod.product.Product;

public abstract class AbstractCreator {
    protected abstract Product factoryMethod();

    public Product create() {
        return factoryMethod();
    }
}
