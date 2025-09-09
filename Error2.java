
class Error2 {
    public static void main(String[] args) {
        int a=10,b=5,c=5;
        int x=a/(b+c);
        System.out.println("X="+x);
        try {
            int y=a/(b-c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        int y=a/(b-c+1);
        System.out.println("Y="+y);
    }    
}
