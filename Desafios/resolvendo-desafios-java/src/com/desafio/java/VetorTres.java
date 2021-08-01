package com.desafio.java;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class VetorTres {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		BigDecimal X = new BigDecimal(leitor.nextDouble());
		BigDecimal[] N = new BigDecimal[100];
		N[0] = X;
		for (int index = 1; index < N.length; index++) {
			N[index] = N[index - 1].divide(new BigDecimal(2));
		}

		for (int index = 0; index < N.length; index++) {
			System.out.format("N[" + index + "] = %.4f%n", N[index].setScale(4, RoundingMode.HALF_EVEN));
		}

		leitor.close();
	}

}
