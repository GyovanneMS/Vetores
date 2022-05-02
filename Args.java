package vetores;

import java.util.Scanner;

public class Args{
	public static void main(String args[]){
		
		double numeros[] = new double[args.length];
		
		for(int i=0; i<args.length; i++ ) {
			numeros[i] = Double.parseDouble(args[i]);
		}
		System.out.println("Maior número: " + maior(numeros) + ", menor número " + menor(numeros) + ", média: " + mediaA(numeros));

	}
	public static double maior(double n1[]) {
		double maiorN = n1[0];
		for (int i=1; i<n1.length ; i++) {
			if(n1[i] > maiorN){
				maiorN = n1[i];
			}
		}
		return maiorN;
	}
	public static double menor(double n1[]) {
		double menorN = n1[0];
		for (int i=1; i<n1.length ; i++) {
			if(n1[i] < menorN){
				menorN = n1[i];
			}
		}
		return menorN;
	}
	public static double mediaA(double n1[]) {
		double total = 0;
		for(int i=0; i<n1.length; i++) {
			total += n1[i];
		}
		total /= n1.length;
		return total;
	}
}