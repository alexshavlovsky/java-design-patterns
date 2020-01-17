package builder;

public abstract class PcBuilder implements BuilderInterface {
    protected PcConfig config = new PcConfig();

    @Override
    public void reset(PcConfig config) {
        this.config = config;
    }
}
