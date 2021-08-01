package com.desafio.java;

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        for (int index = 1; index <= N; index++) {
        	
        	String SD = leitor.next();
        	String SN = leitor.next();
        	
        	if (SD.equals("chuva") && casaSobrando == 0) {
        		casaComprado++;
        		trabSobrando++;
        	} else if (SD.equals("chuva") && casaSobrando > 0) {
        	  trabSobrando++;
        	  casaSobrando--;
        	}
        	if (SN.equals("chuva") && trabSobrando== 0) {
        	  trabComprado++;
        	  casaSobrando++;
        	} else if (SN.equals("chuva") && trabSobrando > 0) {
        	  casaSobrando++;
        	  trabSobrando--;
        	}

        }
        System.out.println(casaComprado + " " + trabComprado);
        
        leitor.close();
    }
	
}

