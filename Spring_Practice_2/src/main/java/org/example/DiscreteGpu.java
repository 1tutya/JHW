package org.example;

import lombok.Data;

@Data
public class DiscreteGpu implements Gpu {

    private int series;

    private String mark;

    @Override
    public void info() {
        System.out.println("Discrete GPU");
    }
}
