package com.niit.onlineshoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.onlineshoppingbackend.dto.Authorities;
import com.niit.onlineshoppingbackend.dto.BillingAddress;
import com.niit.onlineshoppingbackend.dto.Cart;
import com.niit.onlineshoppingbackend.dto.Category;
import com.niit.onlineshoppingbackend.dto.Customer;
import com.niit.onlineshoppingbackend.dto.Product;
import com.niit.onlineshoppingbackend.dto.ShippingAddress;
import com.niit.onlineshoppingbackend.dto.User;



@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class HibernateConfig {

	
	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/online");

		dataSource.setUsername("sa");
		dataSource.setPassword("");

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");

		return properties;
	}
	
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		//sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		//sessionBuilder.addAnnotatedClass(CartItem.class);
		sessionBuilder.addAnnotatedClass(Customer.class);
		sessionBuilder.addAnnotatedClass(BillingAddress.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Authorities.class);
		//sessionBuilder.addAnnotatedClass(CustomerOrder.class);
		sessionBuilder.addAnnotatedClass(ShippingAddress.class);
		return sessionBuilder.buildSessionFactory();
	}
	
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;

	}
	/*@Autowired(required = true)
	@Bean(name = "CategoryDao")
	public CategoryDao getCategoryDao(SessionFactory sessionFactory) {
		return new CategoryDaoImpl(sessionFactory);
	}*/
	
	/*@Autowired(required = true)
	@Bean(name = "CustomerDao")
	public CustomerDao getCustomerDao(SessionFactory sessionFactory) {
		return new CustomerDaoImpl(sessionFactory);
	}*/
}