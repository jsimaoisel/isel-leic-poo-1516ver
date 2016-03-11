/**
 * Created by jsimao on 10-03-2016.
 */
public class DynamicArray {

    private static final int INITIAL_SIZE = 4;
    private int[] values;
    private int counter;

    public DynamicArray() {
        values = new int[INITIAL_SIZE];
        counter = 0;
    }

    public int size() {
        return counter;
    }

    /**
     * Metodo para ler o inteiro na posição 'idx'
     * @param idx [0 ; size()-1 ]
     * @return o inteiro na posição 'idx'
     */
    public int getAt(int idx) {
        assert idx >= 0 && idx < counter;
        return values[idx];
    }

    public void putAt(int idx, int value) {
        assert idx >= 0 && idx <= counter;
        if (counter == values.length)
            grow();
        shiftOne(idx);
        values[idx] = value;
        ++counter;
    }

    private void shiftOne(int idx) {
        for (int i=counter; i>idx; --i)
            values[i] = values[i-1];
    }
}
