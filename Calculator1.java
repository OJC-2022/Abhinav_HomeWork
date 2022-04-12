package com.calculator.cal;

	import java.util.Scanner;

	public class Calculator1 {
	    public static void main(String[] args) {

	        System.out.println("Welcome to Mini Calculator" + '\n' + "Calculate with numbers ");
	        Calculator2.desciption();
	        Scanner scan = new Scanner(System.in);
	        System.out.println("type one by one"+'\n'+"option,"+" "+"first no,"+" "+"second no");
	       
	       
	        Calculator2.display(scan.nextInt(), scan.nextInt(), scan.nextInt());
	        
	       
	        // Calculator.display(10, 5, 1);
	        System.out.println("-------********-------");

	    }
	}

	class Calculator2 {
	    static void desciption() {
	        System.out.println("press 1 for add" + '\n' + "press 2 for subtract" + '\n' + "press 3 for multiply" + '\n'
	                + "press 4 for divide" + '\n' + "press 5 for remainder");
	    }

	    static void display(int option, int cal1, int cal2) {

	        // System.out.println("find day with number order");
	        // Scanner scan = new Scanner(System.in);
	        // System.out.print("Enter a number for required day: ");
	        // int day = scan.nextInt();
	        // int day = 6;

	        switch (option) {
	            case 1:{
	                System.out.println("add= " + (cal1 + cal2));
	                break;}
	            case 2:{
	                System.out.println("subtract= " + (cal1 - cal2));
	                break;}
	            case 3:{
	                System.out.println("multiply= " + (cal1 * cal2));
	                break;}
	            case 4:
	                System.out.println("divide= " + (cal1 / cal2));
	                break;

	            case 5:{
	                System.out.println("remainder= " + (cal1 % cal2));
	                break;}

	            default:{
	                System.out.println(" case position invalid, try again under 5");
	                break;}
	        }
	    }
	}



