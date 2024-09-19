package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas da matriz: ");
		int l = sc.nextInt();
		
		System.out.print("Digite o numero de colunas da matriz: ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		System.out.println("Digite os elementos da matriz: ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite o número que deseja obter informações: ");
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				
				
				if (mat[i][j] == n) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}

				
				//*if (mat[i][j] == n) {
					//System.out.println("Postion " + (i) + "," + (j) + ":");
					//System.out.println("Left " + mat[i][j-1] + ":");
				//System.out.println("Right " + mat[i][j+1] + ":");
					
				//if (i != 0) {
				//	System.out.println("Up " + mat[i-1][j] + ":");
				//}
					
				//	System.out.println("Down " + mat[i+1][j] + ":");					
				//	}
				
			}
		}
		
		
		sc.close();
		
	}

}
