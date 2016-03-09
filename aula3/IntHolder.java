
public class IntHolder {
    private static int counter;

    private int v;

    public IntHolder(int v) {
        this.v = v;
        ++counter;
    }

    public int getInt() { return v; }

    public void setInt(int v) { this.v = v; }

    public String toString() {
        return "Holder of " + v;
    }

    public static int getCounter() {  return counter; }

    public static void main(String[] args) {
        IntHolder h1 = new IntHolder(5);
        System.out.println(h1.getInt());
        
        IntHolder h2 = new IntHolder(15);
        System.out.println(h2.getInt());
        
        System.out.println(h1);
        
        h1 = h2 = null;
        System.out.println(IntHolder.getCounter());
    }
}
