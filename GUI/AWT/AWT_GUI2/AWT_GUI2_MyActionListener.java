/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//Here in this code, the ActionListener c=interface has been implemented, in order to 
//give functionality to the AWT_GUI2_Main.

package Class_AWT_GUI2;	//Syntax for compiling : "javac -d . AWT_GUI2_MyActionListener.java", 
						//where "." means that package directory, under the name "Class_AWT_GUI2", is created in the current directory 
						//and AWT_GUI2_MyActionListener.class is put in the newly created folder.

import java.awt.*;	//For designing the container and components of GUI.
import java.awt.event.*;	//For giving functionality to the components of the GUI.

public class AWT_GUI2_MyActionListener implements ActionListener{	//ActionListener interface has been implemented here.
	private int count;
	private TextField tF;
	private Button buttonAdd;
	private Button buttonSubtract;
	public AWT_GUI2_MyActionListener(int count, TextField tF, Button buttonAdd, Button buttonSubtract){
		this.count=count;
		this.tF=tF;
		this.buttonAdd=buttonAdd;
		this.buttonSubtract=buttonSubtract;
	}

	@Override
	public void actionPerformed(ActionEvent aE){
		if(aE.getSource()==buttonAdd){
			count++;	//Increment the value of count.
			tF.setText(count+"");	//Display the value of count.
		}
		else if (aE.getSource()==buttonSubtract){
			count--;	//Decrement the value of count.
			tF.setText(count+"");	//Display the value of count.
		}
	}
}