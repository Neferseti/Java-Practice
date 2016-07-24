/*------------------------------This code was developed by--------------------------------*/
//
//									MANI K. SRIVASTAVA
//								Associate Software Developer 
//											@
//										  NOVOPAY
//
/*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/

//The following code permutes the elements of the character array

package Class_Permutation1;	//Syntax for compiling : "javac -d . Permutation1_Permute.java", 
							//where "." means that package directory, under the name "Class_Permutation1", is created in the current directory 
							//and Permutation1_Permute.class is put in the newly created folder.

public class Permutation1_Permute{
	private char[] characters;
	private int sizeOfArray;

	Permutation1_Permute(char[] characters, int sizeOfArray){
		this.characters=characters;
		this.sizeOfArray=sizeOfArray;
	}

	private void swap(int l, int r){
		char temp=characters[l];
		characters[l]=characters[r];
		characters[r]=temp;
	}

	public void permute(int l, int r){
		if(l==r){
			for (int i=0;i<sizeOfArray;i++) {
				System.out.print(characters[i]+" ");
			}
			System.out.println();
		}
		else{
			for (int i=l;i<=r;i++) {
				swap(l,i);
				permute(l+1,r);
				swap(l,i);
			}
		}
	}

}