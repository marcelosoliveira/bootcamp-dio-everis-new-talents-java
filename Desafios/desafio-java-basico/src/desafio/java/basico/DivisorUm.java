package desafio.java.basico;

import java.io.IOException;
import java.util.Scanner;

public class DivisorUm{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int index = 1; index <= N; index++) {
        	if (N % index == 0) System.out.println(index);
        }        
        leitor.close();
    }
	
}
