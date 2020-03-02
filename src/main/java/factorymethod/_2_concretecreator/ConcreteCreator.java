package factorymethod._2_concretecreator;

import factorymethod.product.Product;
import factorymethod.product.ProductA;
import factorymethod.product.ProductB;

public class ConcreteCreator implements ConcreteCreatorInterface {
    @Override
    public Product getProduct(String key) throws Exception {
        switch (key) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
        }
        throw new Exception("Unrecognized product key: " + key);
    }
}
