package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiscreteGpu implements Gpu {
    @Value("${discreteGpuMark:NVIDIA RTX}")
    private String mark;

    @Value("${discreteGpuSeries:5090}")
    private int series;

    @Override
    public void getInfo() {
        System.out.println(this.mark + " " + this.series);
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public DiscreteGpu() {
    }

    public DiscreteGpu(String mark, int series) {
        this.mark = mark;
        this.series = series;
    }
}
