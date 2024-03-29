package loops;

/* Write a FizzBuzz.java program that outputs numbers from 1 to 100… with a catch:
 *For multiples of 3, print Fizz instead of the number.
 *For the multiples of 5, print Buzz.
 *For numbers which are multiples of both 3 and 5, print FizzBuzz.
 */

class FizzBuzz {  
	  public static void main(String[] args) {
	      for (int n = 1; n <= 100; n++) {
	        if(n % 3 == 0 && n % 5 == 0){
	           System.out.println("FizzBuzz");
	        }else if(n % 3 == 0){
	         System.out.println("Fizz");
	        }else if(n % 5 == 0){
	         System.out.println("Buzz");
	        }else{ System.out.println(n);
	        }
	      }
	  }
	}