package org.andy.spring.propertysandbox.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectionService {
    @Value("${prop1.a}")
    String prop1A;

    @Value("${prop1.b}")
    String prop1B;

    @Value("${prop1.c}")
    String prop1C;

    @Value("${prop2.a}")
    String prop2A;

    @Value("${prop2.b}")
    String prop2B;

    @Value("${prop2.c}")
    String prop2C;

    public PropertyInjectionService() {
    }

    public String getProp1A() {
        return prop1A;
    }

    public String getProp1B() {
        return prop1B;
    }

    public String getProp1C() {
        return prop1C;
    }

    public String getProp2A() {
        return prop2A;
    }

    public String getProp2B() {
        return prop2B;
    }

    public String getProp2C() {
        return prop2C;
    }
}
