package com.example.springaop;

import com.example.springaop.aspect.Loggable;
import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

@Loggable(level = Level.INFO)
@Component
public class Mario implements Brother {

    public void method1(String arg1, int arg2) {

    }

    public String method2(String arg1, int arg2) {
        return "value";
    }

    public String method3() {
        throw new RuntimeException("runtime exception");
    }

}