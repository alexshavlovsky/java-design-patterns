package builder;

import builder.products.DesktopPc;

public final class DesktopPcBuilder extends PcBuilder {
    private DesktopPc result;

    @Override
    public void build() {
        result = new DesktopPc(config);
    }

    @Override
    public DesktopPc getResult() {
        return result;
    }
}
