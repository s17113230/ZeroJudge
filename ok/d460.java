import java.util.*;
public class d460 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int old;
        while(sc.hasNext()){
            old = sc.nextInt();
            System.out.println(old<=5?"0":old>5&&old<=11?"590":old>11&&old<=17?"790":old>17&&old<=59?"890":"399");
        }
    }
}
