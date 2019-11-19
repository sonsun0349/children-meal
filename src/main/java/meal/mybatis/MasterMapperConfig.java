package meal.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MasterMapperConfig {
    @Bean
    public MapperScannerConfigurer scanMaster(){
        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
        scannerConfigurer.setBasePackage(MybatisConfig.BASE_PACKAGE);
        scannerConfigurer.setAnnotationClass(MasterMapper.class);
        scannerConfigurer.setSqlSessionFactoryBeanName(MybatisConfig.SESSION_MASTER);
        return scannerConfigurer;
    }
}
