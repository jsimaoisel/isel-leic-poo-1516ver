/**
 * Created by jsimao on 12-04-2016.
 */
public class Model {
    private int value;
    private IView view;

    public Model() {

    }
    public void setView(IView view) {
        this.view = view;
    }
    public void incValue() {
        value++;
        view.valueChanged(value);
    }
    public void decValue() {
        value--;
        view.valueChanged(value);
    }

    public void reset() {
        value=0;
        view.valueChanged(value);
    }
}
