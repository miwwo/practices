package prac_6.task11;

public class Celsius implements Convertable {
    private double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public double convertF() {
        return this.value * (9.0/5.0) + 32;
    }

    @Override
    public double convertK() {
        return (this.value - 32)*(5.0/9.0);
    }

    public double getValue(){return this.value;}
}
