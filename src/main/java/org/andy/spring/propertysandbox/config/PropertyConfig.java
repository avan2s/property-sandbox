package org.andy.spring.propertysandbox.config;


import org.andy.spring.propertysandbox.exampleBean.ExampleBeanUsingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration

@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:other/test2.properties")
})

// or just...
//@PropertySource("classpath:datasource.properties"),
//@PropertySource("classpath:other/test2.properties")
public class PropertyConfig {

    @Autowired
    Environment environment;

    @Value("${app.username}")
    String usernameFromValue;

    @Value("${test2.a}")
    String test2A;


    //To resolve ${} in @Value
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public ExampleBeanUsingProperties exampleServiceUsingProperties() {
        ExampleBeanUsingProperties exampleServiceUsingProperties = new ExampleBeanUsingProperties();
        exampleServiceUsingProperties.setUsernameFromValue(this.usernameFromValue);
        exampleServiceUsingProperties.setUserNameFromEnvironment(this.environment.getProperty("app.username"));
        exampleServiceUsingProperties.setTest2AProperty(this.test2A);
        return exampleServiceUsingProperties;
    }
}
