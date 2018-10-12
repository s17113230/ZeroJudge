import java.util.*;
public class a009{
  public static void main(String [] args){
    Scanner num=new Scanner(System.in);
    while(num.hasNext()){
      String Str = num.next();
      int [] b = new int[Str.length()];
      char [] c = new char[Str.length()];
      for(int i =0;i<=b.length-1;i++){
        b[i]=Str.charAt(i)-7;
        c[i]=(char)b[i];
      }	
      for(char k : c){
        System.out.print(k);
      }
    System.out.println("");
    }
  }
}