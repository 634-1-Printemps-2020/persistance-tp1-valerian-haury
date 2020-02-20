package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Hello World!");

    }
    @Test
    public void CounterTest() throws CounterException {
        Counter c1 = new Counter(10);
        Assert.assertEquals(10,c1.getValue());

        c1.inc();
        Assert.assertEquals(11,c1.getValue());

        c1.add(5);
        Assert.assertEquals(16,c1.getValue());

        c1.add(-20);
        Assert.assertEquals(-4,c1.getValue());
    }

    @Test (expected = CounterException.class)
    public void UpperLimitedPositiveCounterMaxTest() throws CounterException {
        UpperLimitedPositiveCounter c1 = new UpperLimitedPositiveCounter(10,20);
        c1.add(10);
        Assert.assertEquals(20,c1.getValue());
        c1.inc();
    }

    @Test (expected = CounterException.class)
    public void UpperLimitedPositiveCounterNegativeTest() throws CounterException {
        UpperLimitedPositiveCounter c1 = new UpperLimitedPositiveCounter(10,20);
        c1.add(-10);
        Assert.assertEquals(0,c1.getValue());
        c1.add(-1);
    }
}
