package org.andy.spring.propertysandbox.exampleBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleBeanUsingPropertiesTest {

    @Autowired
    private ExampleBeanUsingProperties toTest;

    @Test
    public void getUsername() {
        String username = this.toTest.getUsernameFromValue();
        assertThat(username, is("peter"));
    }

    @Test
    public void getUserNameFromEnvironment() {
        String username = this.toTest.getUserNameFromEnvironment();
        assertThat(username, is("peter"));
    }

    @Test
    public void getTest2AProperty() {
        String username = this.toTest.getTest2AProperty();
        assertThat(username, is("test2aValue"));
    }
}