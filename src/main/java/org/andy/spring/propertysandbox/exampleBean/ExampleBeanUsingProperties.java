package org.andy.spring.propertysandbox.exampleBean;

public class ExampleBeanUsingProperties {

    private String usernameFromValue;
    private String userNameFromEnvironment;
    private String test2AProperty;


    public String getUsernameFromValue() {
        return usernameFromValue;
    }

    public void setUsernameFromValue(String usernameFromValue) {
        this.usernameFromValue = usernameFromValue;
    }

    public String getUserNameFromEnvironment() {
        return userNameFromEnvironment;
    }

    public void setUserNameFromEnvironment(String userNameFromEnvironment) {
        this.userNameFromEnvironment = userNameFromEnvironment;
    }

    public void setTest2AProperty(String test2AProperty) {
        this.test2AProperty = test2AProperty;
    }

    public String getTest2AProperty() {
        return test2AProperty;
    }
}
