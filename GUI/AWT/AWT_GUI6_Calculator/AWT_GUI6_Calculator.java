/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

import java.awt.*;	//For designing the container and components of GUI.
import java.awt.event.*;	//For giving functionality to the components of GUI.
import java.util.Stack;	//For using the stack.

public class AWT_GUI6_Calculator extends Frame{
	private Panel panel1ForDisplayingNum;	//Panel 1 which contains the text field to display number.
	private Panel panel2ForButtons1to9;	//Panel 2 which contains the buttons 1 to 9.	
	private Panel panel3ForButton0;	//Panel 3 which contains only the button 0.	
	private Panel panel4ForButtonsOperations;	//Panel 4 for number operations such as addition, subtraction
												//multiplication and division.	
	private TextField textFieldForNumDisplay;	//Text field to display number.	
	private Button[] buttonArray;	//Button array containing buttons for number 0-9 and +, -, *, / and =.
	private Stack<Double> values;	//Stack for storing the computed values.	
	private Stack<String> operators;	//Stack for storing the operators info.	
	private Double num;	//Current number info.

	public AWT_GUI6_Calculator(){
		//--------------------------------------------------------------------------------------------------------------------
		values = new Stack<Double>();	//To get the instance of Stack object which can store Double values.
		operators = new Stack<String>();	//To get the instance of the stack which can store operators.
		num=0.0;	//Initial value of num.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		panel1ForDisplayingNum = new Panel(new FlowLayout());	//Construct the panel with FlowLayout to accomodate
																//TextField for displaying num.
		textFieldForNumDisplay = new TextField("0",35);	//Construct the TextField component with initial display "0"
														//and size be 35 units.
		textFieldForNumDisplay.setEditable(false);	//The value in the textfield container is set
													//to be read-only.
		panel1ForDisplayingNum.add(textFieldForNumDisplay);	//Add this textfield to the panel 1.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		buttonArray = new Button[15];	//Create Button array of size 15.
		panel2ForButtons1to9 = new Panel(new GridLayout(3,3));	//Construct the panel with GridLayout to accomodate the
																//numbers from 1 to 9. Hence, the size given to 
																//GridLayout is 3 by 3.
		for (int i=0;i<9;i++) {
			buttonArray[i] = new Button(Integer.toString(i+1));	//Assign button instance to first 9 elements of
																//Button array
			panel2ForButtons1to9.add(buttonArray[i]);		//Add the buttons from 1-9 to panel 2.
		}

		panel3ForButton0 = new Panel(new GridLayout(1,1));	//Construct the GridLayout to accomodate only
															//one number, which is zero.
		buttonArray[9] = new Button("0");	//Assign button "0" instance to the 10th element of the Button array.
		panel3ForButton0.add(buttonArray[9]);	//Add 10th button to panel 3.

		panel4ForButtonsOperations = new Panel(new GridLayout(5,1));	//Construct the GridLayout of size 5 by 1
																		//to accomodate the operator buttons.
		buttonArray[10] = new Button("+");	//Assign a button instance to 11th element of Button array
											//for addition. 
		panel4ForButtonsOperations.add(buttonArray[10]);	//Add 11th button to panel 4.

		buttonArray[11] = new Button("-");	//Assign a button instance to 12th element of Button array
											//for subtraction.
		panel4ForButtonsOperations.add(buttonArray[11]);	//Add 12th button to panel 4.
		
		buttonArray[12] = new Button("*");	//Assign a button instance to 13th element of Button array
											//for multiplication.
		panel4ForButtonsOperations.add(buttonArray[12]);	//Add 13th button to panel 4.
		
		buttonArray[13] = new Button("/");	//Assign a button instance to 14th element of Button array
											//for division.
		panel4ForButtonsOperations.add(buttonArray[13]);	//Add 14th button to panel 4.
		
		buttonArray[14] = new Button("=");	//Assign a button instance to 15th element of Button array
											//for equating.
		panel4ForButtonsOperations.add(buttonArray[14]);	//Add 15th button to panel 4.

		MyActionListener mAL = new MyActionListener();	//Create an instance of Button Action Listener.

		for (int i=0; i<15; i++) {
			buttonArray[i].addActionListener(mAL);	//Assign the action listener to each button 
													//of button array.
		}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		addWindowListener(new MyWindowListener());	//Add a window listener to close the frame or to 
													//close the application.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		setLayout(new BorderLayout());	//Sets the outer layout of the Frame to be a BorderLayout.
		add(panel1ForDisplayingNum,BorderLayout.NORTH);	//Add Panel 1 to the north section in BorderLayout.
		add(panel2ForButtons1to9,BorderLayout.CENTER);	//Add Panel 2 to the center section in BorderLayout.
		add(panel3ForButton0, BorderLayout.SOUTH);	//Add Panel 3 to the south section in BorderLayout.
		add(panel4ForButtonsOperations,BorderLayout.EAST);	//Add Panel 4 to the east section in BorderLayout.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		//--------------------------------------------------------------------------------------------------------------------
		setTitle("AWT_GUI6_Calculator");	//Set the title of the frame. It is an inherited function of Frame Class.
		setSize(300,200);	//Inherited function of Frame Class to set its initial window size.
		setResizable(false);	//Inherited function of Frame Class to make the window non-resizable.
		setVisible(true);	//Inherited function of Frame Class to show the frame.
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}

