package config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 14:52:54 2020/8/19
 */
public class Config extends AbstractDispatcherServletInitializer {

    /**
     * 注册过滤器
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();

        characterEncodingFilter.setEncoding("UTF-8");

        servletContext.addFilter("characterEncodingFilter",characterEncodingFilter);

    }

    /**
     * 创建springmvc-ioc容器
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {

        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();

        acw.register(SpringMvcConfiguration.class);

        return acw;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 创建spring根容器
     * @return
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {

        AnnotationConfigWebApplicationContext acw = new AnnotationConfigWebApplicationContext();

        acw.register(SpringConfiguration.class);

        return acw;
    }
}
