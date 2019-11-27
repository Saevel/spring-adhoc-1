package com.example.demo.not_working;

import com.example.demo.MyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceBeanClass {
    public static final String MYCLASS_METHOD_A_BEAN = "MyClassMethodABean";
    public static final String MYCLASS_METHOD_B_BEAN = "MyClassMethodBBean";

    @Bean(MYCLASS_METHOD_A_BEAN)
    public MyClass methodA() {
        return new MyClass(MyClass.ClassType.CLASS_A);
    }

    @Bean(MYCLASS_METHOD_B_BEAN)
    public MyClass methodB() {
        return new MyClass(MyClass.ClassType.CLASS_B);
    }

}