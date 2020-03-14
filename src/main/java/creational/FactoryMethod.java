package creational;

import creational.factorymethod._1_abstractcreator.AbstractCreator;
import creational.factorymethod._1_abstractcreator.ProductACreator;
import creational.factorymethod._2_concretecreator.ConcreteCreator;
import creational.factorymethod._3_staticmethodcreator.StaticMethodCreator;
import creational.factorymethod.product.Product;

public class FactoryMethod {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Abstract creator ===");
        AbstractCreator abstractCreator = new ProductACreator();
        Product product = abstractCreator.create();
        System.out.println(product.getName());

        abstractCreator = new AbstractCreator() {
            @Override
            protected Product factoryMethod() {
                return () -> "Product C";
            }
        };
        product = abstractCreator.create();
        System.out.println(product.getName());

        System.out.println("=== Concrete creator ===");

        ConcreteCreator concreteCreator = new ConcreteCreator();

        product = concreteCreator.getProduct("A");
        System.out.println(product.getName());

        product = concreteCreator.getProduct("B");
        System.out.println(product.getName());

        System.out.println("=== Static method creator ===");

        product = StaticMethodCreator.newProduct("A");
        System.out.println(product.getName());

        product = StaticMethodCreator.newProduct("B");
        System.out.println(product.getName());
    }
}
