import builder.*;

import java.util.HashMap;
import java.util.Map;

public class Builder {

    private static void print(Object s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("model", "MiPad 2");
        config.put("cpu", "Intel");
        config.put("ram", "2 Gb");
        config.put("rom", "32 Gb");
        config.put("caseColor", "Silver");
        config.put("operatingSystem", "Android");

        PcDirector laptopPcDirector = new PcDirector(new LaptopPcBuilder());
        PcDirector tabletPcDirector = new PcDirector(new TabletPcBuilder());
        PcDirector desktopPcDirector = new PcDirector(new DesktopPcBuilder());

        // DIRECTORS
        print("===Construction by directors===");
        print(laptopPcDirector.constructFromMap(config));
        print(tabletPcDirector.constructFromMap(config));
        print(desktopPcDirector.constructFromMap(config));

        // FACTORY
        PcFactory factory = new PcFactory();
        print("");
        print("===Construction by factory===");
        print(factory.produceLaptopPc(config));
        print(factory.produceTabletPc(config));
        print(factory.produceDesktopPc(config));
    }
}
