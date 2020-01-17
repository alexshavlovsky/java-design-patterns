package builder.products;

import builder.PcConfig;

public class DesktopPc {
    private String pcCase;
    private String powerSupply;
    private String motherboard;
    private String cpu;
    private String ram;
    private String hdd;
    private String sdd;
    private String videoCard;
    private String mouse;
    private String keyboard;
    private String monitor;
    private String operatingSystem;

    public DesktopPc(PcConfig config) {
        this.pcCase = config.pcCase;
        this.powerSupply = config.powerSupply;
        this.motherboard = config.motherboard;
        this.cpu = config.cpu;
        this.ram = config.ram;
        this.hdd = config.hdd;
        this.sdd = config.sdd;
        this.videoCard = config.videoCard;
        this.mouse = config.mouse;
        this.keyboard = config.keyboard;
        this.monitor = config.monitor;
        this.operatingSystem = config.operatingSystem;
    }

    @Override
    public String toString() {
        return "DesktopPc{" +
                "pcCase='" + pcCase + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", sdd='" + sdd + '\'' +
                ", videoCard='" + videoCard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
