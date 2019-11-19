package meal.mybatis;

import groovy.util.logging.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Slf4j
@Configuration
@Import(DatasourceConfig.class)
public class MybatisConfig {

    @Value("${mybatis.path.config}")
    private String configPath;
    @Value("${mybatis.path.mapper}")
    private String mapperPath;
    @Value("${mybatis.path.type-aliases}")
    private String typeAliasesPath;

    public static final String BASE_PACKAGE = "meal";
    public static final String SESSION_MASTER = "sessionMaster";

    @Autowired
    private DatasourceConfig datasourceConfig;

    @Primary
    @Bean(SESSION_MASTER)
    public SqlSessionFactory sqlSessionFactory(){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        try{
            configureSessionFactory(sqlSessionFactoryBean,datasourceConfig.dataSourceMaster());
            return sqlSessionFactoryBean.getObject();
        }catch (Exception e){
            throw new RuntimeException("마스터생성 실패",e);
        }
    }

    private void configureSessionFactory(SqlSessionFactoryBean sqlSessionFactoryBean, DataSource dataSource) throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPath);
        sqlSessionFactoryBean.setConfigLocation(resolver.getResource(configPath));
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperPath));
    }
}
