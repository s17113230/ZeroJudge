import java.util.*;
public class a004{
  public static void main(String [] args){
    Scanner num=new Scanner(System.in);
    while(num.hasNext()){
      int a=num.nextInt();
      String b;
      b=((a%400==0) || ((a%4==0) && (a%100!=0)))?"閏年":"平年";
      System.out.println(""+b);
    }
  }
}