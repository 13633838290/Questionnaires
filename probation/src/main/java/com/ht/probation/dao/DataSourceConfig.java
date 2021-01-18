package com.ht.probation.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
 
@Configuration
public class DataSourceConfig {
 
//	@Bean
//	public ServletWebServerFactory servletContainer() {
//		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
//			@Override
//			protected TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
//				tomcat.enableNaming();
//				return super.getTomcatWebServer(tomcat);
//			}
// 
//			@Override
//			protected void postProcessContext(Context context) {
//				ContextResource resource1 = new ContextResource();
//				resource1.setName("ds1");
//				resource1.setType(DataSource.class.getName());
//				resource1.setProperty("driverClassName", "com.mysql.jdbc.Driver");
//				resource1.setProperty("url", "jdbc:mysql://130.233.7.5:3306/Questionnaires?characterEncoding=utf-8&useSSL=false");
//				resource1.setProperty("username", "root");
//				resource1.setProperty("password", "123456");
//				context.getNamingResources().addResource(resource1);
//				
//				super.postProcessContext(context);
//			}
//		};
//		return tomcat;
//	}
	
	@Bean
	public DataSource dataSource() {
//		JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//		dataSourceLookup.setResourceRef(true);
//		return dataSourceLookup.getDataSource("java:comp/env/ds1");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://130.233.7.5:3306/Questionnaires?characterEncoding=utf-8&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
 
}