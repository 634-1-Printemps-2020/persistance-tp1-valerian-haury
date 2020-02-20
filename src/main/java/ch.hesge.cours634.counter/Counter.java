package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int value;

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException {
        this.value++;
    }

    @Override
    public void add(int step) throws CounterException {
        this.value += step;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
