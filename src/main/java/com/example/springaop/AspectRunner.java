package com.example.springaop;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Slf4j
@Component
@AllArgsConstructor
public class AspectRunner {

    private final List<Brother> brothers;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady(ApplicationReadyEvent event) {
        for (Brother brother : brothers) {
            try {
                brother.method1("1", 2);
                brother.method2("2", 3);
                brother.method3();
            } catch (Throwable e) {
                log.error(e.getMessage());
            }
        }
    }

}