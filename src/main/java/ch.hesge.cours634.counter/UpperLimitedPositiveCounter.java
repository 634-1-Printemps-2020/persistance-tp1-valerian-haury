package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int maxLimit;

    public UpperLimitedPositiveCounter(int value, int maxLimit) throws CounterException {
        super(value);
        this.maxLimit = maxLimit;
        if(getValue() > maxLimit) {
            throw new CounterException("limite maximale dépassée");
        } else if(getValue() < 0) {
            throw new CounterException("valeur inférieur à 0");
        }

    }

    @Override
    public void inc() throws CounterException {
        this.add(1);
    }

    @Override
    public void add(int step) throws CounterException {
        super.add(step);
        if(getValue() > maxLimit) {
            throw new CounterException("limite maximale dépassée");
        } else if(getValue() < 0) {
            throw new CounterException("valeur inférieur à 0");
        }
    }
}
