package org.andy.spring.propertysandbox.service;

import org.junit.Assert;
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
public class PropertyInjectionServiceTest {

    @Autowired
    PropertyInjectionService toTest;

    @Test
    public void getProp1A() {
        Assert.assertThat(this.toTest.getProp1A(), is("25"));
    }

    @Test
    public void getProp1B() {
        Assert.assertThat(this.toTest.getProp1B(), is("http://www.google.de"));
    }

    @Test
    public void getProp1C() {
        Assert.assertThat(this.toTest.getProp1C(), is("hallo"));
    }

    @Test
    public void getProp2A() {
        Assert.assertThat(this.toTest.getProp2A(), is("34"));
    }

    @Test
    public void getProp2B() {
        Assert.assertThat(this.toTest.getProp2B(), is("www.web.de"));
    }

    @Test
    public void getProp2C() {
        Assert.assertThat(this.toTest.getProp2C(), is("ciao"));
    }
}