	public class MyWindowListener implements WindowListener{
		@Override
		public void windowClosing(WindowEvent wE){	//Implemented method of WindowListener interface
													//to close the window.
			System.exit(0);
		}

		//--------------------------------------------------------------------------------------------------------------------
		//The following methods are not implemented, but still mentioned here to escape from the compile error.
		@Override
		public void windowActivated(WindowEvent wE){ };
		@Override
		public void windowClosed(WindowEvent wE){ };
		@Override
		public void windowDeactivated(WindowEvent wE){ };
		@Override
		public void windowDeiconified(WindowEvent wE){ };
		@Override
		public void windowIconified(WindowEvent wE){ };
		@Override
		public void windowOpened(WindowEvent wE){ };	
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	}
	
	public class MyActionListener implements ActionListener{ 
		@Override 
		public void actionPerformed(ActionEvent aE){	//Assign functionality to each and every button.
			 String bLabel = aE.getActionCommand();
			 if(bLabel.equals("+")||bLabel.equals("-")||bLabel.equals("*")||bLabel.equals("/")||bLabel.equals("=")){
			 	if(values.empty() && operators.empty()){
			 		if(num!=0){
			 			values.push(num);
			 			operators.push(bLabel);
			 			textFieldForNumDisplay.setText(bLabel+"");
			 			num=0.0;
			 		}
			 	}
			 	
			 	else if(values.size()==1 &&  operators.empty()){
			 		if(bLabel.equals("=")){
			 			textFieldForNumDisplay.setText(values.peek()+"");
			 		}
			 		else{
			 			operators.push(bLabel);
			 			textFieldForNumDisplay.setText(bLabel+"");
			 		}
			 	}
			 	else if(values.size()==1 && operators.size()==1){
			 		if(num!=0){
			 			if(bLabel.equals("=")){
			 				values.push(num);
			 				num=0.0;
			 				Double second = values.pop();
			 				Double first = values.pop();
			 				String tempOp = operators.pop();
			 				Double result = getResult(first,second,tempOp);
			 				values.push(result);
			 				textFieldForNumDisplay.setText(result+"");
			 			}
			 			else{
			 				values.push(num);
			 				num=0.0;
			 				Double second = values.pop();
			 				Double first = values.pop();
			 				String tempOp = operators.pop();
			 				operators.push(bLabel);
			 				Double result = getResult(first,second,tempOp);
			 				values.push(result);
			 				textFieldForNumDisplay.setText(result+"");
			 			}
			 		}
			 	}
			 }

			else if(bLabel.equals("0")||bLabel.equals("1")||bLabel.equals("2")||bLabel.equals("3")||bLabel.equals("4")||bLabel.equals("5")||bLabel.equals("6")||bLabel.equals("7")||bLabel.equals("8")||bLabel.equals("9")){
				num=num*10 + Double.parseDouble(bLabel);
				textFieldForNumDisplay.setText(num+"");
			}
		}
	}

	public static Double getResult(Double first, Double second, String tempOp){
		switch(tempOp){
			case "+" : return first+second;
			case "-" : return first-second;
			case "*" : return first*second;
			case "/" : return first/second;
			default: return -1.0;
		}
	}

	public static void main(String[] args) {
		AWT_GUI6_Calculator sample = new AWT_GUI6_Calculator();
	}
}