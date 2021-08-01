package desafio.matematico.java;

import java.io.IOException;
import java.util.Scanner;

public class AreaInferior {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
        int MATRIZ = 12, AUX_1 = 7, AUX_2 = 6, AUX_3 = 5;
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[MATRIZ][MATRIZ];
        for (int i = 0; i < MATRIZ; i++) {
        	for (int j = 0; j < MATRIZ; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for (int i = AUX_1; i < MATRIZ; i++) {
          for (int j = AUX_3; j <= AUX_2; j++) {
        		soma += M[i][j];
          }
          AUX_2++;
          AUX_3--;
        }

        if (O == 'M') soma = soma / 30;
    	System.out.println(String.format("%.1f", soma));
    	
    	leitor.close();
    }
	
}

