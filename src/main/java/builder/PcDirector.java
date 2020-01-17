package builder;

import org.modelmapper.ModelMapper;

import java.util.Map;

public class PcDirector {
    private PcBuilder builder;
    private ModelMapper modelMapper = new ModelMapper();

    public PcDirector(PcBuilder builder) {
        this.builder = builder;
    }

    public Object constructFromMap(Map config) {
        PcConfig pcConfig = modelMapper.map(config, PcConfig.class);
        return constructFromConfig(pcConfig);
    }

    public Object constructFromConfig(PcConfig pcConfig) {
        builder.reset(pcConfig);
        builder.build();
        return builder.getResult();
    }
}
