package com.ratna.microservices.limitsmicroservice.bean;

public class LimitConfiguration {
    private int max;
    private int min;

    protected LimitConfiguration() {
    }

    public LimitConfiguration(int max, int min) {
        super();
        this.max = max;
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

}
