import java.util.Scanner;

public class a229 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();

			_rec(n, 0, 0, "");
		}
	}

	static void _rec(int n, int l, int r, String BS){
		if(l<r){
			return;
		}
		if((l==r)&&(l==n)){
			StringBuilder sb = new StringBuilder();
			sb.append(BS);
			System.out.println(sb.toString());
			return;
		}

		String str="";
		if(l<n){
			str = BS+"(";
			_rec(n, l+1, r, str);
		}

		if(r<n){
			str = BS+")";
			_rec(n, l, r+1, str);
		}
	}
}