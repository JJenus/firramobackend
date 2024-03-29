package com.firramo.firramoapi.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.firramo.firramoapi.repository.evergreen",
        entityManagerFactoryRef = "evergreenEntityManager",
        transactionManagerRef = "evergreenTransactionManager")
public class EvergreenAutoConfig {
    @Bean(name = "evergreenDataSource")
    @ConfigurationProperties(prefix="spring.s-datasource")
    public DataSource evergreenDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "evergreenEntityManager")
    public LocalContainerEntityManagerFactoryBean evergreenEntityManager(
            EntityManagerFactoryBuilder builder, @Qualifier("evergreenDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
                .packages("com.firramo.firramoapi.model.evergreen").persistenceUnit("evergreen")
                .build();
    }

    @Bean(name = "evergreenTransactionManager")
    public PlatformTransactionManager evergreenTransactionManager(
            @Qualifier("evergreenEntityManager") EntityManagerFactory evergreenEntityManager) {
        return new JpaTransactionManager(evergreenEntityManager);
    }
}
