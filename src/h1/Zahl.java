package h1;

import java.lang.Math;

public class Zahl {

    public boolean even;
    public boolean small;
    public boolean positive;

    public int num;

    public void setEven() {
        this.even = Math.abs(this.num)%2 == 0;
    }

    public void setSmall() {
        this.small = this.num < 100;
    }

    public void setPositive() {
        this.positive = this.num > 0;
    }
}