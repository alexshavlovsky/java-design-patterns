package builder;

public interface BuilderInterface {
    void reset(PcConfig config);

    void build();

    Object getResult();
}
