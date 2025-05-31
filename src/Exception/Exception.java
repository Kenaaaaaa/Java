package Exception;

import static Exception.InvalidAgeException.checkAge;

public class Exception {
    public static void main(String[] args) {
        try{

            String string=null;
            string.equals("test");
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println(result);
        }catch (NullPointerException  | ArithmeticException e){
            if(e instanceof NullPointerException) {
                System.out.println("Null pointer exception occurred: " + e.getMessage());
            } else  {
                System.out.println("Arithmetic exception occurred: " + e.getMessage());
            }
             }finally {
            System.out.println("Finally block executed.");
        }
        try{
            checkAge(19);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }




}