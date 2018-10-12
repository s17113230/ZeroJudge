import java.util.Scanner;
public class a524 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			StringBuilder sb=new StringBuilder();
			for(int i=n;i>0;i--){
				sb.append(i);
			}
			comb("",sb.toString());
		}
	}
	static private void comb(String pre,String post){
		if(post.length()>0){
			for(int i=0;i<post.length();i++){
				String str=pre+post.charAt(i);
				StringBuffer sbf=new StringBuffer(post);
				sbf.deleteCharAt(i);
				comb(str,sbf.toString());
			}
		}
		else{
			System.out.println(pre);
		}
	}
}