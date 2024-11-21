package homework;

import java.util.Scanner;

public class date {
	private int j;
	private int m;
	private int a;
	public date() throws MoisException, JourException{
		try {
		Scanner sc = new Scanner(System.in);
        System.out.println("donner mois ");
        int mois = sc.nextInt();
        if(mois<1||mois>12 ) {
        	throw new MoisException("le mois saisi doit etre un entier entre 1 et 12 :");}
        this.m=mois;
        
        
        System.out.println("donner Jour");
        int jour = sc.nextInt();
        if(jour<1||jour>31 ) {
        	throw new JourException("le jour saisi doit etre un entier entre 1 et 31.");}
        
        this.j=jour;
        System.out.println("donner anne ");
        int anne=sc.nextInt();
        this.a=anne;
		} catch (Exception e) {
            throw e;}}
		
		
		
	public static void main(String[]args) {
		try {
	  date d =new date();	
	        }
	catch(MoisException e) {
		System.out.println(e.getMessage());}
	catch(JourException e) {
		System.out.println(e.getMessage());}
	}}
	
	


