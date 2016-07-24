/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

// Here in this example, a simple GUI for counter is made 


import java.awt.*;	//For designing the container and components of GUI.
import java.awt.event.*;	//For giving functionality to the components of the GUI.

public class AWT_GUI1_Main extends Frame implements ActionListener{

	private Label labelCounter;	//Assign the label to the text field.
	private TextField textFieldCounter;	//Text field which displays the current value of the count.
	private Button buttonCounter;	//Button to increment the counter.
	private int count=0;	//Value of the counter.

	public AWT_GUI1_Main(){
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
		buttonCounter=new Button("Count");	//Constructs the Button Component.
		add(buttonCounter);	//Adds button to the right of the text field.
		buttonCounter.addActionListener(this);	//buttonCounter is the source object which triggers ActionEvents(a class)
												//when clicked. The source add 'this' instance as an ActionEvent listener,
												//which provides an ActionEvent listener called actionPerformed(). Clicking
												//buttonCounter invokes actionPerformed().
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		setTitle("AWT_GUI1_Main_Counter");	//Set the title of the frame. It is an inherited function of Frame Class.
		setSize(300,75);	//Inherited function of Frame Class to set its initial window size.
		setVisible(true);	//inherited function of Frame Class to show the frame.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}

	@Override
	public void actionPerformed(ActionEvent aE){
		count++;	//Increment the value of count.
		textFieldCounter.setText(count+"");	//Set the text in the TextField as count.
	}

	public static void main(String[] args) {
		AWT_GUI1_Main sample = new AWT_GUI1_Main();
	}
}