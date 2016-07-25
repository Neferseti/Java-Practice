/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//A simple GUI for displaying the location of the cursor

import java.awt.*;
import java.awt.event.*;

public class AWT_GUI4_Main extends Frame implements MouseListener{
	private TextField textFieldX;	//TextField to display the X location of the cursor.
	private Label labelX;	//Label for textFieldX.
	private TextField textFieldY;	//Textfield to display the Y location of the cursor.
	private Label labelY;	//Label for textFieldY.

	public AWT_GUI4_Main(){
		//--------------------------------------------------------------------------------------------------------------------
		setLayout(new FlowLayout());	//setLayout() is the method of the Frame Class, which lays 
										//the component of the frame in a particular fashion. 
										//The anonymous instance "new FlowLayout()" arranges the
										//from left to right, and flow to next row from top-to-bottom.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//--------------------------------------------------------------------------------------------------------------------
		labelX=new Label("X-Location");
		add(labelX);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------		
		textFieldX=new TextField("Click it!",20);
		textFieldX.setEditable(false);
		add(textFieldX);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		labelY=new Label("Y-Location");
		add(labelY);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------		
		textFieldY=new TextField("Click it!",20);
		textFieldY.setEditable(false);
		add(textFieldY);
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		addMouseListener(this);
		setTitle("AWT_GUI4_Main_Pointer_Location");
		setSize(300,100);
		setVisible(true);		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}

	@Override
	public void mouseClicked(MouseEvent evt) {
      textFieldX.setText(evt.getX() + "");
      textFieldY.setText(evt.getY() + "");
   }
 
   // Not used - need to provide an empty body to compile.
   @Override public void mousePressed(MouseEvent evt) { }
   @Override public void mouseReleased(MouseEvent evt) { }
   @Override public void mouseEntered(MouseEvent evt) { }
   @Override public void mouseExited(MouseEvent evt) { }

	public static void main(String[] args) {
		AWT_GUI4_Main sample=new AWT_GUI4_Main();
	}
}