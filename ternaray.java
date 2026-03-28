
import java.util.Scanner;

public class ternaray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v = sc.nextInt();
    String A = (v %2 == 0 ) ? "even":"odd";
    System.out.println(A);
    sc.close();
  }
  
}
