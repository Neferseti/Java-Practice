/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//Here in this example, a simple GUI for counter is made.

import java.awt.*;	//For designing the container and components of GUI.
import java.awt.event.*;	//For giving functionality to the components of the GUI.

public class AWT_GUI3_Main extends Frame implements ActionListener, WindowListener{
	private Label labelCounter;	//Assign the label to the text field.
	private TextField textFieldCounter;	//Text field which displays the current value of the count.
	private Button buttonAdd;	//Button to increment the counter.
	private Button buttonSubtract;	//Button to decrement the counter.
	private int count=0;	//Value of the counter.

	public AWT_GUI3_Main(){
		//--------------------------------------------------------------------------------------------------------------------
		setLayout(new FlowLayout());	//setLayout() is the method of the Frame Class, which lays 
										//the component of the frame in a particular fashion. 
										//The anonymous instance "new FlowLayout()" arranges the
										//from left to right, and flow to next row from top-to-bottom.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		labelCounter=new Label("~Counter~");	//Construct the Label Component.
		add(labelCounter);	//add() is the method of Frame Class, which has been extended to the current class
							//(Actually, add() is the method of java.awt.Container, which java.awt.Frame has 
							//inherited).
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		textFieldCounter=new TextField("0",20);	//Construct the TextField Component.
		textFieldCounter.setEditable(false);	//Restrict the value displayed in the TextField to be changed 
												//only by the buttonCounter. In other words, it is set to be 
												//read-only.
		add(textFieldCounter);	//Adds Text Field to the right of the Label.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		buttonAdd=new Button("Add");	//Constructs the Button Component.
		add(buttonAdd);	//Adds button to the right of the text field.
		buttonAdd.addActionListener(this);	//buttonCounter is the source object which triggers ActionEvents(a class)
											//when clicked. The source add 'this' instance as an ActionEvent listener,
											//which provides an ActionEvent listener called actionPerformed(). Clicking
											//buttonCounter invokes actionPerformed().
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		buttonSubtract=new Button("Subtract");	//Constructs the Button Component.
		add(buttonSubtract);	//Adds button to the right of the text field.
		buttonSubtract.addActionListener(this);	//buttonCounter is the source object which triggers ActionEvents(a class)
												//when clicked. The source add 'this' instance as an ActionEvent listener,
												//which provides an ActionEvent listener called actionPerformed(). Clicking
												//buttonCounter invokes actionPerformed().
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		addWindowListener(this);	//It adds the current class as the WindowListener. The associated methods 
									//have been implemented below.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//--------------------------------------------------------------------------------------------------------------------
		setTitle("AWT_GUI3_Main_Counter");	//Set the title of the frame. It is an inherited function of Frame Class.
		setSize(300,100);	//Inherited function of Frame Class to set its initial window size.
		setVisible(true);	//inherited function of Frame Class to show the frame.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}

	@Override
	public void actionPerformed(ActionEvent aE){
		if(aE.getSource()==buttonAdd){
			count++;	//Increment the value of count.
			textFieldCounter.setText(count+"");	//Set the text in the TextField as count.
		}
		else if(aE.getSource()==buttonSubtract){
			count--;	//Decrement the value of count.
			textFieldCounter.setText(count+"");	//Set the text in the TextField as count.
		}
		
	}

	@Override
	public void windowClosing(WindowEvent wE){
		System.exit(0);
	}

	// Not Used, but need to provide an empty body to compile.
   	@Override public void windowOpened(WindowEvent evt) { }
   	@Override public void windowClosed(WindowEvent evt) { }
   	@Override public void windowIconified(WindowEvent evt) { }
   	@Override public void windowDeiconified(WindowEvent evt) { }
   	@Override public void windowActivated(WindowEvent evt) { }
   	@Override public void windowDeactivated(WindowEvent evt) { }

	public static void main(String[] args) {
		AWT_GUI3_Main sample = new AWT_GUI3_Main();
	}
}