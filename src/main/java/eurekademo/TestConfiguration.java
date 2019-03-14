package eurekademo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "custom", configuration = DefaultRibbonConfig.class)
public class TestConfiguration {
	
}