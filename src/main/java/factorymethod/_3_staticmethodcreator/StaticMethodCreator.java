package factorymethod._3_staticmethodcreator;

import factorymethod._2_concretecreator.ConcreteCreator;
import factorymethod.product.Product;

public class StaticMethodCreator {
    static private ConcreteCreator concreteCreator = new ConcreteCreator();

    static public Product newProduct(String key) {
        try {
            return concreteCreator.getProduct(key);
        } catch (Exception e) {
            return null;
        }
    }
}
