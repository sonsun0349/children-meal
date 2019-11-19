package meal.mybatis;

import groovy.util.logging.Slf4j;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class DatasourceConfig {

    @Bean(destroyMethod = "")
    @ConfigurationProperties("app.datasource.master")
    @Primary
    public DataSource dataSourceMaster(){return new BasicDataSource();}
}
