package factorymethod._2_concretecreator;

import factorymethod.product.Product;

public interface ConcreteCreatorInterface {
    Product getProduct(String key) throws Exception;
}
