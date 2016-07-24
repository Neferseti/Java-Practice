/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package Class_Permutation1;//Syntax for compiling : "javac -d . Permutation1_Main.java", 
							//where "." means that package directory, under the name "Class_Permutation1", is created in the current directory 
							//and Permutation1_Main.class is put in the newly created folder.
	
							//Syntax for running the main file : "java Class_Permutation1.Permutation1_Main".


import java.util.Scanner;
import Class_Permutation1.Permutation1_Permute;

public class Permutation1_Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of characters	:	");
		int sizeOfArray=input.nextInt();
		char[] characters=new char[sizeOfArray];
		for (int i=0;i<sizeOfArray;i++) {
			System.out.print("Enter the character "+(i+1)+"	:	");
			characters[i]=input.next().charAt(0);
		}
		Permutation1_Permute permute=new Permutation1_Permute(characters,sizeOfArray);
		permute.permute(0, sizeOfArray-1);
	}
}