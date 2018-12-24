import java.util.*;
public class c636 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] animal = {"鼠","牛","虎","兔","龍","蛇","馬","羊","猴","雞","狗","豬"};
        int year;
        while(sc.hasNext()){
            year = sc.nextInt();
            System.out.println(year>=0?year%12==0?animal[11]:animal[year%12-1]:year%12==0?animal[0]:animal[12-(year*-1)%12]);
        }
    }
}
