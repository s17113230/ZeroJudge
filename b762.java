import java.util.Scanner;

public class b762 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
			int a = sc.nextInt();
			int Kill = 0;
			int Die = 0;
			int Assist = 0;
			int Count = 0;

			while(a>0){
				String b = sc.next();
				if(b.equals("Get_Kill")){
					Kill++;
					Count++;
					if(Count<=2){
						System.out.println("You have slain an enemie.");
					}else if(Count==3){
						System.out.println("KILLING SPREE!");
					}else if(Count==4){
						System.out.println("RAMPAGE~");
					}else if(Count==5){
						System.out.println("UNSTOPPABLE!");
					}else if(Count==6){
						System.out.println("DOMINATING!");
					}else if(Count==7){
						System.out.println("GUALIKE!");
					}else{
						System.out.println("LEGENDARY!");
					}
				}
				if(b.equals("Get_Assist")){
					Assist++;
				}
				if(b.equals("Die") && Count<3){
					Count=0;
					Die++;
					System.out.println("You have been slained.");
				}else if(b.equals("Die") && Count>=3){
					Die++;
					Count=0;
					System.out.println("SHUTDOWN.");
				}
				a--;
			}
			System.out.println(Kill+"/"+Die+"/"+Assist);
        }
    }
}