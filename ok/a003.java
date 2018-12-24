import java.util.*;
public class a003{
  public static void main(String [] args){
    Scanner num=new Scanner(System.in);
    while(num.hasNext()){
      int m=num.nextInt(),d=num.nextInt();
      String c;
      c=((m*2+d)%3==0)?"普通":((m*2+d)%3==1)?"吉":((m*2+d)%3==2)?"大吉":"無法顯示";
      System.out.println(""+c);
    }
  }
}