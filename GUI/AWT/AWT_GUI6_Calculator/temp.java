			String buttonLabel=aE.getActionCommand();
			if(buttonLabel.equals("0")||buttonLabel.equals("1")||buttonLabel.equals("2")||buttonLabel.equals("3")||buttonLabel.equals("4")||buttonLabel.equals("5")||buttonLabel.equals("6")||buttonLabel.equals("7")||buttonLabel.equals("8")||buttonLabel.equals("9")){
				num=num*10 + Double.parseDouble(buttonLabel);
				textFieldForNumDisplay.setText(num+"");
			}
			else if(buttonLabel.equals("+")||buttonLabel.equals("-")||buttonLabel.equals("*")||buttonLabel.equals("/")){
				values.push(num);
				num=0;
				textFieldForNumDisplay.setText(buttonLabel+"");
				if(operators.empty()){
					operators.push(buttonLabel);
				}
				else{
					String op = operators.pop();
					operators.push(buttonLabel);
					Double b = values.pop();
					Double a = values.pop();
					Double n=0.0;
					if(op.equals("+")){
						n=a+b;
					}
					else if(op.equals("-")){
						n=a-b;
					}
					else if(op.equals("*")){
						n=a*b;
					}
					else if(op.equals("/")){
						n=a/b;
					}
					values.push(n);
					textFieldForNumDisplay.setText(n+"");
				}
			}
			else{
				if(operators.empty()){
					textFieldForNumDisplay.setText(values.peek()+"");
				}
				else{
					String op = operators.pop();
					Double b = values.pop();
					Double a = num;
					num=0;
					Double n=0.0;
					if(op.equals("+")){
						n=a+b;
					}
					else if(op.equals("-")){
						n=a-b;
					}
					else if(op.equals("*")){
						n=a*b;
					}
					else if(op.equals("/")){
						n=a/b;
					}
					values.push(n);
					textFieldForNumDisplay.setText(n+"");
				}
			}