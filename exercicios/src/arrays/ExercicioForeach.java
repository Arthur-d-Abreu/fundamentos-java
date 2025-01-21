package arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.1;
		notasAlunoA[2] = 5;
		notasAlunoA[3] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));
		
		
		double totalAlunoA = 0;
		
		for(double notaAlunoA: notasAlunoA) {
			System.out.println(notaAlunoA);
			totalAlunoA += notaAlunoA;
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		double totalAlunoB = 0;
		
		for(double notaAlunoB: notasAlunoB) {
			System.out.println(notaAlunoB);
			totalAlunoB += notaAlunoB;
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
