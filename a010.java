import java.util.*;

public class a010 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int a = sc.nextInt();
      int b = 0;
      int c = 0;
      for (int i=2 ; i<=a ; i++){
        int count = 0;
        if (a % i == 0){
          if (c == b){
            b = i;
          }
          if(b != i){
            System.out.print(" * ");
          }
          while (a%i==0){
            a = a / i;
            count++;
          }
          System.out.print(i);
          if (count>1){
            System.out.print("^" + count);
          }
          b = i;
        }
      }
      System.out.println("");
    }
  }
}