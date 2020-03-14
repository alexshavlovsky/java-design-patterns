package creational.factorymethod._2_concretecreator;

import creational.factorymethod.product.Product;
import creational.factorymethod.product.ProductA;
import creational.factorymethod.product.ProductB;

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
