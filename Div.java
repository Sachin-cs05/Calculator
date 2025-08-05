class Div{
    private double num1;
    private double num2;
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2= num2;
    }
    public double div(){
        if(num2 == 0){
            System.out.println("num2 is not should be Zero");
        }
        return num1/num2;
    }
}