package org.example;

import org.springframework.stereotype.Component;

@Component
public class IntegratedGpu implements Gpu {
    @Override
    public void info() {
        System.out.println("Integrated Gpu");
    }
}
