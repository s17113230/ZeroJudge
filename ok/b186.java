import java.util.*;
public class b186 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cookie,chocolate,cake;
        while(sc.hasNext()){
            cookie = sc.nextInt();
            chocolate = sc.nextInt();
            cake = sc.nextInt();
            System.out.println(cookie/10 > cake/2?cookie+" 個餅乾，"+((cake/2)+chocolate)+" 盒巧克力，"+cake+" 個蛋糕。":cookie+" 個餅乾，"+((cookie/10)+chocolate)+" 盒巧克力，"+cake+" 個蛋糕。");
        }
    }
}
