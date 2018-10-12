import java.util.Scanner;
public class a224 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);     
		while(sc.hasNext()){
			String str;
			str=sc.nextLine();
			int[] count=new int[26];
			for(int i=0;i<26;i++)
				count[i]=0;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='a'&&str.charAt(i)<='z')
					count[(int)str.charAt(i)-97]++;
				else if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
					count[(int)str.charAt(i)-65]++;
			}
			int odd=0;
			for(int i=0;i<26;i++){
				if(count[i]%2==1)
					odd++;
			}
			if(odd>1) System.out.println("no...");
			else System.out.println("yes !");
		}
	}
}