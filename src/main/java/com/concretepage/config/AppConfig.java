package com.concretepage.config;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.concretepage.component.IPersonService;
import com.concretepage.component.PersonService;
  
@Configuration 
@ComponentScan("com.concretepage") 
@EnableWebMvc   


/* Note: below in code config replaces below:
 * 
 * http://www.mkyong.com/spring/spring-auto-scanning-components/
<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xmlns:context="http://www.springframework.org/schema/context"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-2.5.xsd
http://www.springframework.org/schema/context
http://www.springframework.org/schema/context/spring-context-2.5.xsd">

<context:component-scan base-package="com.mkyong.customer" />

</beans>
*/




public class AppConfig {  
	
	@Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/views/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }
	
	/*
	 Spring will call this method to instantiate a 'PersonService' instance that get assigned to its base interface ref 'IPersonService.
	 Spring calls this instantiating method when it needs to inject a 'PersonService' object.
	 here it is called from @AutoWired 'private IPersonService personService;' in 'PersonController'
	
	 Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC
	 container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with 
	 @Bean will return an object that should be registered as a bean in the Spring application context.
	*/
	
	
	@Bean  
	// @Component - tested this, eclipse said The annotation @Component is disallowed for this location
    public IPersonService personService() {  
        return new PersonService();  
    }
 
}  
 