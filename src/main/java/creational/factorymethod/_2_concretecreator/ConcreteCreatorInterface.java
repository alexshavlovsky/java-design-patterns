package creational.factorymethod._2_concretecreator;

import creational.factorymethod.product.Product;

public interface ConcreteCreatorInterface {
    Product getProduct(String key) throws Exception;
}
