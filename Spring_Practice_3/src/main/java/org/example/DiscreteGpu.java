package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DiscreteGpu implements Gpu {
    @Value("${discrete_card_mark}")
    private String mark;
    @Value("${discrete_card_series}")
    private int series;

    @Override
    public void info() {
        System.out.println(this.mark + " " + this.series);
    }

}
