package vetores;

import java.util.Scanner;

class Vetores{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		double nDecimais[] = new double[30];
		double maior = 0;
		double menor = 0;
		double media = 0;
		
		for(int i=0; i<nDecimais.length; i++) {
			System.out.print((i+1) + "º número: ");
			nDecimais[i] = ler.nextDouble();
			maior = maior(nDecimais);
			menor = menor(nDecimais);
			media = mediaA(nDecimais);
		}
		System.out.println("Maior número: " + maior + ", menor número " + menor + ", média: " + media);

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
