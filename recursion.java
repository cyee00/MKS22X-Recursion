public class recursion{

  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrt(n,(n/2.00),tolerance);//sets default guess at square/2
    }

    //Overloads sqrt(double,double)
    private static double sqrt(double n, double guess, double tolerance){
      if (!acceptable(n,guess,tolerance)){
        return sqrt(n,((n/guess+guess)/2),tolerance);
      }
      return guess;
    }

    //Helper function that tests if the guess^2 is close enough to the square.
    private static boolean acceptable(double accepted, double guess, double tolerance){
      return (((Math.abs((guess*guess)-accepted))/accepted)<=0.0001)||accepted==0;
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fib(n,0,0);
    }

    //Helper function that takes in the previous term and the current sum
    private static int fib(int n, ){
      if (n>0){
        return fib()
      }else{
        return sum; //base case
      }
    }

    public static void main(String[]args){
      System.out.println(""+sqrt(0,0.0001));
        System.out.println(""+sqrt(1,0.0001));
          System.out.println(""+sqrt(25,0.0001));
    }
}
