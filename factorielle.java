package homework;

public class factorielle {
	 public static void main (String[] args){
	int i;
	int nbEntiers=0;
	int factorielle=1;
	int ancien;
	try {
	nbEntiers= Integer.parseInt(args[0]); 
	if(nbEntiers<0) {
		throw new NegativeException(nbEntiers+" est négatif : la factorielle d'un nombre négatif n'est pas définie");
	}
	else {
	for (i=2;i<= nbEntiers;i++){
	ancien=factorielle;
	factorielle *= i;
	}
	System.out.println(" Voila la factorielle des "+ nbEntiers +" premiers entiers : "+ factorielle );
	}}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Donnez en paramètre la base de la factorielle");
	}
	catch(NumberFormatException e) {
		System.out.println("La base de la factorielle doit être ENTIERE");
	}
	catch(NegativeException e) {
	System.out.println(e.getMessage());}
	
	}}

