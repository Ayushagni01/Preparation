package BasicJava;

public class ReturnWithFinally {

    public static void main(String[] args) {
        System.out.println(myMethod());
    }


    public static  int myMethod() {
        try {
            throw new Exception();
          //if we are returning the things in exception and finally block then do not return from try.
           // return 1;
        } catch(Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

}

//Output is 3, cause finally block is designed in such a way then it will execute at the last always.
