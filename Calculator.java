import java.util.*;
class Calculator{
    private double num1;
    private double num2;
    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2= num2;
    }
    public double add(){
        return num1+num2;
    }
    public double sub(){
        return num1-num2;
    }
    public double mul(){
        return num1*num2;
    }
    public Double div(){
        if(num2 == 0){
            System.out.println("num2 is not should be Zero");
            break;
        }
        return num1/num2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a num1 : ");
        double a = sc.nextInt();
        System.out.print("enter b num1 : ");
        double b = sc.nextInt();

        Calculator cal = new Calculator(a, b);
        System.out.print("choose operation: +,-,*,/ : ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(cal.add());;
                break;
            case '-':
                System.out.println(cal.sub());;
                break;
            case '*':
                System.out.println(cal.mul());;
                break;
            case '/':
                System.out.println(cal.div());
                break;
            default:
                System.out.println("Invalid Operator: ");
                break;
        }

    }
}
