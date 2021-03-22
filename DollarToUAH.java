public class DollarToUAH implements Convertable {
    private double dollar_rate = 27.69;

    public double convert(double value){
        return this.dollar_rate * value;
    }

}