package properties;

import org.aeonbits.owner.ConfigFactory;

public class ConfigurationManager {
    private ConfigurationManager() {
    }

    public static ConfigurationProperties configuration() {
        return ConfigFactory.create(ConfigurationProperties.class);
    }
}
