/*Realiza un programa que transforme n�meros en formato decimal a n�meros en
formato romano (hasta el n�mero 3999 como m�ximo).*/
import java.util.Scanner;
public class deciroman {
	public static void main(String[]args) {
		Scanner imput=new Scanner(System.in);
		int num;
		String romanos="";
		System.out.println("Ingresa un n�mero: ");
		do {
			System.out.println("Por favor, ingresa un n�mero de 1 - 3999: ");
			num=imput.nextInt();
			
		}while (!(num >0 && num <= 3999));
		//aqu� se transforman los n�meros
		
		while(num>=1000) {
			num=num-1000;
			romanos=romanos+"M";	
		}
		while(num>=900) {
			num=num-900;
			romanos=romanos+"CM";
		}
		while(num>=500) {
			num=num-500;
			romanos=romanos+"D";
		}
		while(num>=100) {
			num=num-100;
			romanos=romanos+"C";
		}
		while(num>=90) {
			num=num-90;
			romanos=romanos+"XC";
		}
		while(num>=50) {
			num=num-50;
			romanos=romanos+"L";
		}
		while(num>=40) {
			num=num-40;
			romanos=romanos+"XL";
		}
		while(num>=10) {
			num=num-10;
			romanos=romanos+"X";
		}
		while(num>=5) {
			num=num-5;
			romanos=romanos+"V";
		}
		while(num>=4) {
			num=num-4;
			romanos=romanos+"IV";
		}
		while(num>=1) {
			num=num-1;
			romanos=romanos+"I";
		}
		System.out.println("Tu n�mero en romano es: "+romanos);
		imput.close();
		/* N�MEROS ROMANOS 
		 * 
		 * M = 1000
		 * CM= 900
		 * D= 500
		 * CD= 400
		 * C= 100
		 *                XC= 90
		 * XC= 90
		 * LX= 60
		 * L= 50
		 *                XL= 40
		 * XL= 40
		 * X=10
		 * V= 5
		 * I= 1
		 * 
		 */
	}
}
