package properties;

import org.aeonbits.owner.Config;

@Config.Sources("src/test/resources/application.properties")
public interface ConfigurationProperties extends Config {
    @Config.Key("url")
    String url();
}