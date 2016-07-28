/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.io.*;	//Imports all the Classes, Interfaces, Exceptions etc of the package java.io . 
import java.util.Scanner;	//Scanner class for efficiently reading the inputs.

public class FIO2_Main{
	public static void main(String[] args) throws IOException{	//IOException is thrown for close\()
																//method.
		 File fileInput = new File("FIO2_Input.txt");	
		 File fileOutput = new File("FIO2_Output.txt");
		 FileInputStream fIS=null;
		 PrintWriter pW=null;	//We haven't used OutputStreamWriter for writing
		 						//to a file, because write() method of it makes
		 						//it complicated to write a string to the file.
		 try{
			fIS = new FileInputStream(fileInput);
		 	Scanner inputs = new Scanner(fIS);
		 	pW = new PrintWriter(fileOutput);
		 	while(inputs.hasNext()){	
		 		//pW.write(inputs.nextLine());	//Writes texts one afte another, 
		 										//without any token or whatsoever.

		 		pW.println(inputs.nextLine());	//Adds new line at the end of the text.	 	
		 	}
		 }catch(FileNotFoundException fNFE){
		 	fNFE.printStackTrace();
		 }finally{
		 	if(fIS!=null){
		 		fIS.close();	//It is imperative that a stream is 
		 						//closed when it's work is finished
		 	}					
		 	if(pW!=null){
		 		pW.close();	//Before when this line for closing
		 					//the stream was not added, it wasn't
		 					//writing anything to the file. So
		 					//closing a file is important and it's 
		 					//a very good practice.
		 	}
		 }
	}
}