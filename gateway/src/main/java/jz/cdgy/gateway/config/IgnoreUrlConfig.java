package jz.cdgy.gateway.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Component
@Data
@ConfigurationProperties(prefix="secure.ignore")
public class IgnoreUrlConfig {
    private List<String> urls;
}
