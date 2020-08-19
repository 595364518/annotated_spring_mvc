package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 14:49:30 2020/8/19
 */
@Configuration
@ComponentScan(value = "com.lhb.web")
public class SpringMvcConfiguration {

    @Bean("internalResourceViewResolver")
    public InternalResourceViewResolver internalResourceViewResolver(){

        InternalResourceViewResolver irvr = new InternalResourceViewResolver();

        irvr.setPrefix("/WEB-INF/pages/");

        irvr.setSuffix(".jsp");

        return irvr;
    }
}
