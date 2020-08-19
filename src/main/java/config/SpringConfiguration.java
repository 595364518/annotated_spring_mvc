package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 14:45:07 2020/8/19
 */

@Configuration
@ComponentScan(value = "com.lhb",excludeFilters = @ComponentScan.Filter(Component.class))
public class SpringConfiguration {
}
