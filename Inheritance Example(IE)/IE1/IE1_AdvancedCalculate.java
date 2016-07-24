/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

package Class_IE1;	//Syntax for compiling : "javac -d . IE1_AdvancedCalculate.java", 
					//where "." means that package directory, under the name "Class_IE1", is created in the current directory 
					//and IE1_AdvancedCalculate.class is put in the newly created folder.

public class IE1_AdvancedCalculate extends IE1_Calculate{
	public int modulus(int dividend, int divisor){
		int remainder=dividend % divisor;	// remainder
		if(remainder<0){
			return divisor+remainder;
		}
		else
		{
			return remainder;
		}
	}
	public int absolute(int number){
		if(number<0){
			return -1*number;
		}
		else{
			return number;
		}
	}
}