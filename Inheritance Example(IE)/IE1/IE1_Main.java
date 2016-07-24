/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

package Class_IE1;	//Syntax for compiling : "javac -d . IE1_Main.java", 
					//where "." means that package directory, under the name "Class_IE1", is created in the current directory 
					//and IE1_Main.class is put in the newly created folder.

					//Syntax for running the main file : "java Class_IE1.IE1_Main".

import java.util.Scanner;

public class IE1_Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		IE1_Calculate ie1Calculate1 = new IE1_Calculate();
		IE1_Calculate ie1Calculate2 = new IE1_AdvancedCalculate();

		/*------------------------------------------------------------------------------------------------------------------------------*/
		//IE1_AdvancedCalculate ie1AdvancedCalculate1 = new IE1_Calculate();	// This is an invalid expression, 
																				//because we are trying to assign the reference, 
																				//which expects its domain to be atleast as big as itself, 
																				//an object whose domain is smaller than the reference.  
		/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

		IE1_AdvancedCalculate ie1AdvancedCalculate2 = new IE1_AdvancedCalculate();
		int number1=input.nextInt();
		int number2=input.nextInt();

		System.out.println("ie1Calculate1_add = "+ie1Calculate1.add(number1,number2));
		System.out.println("ie1Calculate1_subtract = "+ie1Calculate1.subtract(number1,number2));
		System.out.println("ie1Calculate1_multiply = "+ie1Calculate1.multiply(number1,number2));
		System.out.println("ie1Calculate1_division = "+ie1Calculate1.division(number1,number2));

		System.out.println("\n");

		System.out.println("ie1Calculate2_add = "+ie1Calculate2.add(number1,number2));
		System.out.println("ie1Calculate2_subtract = "+ie1Calculate2.subtract(number1,number2));
		System.out.println("ie1Calculate2_multiply = "+ie1Calculate2.multiply(number1,number2));
		System.out.println("ie1Calculate2_division = "+ie1Calculate2.division(number1,number2));
		
		/*------------------------------------------------------------------------------------------------------------------------------*/
		//System.out.println("ie1Calculate2_modulus = "+ie1Calculate2.modulus(number1,number2));	//Although ie1Calculate2 has been assigned the
		//System.out.println("ie1Calculate2_absolute = "+ie1Calculate2.absolute(number1));			//object of IE1_AdvancedCalculate, 
																									//which has inherited IE1_Calculate, 
																									//these two statements will give an error 
																									//because the domain of ie1_Calculate2 
																									//doesnot expect any other method than 
																									//the method declared in IE1_Calculate, 
																									//even though it is the parent class of 
																									//IE1_AdvancedCalculate.
		/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		System.out.println("\n");

		System.out.println("ie1AdvancedCalculate2_add = "+ie1AdvancedCalculate2.add(number1,number2));
		System.out.println("ie1AdvancedCalculate2_subtract = "+ie1AdvancedCalculate2.subtract(number1,number2));
		System.out.println("ie1AdvancedCalculate2_multiply = "+ie1AdvancedCalculate2.multiply(number1,number2));
		System.out.println("ie1AdvancedCalculate2_division = "+ie1AdvancedCalculate2.division(number1,number2));
		System.out.println("ie1AdvancedCalculate2_modulus = "+ie1AdvancedCalculate2.modulus(number1,number2));
		System.out.println("ie1AdvancedCalculate2_absolute = "+ie1AdvancedCalculate2.absolute(number1));

	}
}