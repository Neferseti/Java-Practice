/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.util.Calendar;

public class CCE1_Main{
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		System.out.println("\n1) "+calendar+"\n"); //It prints every field information related to the calendar object. 

		System.out.println("\n2) "+calendar.get(Calendar.MONTH)+"\n"); //For printing the current month. The output is zero based.

		System.out.println("\n3) "+calendar.get(Calendar.MINUTE)+"\n"); //For printing the minutes past the current hour.

		System.out.println("\n4) "+calendar.get(Calendar.DATE)+"\n"); //For printing the date.
		
		calendar.add(Calendar.DATE, 3);
		System.out.println("\n5) "+calendar.get(Calendar.DATE)+"\n"); //For printing the date after 3 days than the current date
	}
}