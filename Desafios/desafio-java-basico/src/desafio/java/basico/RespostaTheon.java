package desafio.java.basico;

import java.io.IOException;
import java.util.Scanner;

public class RespostaTheon {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 2, posMenor = 1;
		
		for (int i = 1; i <= N; i++) {
			T = leitor.nextInt();
			
			if (T < menor) {
			  menor = T;
			  posMenor = i;			
		    }
		}
		
		System.out.println(posMenor);
		
		leitor.close();
    }
	
}

