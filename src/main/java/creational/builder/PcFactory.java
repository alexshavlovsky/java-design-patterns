package creational.builder;

import creational.builder.products.DesktopPc;
import creational.builder.products.LaptopPc;
import creational.builder.products.TabletPc;

import java.util.Map;

public class PcFactory {
    private PcDirector laptopPcDirector = new PcDirector(new LaptopPcBuilder());
    private PcDirector tabletPcDirector = new PcDirector(new TabletPcBuilder());
    private PcDirector desktopPcDirector = new PcDirector(new DesktopPcBuilder());

    public LaptopPc produceLaptopPc(Map config) {
        return (LaptopPc) laptopPcDirector.constructFromMap(config);
    }

    public TabletPc produceTabletPc(Map config) {
        return (TabletPc) tabletPcDirector.constructFromMap(config);
    }

    public DesktopPc produceDesktopPc(Map config) {
        return (DesktopPc) desktopPcDirector.constructFromMap(config);
    }
}
