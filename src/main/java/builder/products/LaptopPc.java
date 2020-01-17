package builder.products;

import builder.PcConfig;

public class LaptopPc {
    private String model;
    private String cpu;
    private String ram;
    private String sdd;
    private String videoCard;
    private String operatingSystem;

    public LaptopPc(PcConfig config) {
        this.model = config.model;
        this.cpu = config.cpu;
        this.ram = config.ram;
        this.sdd = config.sdd;
        this.videoCard = config.videoCard;
        this.operatingSystem = config.operatingSystem;
    }

    @Override
    public String toString() {
        return "LaptopPc{" +
                "model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", sdd='" + sdd + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
