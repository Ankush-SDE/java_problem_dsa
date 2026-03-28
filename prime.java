
import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner sc =new  Scanner(System.in); 
    int n = 2;

    boolean isprime = true;
    for(int i=2; i<=Math.sqrt(n); i++){
      if(n%i == 0){
        isprime = false;
      
      
      }
    }
    if(isprime == true){
      System.out.println("no is prime Number ");
    }
    else {
      System.out.println("no is not prime");
    }
  
  }
  
}
