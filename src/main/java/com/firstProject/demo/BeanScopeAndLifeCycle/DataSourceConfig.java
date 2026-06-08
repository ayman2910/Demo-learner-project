package com.firstProject.demo.BeanScopeAndLifeCycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DataSourceConfig {
    @Bean(initMethod = "configurePool", destroyMethod = "closePool")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public CustomerConnectionPool createPool(){
        System.out.println("Config: Instantiating CustomerConnectionPool...");
        return new CustomerConnectionPool();
    }

}
