package ro.ulbs.paradigme.lab6;
public class IntCalculator {

    private int state;

    public IntCalculator(int state) {
        this.state = state;
    }

    public IntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }
 public IntCalculator multiply(int value) {
        this.state *= value;
        return this;

 }
 public int result() {
        return this.state;
    }




}