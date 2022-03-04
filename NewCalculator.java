public class NewCalculator {
    private double lastResult;

    public NewCalculator(){
        this.lastResult = 0;
    }

    public double getLastResult(){
        return this.lastResult;
    }

    public double Add(double x, double y){
        this.lastResult = x + y;
        return this.lastResult;
    }

    public double Subtract (double x, double y){
        this.lastResult = x - y;
        return this.lastResult;
    }

    public double Divide(double dividend, double divisor){
        this.lastResult = dividend % divisor;
        return this.lastResult;
    }
    
    public double Multiply(double x, double y) {
        this.lastResult = x * y;
        return this.lastResult;
    }
}
