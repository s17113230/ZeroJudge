import java.util.Scanner;

public class b367 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int m=sc.nextInt();
				int[][] arr=new int[n][m];
				for(int i=0;i<n;i++){
					for(int j=0;j<m;j++)
						arr[i][j]=sc.nextInt();
				}

				boolean flag=true;
				for(int i=0,a=n-1;i<n;i++,a--){
					for(int j=0,b=m-1;j<m;j++,b--){
						if(arr[i][j]!=arr[a][b]){
							flag=false;
							break;
						}
					}
				}
				if(flag)
					System.out.println("go forward");
				else
					System.out.println("keep defending");
				t--;
			}
		}
	}
}