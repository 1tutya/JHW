package org.example.mvc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "org.example.mvc")
@EnableWebMvc
@EnableTransactionManagement
public class ApplicationConfig {
   @Bean
    public ViewResolver viewResolver() {
       InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
       viewResolver.setPrefix("/WEB-INF/views/");
       viewResolver.setSuffix(".jsp");
       return viewResolver;
   }

   @Bean
   public DataSource dataSource() {
      ComboPooledDataSource dataSource = new ComboPooledDataSource();
      try {
         dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
         dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/php_test?useSSL=false");
         dataSource.setUser("root");
         dataSource.setPassword("root");
      } catch (PropertyVetoException e) {
         throw new RuntimeException(e);
      }
      return dataSource;
   }

   @Bean
   public LocalSessionFactoryBean sessionFactory() {
      LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
      sessionFactoryBean.setDataSource(dataSource());
      sessionFactoryBean.setPackagesToScan("org.example.mvc");
      Properties props = new Properties();
      props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
      props.put("hibernate.show_sql", "true");
      props.put("hibernate.format_sql", "true");
      sessionFactoryBean.setHibernateProperties(props);
      return sessionFactoryBean;
   }

   @Bean
   public HibernateTransactionManager transactionManager() {
      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
      transactionManager.setSessionFactory(sessionFactory().getObject());
      return transactionManager;
   }

   @Bean
   public ModelMapper modelMapper() {
      return new ModelMapper();
   }
}
