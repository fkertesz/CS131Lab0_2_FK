/*
 * This class runs the methods of classes Square and ArrayFun
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 0.2
 * SP 2023
 */
public class Application
{
	/*
	 * Main method allows execution of the class
	 * @param String[] args, command line arguments
	 */
	public static void main(String[] args)
	{
		ArrayFun defaultArray = new ArrayFun();//creates a new ArrayFun object with default length (6)
		ArrayFun otherArray = new ArrayFun(10);//creates a new ArrayFun object with preferred length of 10
		
		// sets the second item in otherArray to a square with side length 13
		otherArray.setArrayItem(2, new Square(13));
		
		//prints the side length and area of the 3rd item of defaultArray on standard output
		System.out.println("defaultArray[3] side length: " + defaultArray.getArrayItem(3).getSide());
		System.out.println("defaultArray[3] area: " + defaultArray.getArrayItem(3).area());
		
		//prints defaultArray forward, backward, sum on standard output
		System.out.print("defaultArray forward: ");
		defaultArray.forward();
		System.out.print("\ndefaultArray backward: ");
		defaultArray.backward();
		System.out.print("\ndefaultArray sum: ");
		defaultArray.sum();
		
		//prints otherArray forward, backward, sum on standard output
		System.out.print("\notherArray forward: ");
		otherArray.forward();
		System.out.print("\notherArray backward: ");
		otherArray.backward();
		System.out.print("\notherArray sum: ");
		otherArray.sum();
		
	}//end main
}//end class
