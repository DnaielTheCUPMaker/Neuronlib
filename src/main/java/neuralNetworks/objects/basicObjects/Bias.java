package neuralNetworks.objects.basicObjects;

import dataTypes.Value;

public class Bias implements Value<Double> {
    private double val;

    public Bias(double val) {
        set(val);
    }

    public Bias() {
        this(1.0);
    }

    @Override
    public void set(Double arg) {
        val = arg;
    }

    @Override
    public Double get() {
        return val;
    }

    @Override
    public Bias sum(Double arg) {
        return new Bias(val + arg);
    }

    @Override
    public Bias mul(Double arg) {
        return new Bias(val * arg);
    }

    @Override
    public Bias sub(Double arg) {
        return new Bias(val - arg);
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
