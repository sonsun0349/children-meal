package meal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ServletConfig extends WebMvcConfigurerAdapter {

    private static final String[] CLASSPATH_PATH_PATTERNS       = {"swagger-ui.html", "/webjars/**", "/static/**", "/assets/**"};
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS  = {"classpath:/META-INF/resources/", "classpath:/META-INF/resources/webjars/", "classpath:/static/","classpath:/assets/"};

    /**
     * mvc:resources 설정을 처리합니다.
     *
     * @param registry ResourceHandlerRegistry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(CLASSPATH_PATH_PATTERNS).addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }
}