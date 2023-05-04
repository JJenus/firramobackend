package com.firramo.firramoapi.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
//@PropertySource({"classpath:application.yml"})
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.firramo.firramoapi.repository.firramo",
        entityManagerFactoryRef = "firramoEntityManager",
        transactionManagerRef = "firramoTransactionManager")
public class FirramoAutoConfiq {
    @Primary
    @Bean(name = "firramoDataSource")
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource firramoDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "firramoEntityManager")
    public LocalContainerEntityManagerFactoryBean firramoEntityManager(
            EntityManagerFactoryBuilder builder, @Qualifier("firramoDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
                .packages("com.firramo.firramoapi.model.firramo").persistenceUnit("firramo")
                .build();
    }

    @Primary
    @Bean(name = "firramoTransactionManager")
    public PlatformTransactionManager firramoTransactionManager(
            @Qualifier("firramoEntityManager") EntityManagerFactory firramoEntityManager) {
        return new JpaTransactionManager(firramoEntityManager);
    }
}
