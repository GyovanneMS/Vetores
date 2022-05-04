package vetores;

import java.util.Scanner;

public class SomaMatrizes {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double matriz1[][] = new double[3][2];
		double matriz2[][] = new double[3][2];
		double matriz3[][] = new double[3][2];
		
		for(int linha=0; linha<matriz1.length; linha++) {
			for (int coluna=0; coluna<matriz1[0].length; coluna++) {
				System.out.print("Digite um número: ");
				matriz1[linha][coluna] = ler.nextDouble();
			}
		}
		for(int linha=0; linha<matriz2.length; linha++) {
			for (int coluna=0; coluna<matriz2[0].length; coluna++) {
				System.out.print("Digite um número: ");
				matriz2[linha][coluna] = ler.nextDouble();
			}
		}
		for(int linha=0; linha<matriz3.length; linha++) {
			for (int coluna=0; coluna<matriz3[0].length; coluna++) {
				matriz3[linha][coluna] = SomarM(matriz1[][], matriz2[][]);
				System.out.print(" " + matriz3[linha][coluna]);
			}
		}
	}
		
	public static double[][] SomarM(double matriz1[][], double matriz2[][]) {
		double matriz3[][] = new double[3][2];
		
		for(int linha=0; linha<matriz3.length; linha++) {
			for (int coluna=0; coluna<matriz3[0].length; coluna++) {
				matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
			}
		}
		return matriz3;
	}
	public static double Fixar(double matriz[][]) {
	
}
