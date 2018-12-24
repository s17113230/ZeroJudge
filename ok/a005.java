import java.util.*;
public class a005{
    public static void main(String [] args){
      Scanner num=new Scanner(System.in);
      int t = num.nextInt();
      loop:while (t>0){
        while(num.hasNext()){
        int a=num.nextInt(),b=num.nextInt(),c=num.nextInt(),d=num.nextInt(),e,f;
        e=d-c;f=c-b;
        if (e == f){
          System.out.println(a+" "+b+" "+c+" "+d+" "+(d+e));
        }
        else if(e!=f){
          e=d/c;
          System.out.println(a+" "+b+" "+c+" "+d+" "+(d*e));
        }
        t--;
        if(t==0)break;
      }
    }
  }
}