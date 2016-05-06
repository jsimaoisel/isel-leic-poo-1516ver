package pt.isel.poo.firstapp;

/**
 * Created by jsimao on 06-05-2016.
 */
public class CounterModel {
    private int start, max, min;
    private int counter, step;

    public CounterModel(int start, int max, int min, int step) {
        this.start = this.counter = start;
        this.max = max;
        this.min = min;
        this.step = step;
    }
    public void inc() {
        if (counter + step <= max) {
            counter += max;
        }
    }
    public void dec() {
        if (counter - step >= min) {
            counter -= step;
        }
    }
    public void setStep(int step) {
        this.step = step;
    }
    public void reset() {
        counter = start;
    }
}
