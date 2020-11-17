package blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
public class JpaConfig {

	@Bean
	public EntityManagerFactory entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean embf=new LocalContainerEntityManagerFactoryBean();
		embf.setPersistenceXmlLocation("classpath:META-INF/persistance.xml");
		embf.afterPropertiesSet();
		return embf.getObject();

	}

	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5433/postgres");
		ds.setUsername("Sehbaz");
		ds.setPassword("1234");

		return ds;
	}

}
