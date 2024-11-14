package com.example.springaop;

import com.example.springaop.aspect.Loggable;
import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

@Component
public class Luigi implements Brother {

    public void method1(String arg1, int arg2) {

    }

    @Loggable(level = Level.WARN)
    public String method2(String arg1, int arg2) {
        return "value";
    }

    public String method3() {
        throw new RuntimeException("runtime exception");
    }

}