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