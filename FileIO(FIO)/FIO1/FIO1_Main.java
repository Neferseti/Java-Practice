/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.io.*;	//Imports all the Classes, Interfaces, Exceptions etc of the package java.io

public class FIO1_Main{
	public static void main(String[] args) throws IOException{	//IOException is thrown for read\() method of 
																//FileInputStream Object.  
		
		File file = new File("FIO1_Input.txt");	//Abstract representation of file and 
												//directory pathname using File class.
		
		try{	//try-catch block in case file is not found.
			FileInputStream fIS = new FileInputStream(file);	//It converts the byte stream 
																//of inputs into char stream.
			int i;
			while((i=fIS.read())!=-1) {	//Since FileInputStream object contains the 
										//char stream, read() method read each char
										//of that stream, even spaces and newline,
										//and returns its ASCII code. That means if
										//number 368 as input is given, it won't read 
										//368 together as a complete number, but rather 
										//as three different numbers, 3,6 and 8, and
										//return their ASCII values.   
				System.out.println(i);
				fIS.read();	//This read statement to ignore spaces and newlines. 
			}	
		}
		catch(FileNotFoundException fNFE){
			fNFE.printStackTrace();
		}
	}
}