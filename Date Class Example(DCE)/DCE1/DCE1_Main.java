/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.util.Date;
import java.text.SimpleDateFormat;

public class DCE1_Main{
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("\nPrinting the date fields in the dafault manner	:	"+date+"\n");
		/*
		Letter		Date or Time Component		Presentation		Examples
		G					Era designator			Text 				AD
		y					Year					Year			1996; 96
		Y					Week year				Year			2009; 09
		M					Month in year			Month			July; Jul; 07
		w					Week in year			Number			27
		W					Week in month			Number			2
		D					Day in year				Number			189
		d					Day in month			Number			10
		F					Day of week in month	Number			2
		E					Day name in week		Text			Tuesday; Tue
		u					Day number of week 		Number			1
							(1 = Monday, 
							..., 7 = Sunday)	
		a					Am/pm marker			Text			PM
		H					Hour in day (0-23)		Number			0
		k					Hour in day (1-24)		Number			24
		K					Hour in am/pm (0-11)	Number			0
		h					Hour in am/pm (1-12)	Number			12
		m					Minute in hour			Number			30
		s					Second in minute		Number			55
		S					Millisecond				Number			978
		z					Time zone				General 		Pacific Standard Time; PST; GMT-08:00
													time zone		
		Z					Time zone				RFC 822 		-0800
													time zone	
		X					Time zone				ISO 8601 		-08; -0800; -08:00
													time zone	

		*/

		SimpleDateFormat sdf=new SimpleDateFormat("y/M/d");
		System.out.println("\nPrinting date in format 1	:	"+sdf.format(date)+"\n");

		sdf=new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("\nPrinting date in format 2	:	"+sdf.format(date)+"\n");

		sdf=new SimpleDateFormat("G d-M-y E hh:mm:ss:SS a z");
		System.out.println("\nPrinting date in format 3	:	"+sdf.format(date)+"\n");

		sdf=new SimpleDateFormat("'Era: 'G  ' Date: 'd-MMMM-y E HH:mm:ss:SS a z");
		System.out.println("\nPrinting date in format f	:	"+sdf.format(date)+"\n");		
	}
}