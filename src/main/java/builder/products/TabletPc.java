package builder.products;

import builder.PcConfig;

public class TabletPc {
    private String model;
    private String ram;
    private String rom;
    private String caseColor;
    private String operatingSystem;

    public TabletPc(PcConfig config) {
        this.model = config.model;
        this.ram = config.ram;
        this.rom = config.rom;
        this.caseColor = config.caseColor;
        this.operatingSystem = config.operatingSystem;
    }

    @Override
    public String toString() {
        return "TabletPc{" +
                "model='" + model + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", caseColor='" + caseColor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
