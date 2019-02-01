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
      return fib(n,0,1);
    }

    //Helper function that uses tail recursion
    private static int fib(int n, int prev1, int prev2){
      if (n>0){
        return fib(n-1,prev2,prev1+prev2);
      }else{
        return prev1; //base case
      }
    }

    public static void main(String[]args){

      //Testing sqrt
      System.out.println(""+sqrt(0,0.0001));
      System.out.println(""+sqrt(1,0.0001));
      System.out.println(""+sqrt(25,0.0001));

      //Testing fib
      System.out.println(""+fib(0));
      System.out.println(""+fib(1));
      System.out.println(""+fib(5));
      System.out.println(""+fib(9));

    }
}
