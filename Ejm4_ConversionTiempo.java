package inf100;

import java.util.Scanner;

public class Ejm4_ConversionTiempo {

	public static void main(String[] args) {
		double Xmin, Xh, Xd;
		Scanner in=new Scanner(System.in);
		Xh=0;
		Xd=0;
		
		System.out.println("Int. X en min: ");
		Xmin=in.nextDouble();
		
		Xh=Xmin/60;
		Xd=Xh/24;
		
		System.out.println("X en horas es "+Xh);
		System.out.println("X en dias es "+Xd);

	}

}
