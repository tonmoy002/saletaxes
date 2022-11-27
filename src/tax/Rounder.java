package tax;


public class Rounder{

    public Rounder() {

    }

    public float taxCalculation(float price) {

        return Math.round(price * 100.0f) / 100.0f;
    }
}
