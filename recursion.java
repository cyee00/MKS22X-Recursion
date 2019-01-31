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
        return sqrt(n,((n/guess+guess)/2));
      }
      return guess;
    }

    //Helper function that tests if the guess^2 is close enough to the square.
    private static boolean acceptable(double accepted, double guess, double tolerance){
      return (((Math.abs((guess*guess)-accepted))/accepted)<=tolerance)||accepted==0;
    }

    public static void main(String[]args){
      System.out.println(""+sqrt(0,0.000000001));
        //System.out.println(""+sqrt(1,0.00000001));

          //System.out.println(""+sqrt(25,0.000001));
    }
}
