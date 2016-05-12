package pt.isel.poo.firstapp.model;

/**
 * Created by jsimao on 06-05-2016.
 */
public class CounterModel {
    private int start, max, min;
    private int counter, step;
    private CounterListener listener;

    public CounterModel(int start, int max, int min, int step) {
        this.start = this.counter = start;
        this.max = max;
        this.min = min;
        this.step = step;
    }
    public void inc() {
        if (counter + step <= max) {
            counter += step;
            notifyListener();
        }
    }

    public void dec() {
        if (counter - step >= min) {
            counter -= step;
            notifyListener();
        }
    }
    public void setStep(int step) {
        this.step = step;
    }

    public void reset() {
        counter = start;
        notifyListener();
    }

    public void setListener(CounterListener listener) {
        this.listener = listener;
    }


    private void notifyListener() {
        if (listener != null) {
            listener.valueChanged(counter);
        }
    }
}
