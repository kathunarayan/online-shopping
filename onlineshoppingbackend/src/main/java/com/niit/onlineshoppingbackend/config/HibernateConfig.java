package com.niit.onlineshoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@Configuration
@ComponentScan(basePackages={"com.niit.onlineshoppingbackend.dto"})
@EnableTransactionManagement

public class HibernateConfig {

		private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshopping";
		private final static String DATABASE_DRIVER="org.h2.Driver";
		private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
		private final static String DATABASE_USERNAME="sa";
		private final static String DATABASE_PASSWORD="sa";

		//datasource bean will be created
		@Bean
		public DataSource getDataSource() {
			BasicDataSource dataSource = new BasicDataSource();
			//provinding the db connection info
			dataSource.setDriverClassName(DATABASE_DRIVER);
			dataSource.setUrl(DATABASE_URL);
			dataSource.setUsername(DATABASE_USERNAME);
			dataSource.setPassword(DATABASE_PASSWORD);
			return dataSource;
		}
		
		//sessionfactory bean will be created
		@Bean
		public SessionFactory getsessionFactory() {
			LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(getDataSource());
			Properties hibernateProperties = new Properties();
			hibernateProperties.setProperty("hibernate.dialect", DATABASE_DIALECT);
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.show_sql", "true");
			builder.addProperties(hibernateProperties);
			builder.scanPackages("com.niit.onlineshoppingbackend.dto");
			return builder.buildSessionFactory();
		}

		//transaction manager bean created
		@Bean
		public HibernateTransactionManager hibTransManagement() {
			return new HibernateTransactionManager(getsessionFactory());
		}


}
