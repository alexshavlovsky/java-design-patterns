package builder;

import builder.products.TabletPc;

public final class TabletPcBuilder extends PcBuilder {
    private TabletPc result;

    @Override
    public void build() {
        result = new TabletPc(config);
    }

    @Override
    public Object getResult() {
        return result;
    }
}
