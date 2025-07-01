package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IntegratedGpu implements Gpu {
    @Value("${integratedGpuMark:Intel}")
    private String mark;

    @Value("${IntegratedGpuSeries:1234}")
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

    public IntegratedGpu() {
    }

    public IntegratedGpu(String mark, int series) {
        this.mark = mark;
        this.series = series;
    }
}
