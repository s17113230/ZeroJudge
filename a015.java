import java.util.*;
public class a015 {
	public static void main(String [] args){
		Scanner num = new Scanner (System.in);
		while (num.hasNext()){
			int row = num.nextInt();
			int column=num.nextInt();
			int [][] array = new int [row][column];
			for(int i = 0 ; i < row ; i++){
				for (int j = 0 ; j < column ; j++){
					array[i][j] = num.nextInt();
				}
			}
			for(int i = 0 ; i < column ; i++){
				for (int j = 0 ; j < row ; j++){
					System.out.print(""+array[j][i]);
					System.out.print(" ");
				}
				System.out.print("\n");
			}
		}
	}
}