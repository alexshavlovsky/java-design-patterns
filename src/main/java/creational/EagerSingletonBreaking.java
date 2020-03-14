package creational;

import creational.singleton.EagerSingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonBreaking {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, CloneNotSupportedException {
        // singleton contract
        System.out.println("===Eager the sole Instance 1===");
        EagerSingleton i1 = EagerSingleton.getInstance();
        EagerSingleton i2 = EagerSingleton.getInstance();
        System.out.println(i1);
        System.out.println(i2);
        // break singleton by reflection
        System.out.println("===Eager Instance 2 by reflection===");
        Class clazz = Class.forName("creational.singleton.EagerSingleton");
        Constructor<EagerSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        EagerSingleton i3 = constructor.newInstance();
        System.out.println(i3);
        // break singleton by serialisation
        System.out.println("===Eager Instance 3 by serialisation===");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(i1);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        EagerSingleton i4 = (EagerSingleton) ois.readObject();
        System.out.println(i4);
        // break singleton by cloning
        System.out.println("===Eager Instance 4 by cloning===");
        EagerSingleton i5 = (EagerSingleton) i2.clone();
        System.out.println(i5);
    }
}
