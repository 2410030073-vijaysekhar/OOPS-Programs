class MultiCatch {
    public static void main(String[] args) {
        try {
            int a[]= new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception occurs ");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Index");
            
        }catch(Exception e){
            System.out.println("Parent exception occur");
            
        }

    }
}
