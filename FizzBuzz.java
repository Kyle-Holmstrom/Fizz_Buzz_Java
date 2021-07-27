class FizzBuzz {
  
    public static void main(String[] args) {
  
      System.out.println("Fizz Buzz Challenge.");
      System.out.println("____________________");
  
      for (int i = 1; i <= 100; i++) {
        
        if (i % 3 == 0 && i % 5 == 0) {

          System.out.println("FizzBuzz");
          
        } else if (i % 3 == 0) {

          System.out.println("Fizz");
          
        } else if (i % 5 == 0) {

          System.out.println("Buzz");

        } else {
            
          System.out.println(i);

        }
        
      } // end for loop
      System.out.println("______________________________");
      System.out.println("Fizz Buzz Challenge Completed!");
  
    } // end main
  } // end class FizzBuzz