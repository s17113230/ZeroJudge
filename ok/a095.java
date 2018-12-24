import java.util.*;

public class a095{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int a = sc.nextInt();
      int b = sc.nextInt();
      int count=0;
      if(a==b){
        System.out.println(b);
      }else{
        System.out.println(b+1);
      }
    }
  }
}