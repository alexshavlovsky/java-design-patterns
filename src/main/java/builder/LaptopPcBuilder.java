package builder;

import builder.products.LaptopPc;

public final class LaptopPcBuilder extends PcBuilder {
    private LaptopPc result;

    @Override
    public void build() {
        result = new LaptopPc(config);
    }

    @Override
    public Object getResult() {
        return result;
    }
}
