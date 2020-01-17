package builder;

import builder.products.DesktopPc;
import builder.products.LaptopPc;
import builder.products.TabletPc;

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
