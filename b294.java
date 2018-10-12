import java.util.*;

public class b294{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      int a = sc.nextInt();
      int [] b = new int[a];
      int count=0;
      for(int i=0 ; i<a ; i++){
        b[i] = sc.nextInt();
      }
      for(int i=0 ; i<a ; i++){
        count+= b[i]*(i+1);
      }
      System.out.println(count);
    }
  }
}