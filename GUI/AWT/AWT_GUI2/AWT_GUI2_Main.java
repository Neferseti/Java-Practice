/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//Here in this code, a simple counter with two button, one for adding and one for 
//subtracting, has been made.

package Class_AWT_GUI2;	//Syntax for compiling : "javac -d . AWT_GUI2_Main.java", 
						//where "." means that package directory, under the name "Class_AWT_GUI2", is created in the current directory 
						//and AWT_GUI2_Main.class is put in the newly created folder.

						//Syntax for running the main file : "java Class_AWT_GUI2.AWT_GUI2_Main".

import java.awt.*;	//For designing the container and components of GUI.

public class AWT_GUI2_Main extends Frame {

	private Label labelCounter;	//Assign the label to the text field.
	private TextField textFieldCounter;	//Text field which displays the current value of the count.
	private Button buttonAdd;	//Button to increment the counter.
	private Button buttonSubtract;	//Button to decrement the counter.
	private int count=0;	//Value of the counter.

	public AWT_GUI2_Main(){
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
		textFieldCounter=new TextField("0",10);	//Construct the TextField Component.
		textFieldCounter.setEditable(false);	//Restrict the value displayed in the TextField to be changed 
												//only by the buttonCounter. In other words, it is set to be 
												//read-only.
		add(textFieldCounter);	//Adds Text Field to the right of the Label.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		buttonAdd=new Button("Add");	//Constructs the Button Component.
		add(buttonAdd);	//Adds button to the right of the text field.
		buttonAdd.addActionListener(new AWT_GUI2_MyActionListener(getCount(),getTextField(),getButtonAdd(),getButtonSubtract()));	
																	//buttonAdd is the source object which triggers 
																	//ActionEvents(a class) when clicked. The source add 
																	//the anonymous instance of the mentioned ActionListener
																	//which provides a handler called actionPerformed(). 
																	//Clicking buttonAdd invokes actionPerformed().
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		buttonSubtract=new Button("Subtract");	//Constructs the Button Component.
		add(buttonSubtract);	//Adds button to the right of the text field.
		buttonSubtract.addActionListener(new AWT_GUI2_MyActionListener(getCount(),getTextField(),getButtonAdd(),getButtonSubtract()));	
																	//buttonSubtract is the source object which triggers 
																	//ActionEvents(a class) when clicked. The source add 
																	//the anonymous instance of the mentioned 
																	//ActionListener which provides a handler called 
																	//actionPerformed(). Clicking buttonSubtract invokes 
																	//actionPerformed().
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		setTitle("AWT_GUI2_Main_Counter");	//Set the title of the frame. It is an inherited function of Frame Class.
		setSize(300,200);	//Inherited function of Frame Class to set its initial window size.
		setVisible(true);	//inherited function of Frame Class to show the frame.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}

	public int getCount(){
		return count;	//Returns the value of count.
	}

	public TextField getTextField(){
		return textFieldCounter;	//Returns the private object of TextField of the current class.
	}

	public Button getButtonAdd(){
		return buttonAdd;	//Returns the private object buttonAdd of the current class.
	}

	public Button getButtonSubtract(){
		return buttonSubtract;	//Returns the private object buttonAdd of the current class.
	}

	public static void main(String[] args) {
		AWT_GUI2_Main sample = new AWT_GUI2_Main();
	}
}