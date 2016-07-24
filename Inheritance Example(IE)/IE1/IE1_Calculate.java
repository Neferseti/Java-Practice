/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

package Class_IE1;	//Syntax for compiling : "javac -d . IE1_Calculate.java", 
					//where "." means that package directory, under the name "Class_IE1", is created in the current directory 
					//and IE1_Calculate.class is put in the newly created folder.
	
public class IE1_Calculate{
	public int add(int number1, int number2){
		return number1 + number2;
	}
	public int subtract(int number1, int number2){
		return number1 - number2;
	}
	public int multiply(int number1, int number2){
		return number1 * number2;
	}
	public float division(int dividend, int divisor){
		return ((float)dividend) / divisor;				// quotient
	}
}