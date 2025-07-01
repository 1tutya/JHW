package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Gpu gpu;

    public Computer() {
    }
    @Autowired
    public Computer(Gpu gpu) {
        this.gpu = gpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }
}
