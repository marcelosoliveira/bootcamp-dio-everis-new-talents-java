package com.desafio.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class UniformeFinalAno {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String owner, color, size;
//        String[] colorSize = new String[2];
        List<Tshirt> tshirts = new ArrayList<>();
        
        int N = toInt(read());
        
        for (int index = 0; index < N; index++) {
        	owner = read();
//        	colorSize = read().split("\\ ");
        	color = read();
        	size = read();
        	
        	if(owner.equals("0")) {
                break;
            }
        	
        	Tshirt tshirt = new Tshirt(size, color, owner);
        	tshirts.add(tshirt);
        }
        
        Comparator<Tshirt> comparator = Comparator
        		.comparing(Tshirt::getColor).reversed()
        		.thenComparing(Tshirt::getSize).reversed()
        		.thenComparing(Tshirt::getOwner);

        tshirts.stream().sorted(comparator).forEach(System.out::println);
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }
}

class Tshirt {

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }
}

