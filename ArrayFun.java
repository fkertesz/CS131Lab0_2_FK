/*
 * This class creates an ArrayFun object made up from Square objects in an application class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 0.2
 * SP 2023
 */
public class ArrayFun
{
	private Square [] myArray; //this variable will be the array containing the Square objects
	private int ind; //this variable will represent the number of items in the array
	
	/*
	 * The empty-argument constructor initializes the instance variables
	 */
	public ArrayFun()
	{
		ind = 6;
		myArray = new Square [6];
		for(int i = 0; i<6; i++)
			myArray[i] = new Square(i);
		
	}//end ArrayFun
	
	/*
	 * @param num is the preferred array length sent into the method
	 */
	public ArrayFun(int num)
	{
		ind = num;
		myArray = new Square [num];
		for(int i = 0; i<num; i++)
			myArray[i] = new Square(i);
	}//end ArrayFun
	
	
	/*
	 * @param index the index of the object set
	 * @param s the Square object set
	 */
	public void setArrayItem(int index, Square s)
	{
		myArray[index] = s;
	}//end setArrayItem
	
	
	/*
	 * @param index the index of the Square item being returned
	 * @return the Square item stored
	 */
	public Square getArrayItem(int index)
	{
		return myArray[index];
	}//end getArrayItem
	
	
	/*
	 * This method prints the areas of the squares in the array forward on standard output
	 * @return System prints out values
	 */
	public void forward()
	{
		for(int i = 0; i<ind; i++)
			System.out.print(myArray[i].area() + " ");
	}//end forward
	
	
	/*
	 * This method prints the areas of the squares in the array backward on standard output
	 * @return System prints out values
	 */
	public void backward()
	{
		for(int i = ind-1; i>-1; i--)
			System.out.print(myArray[i].area() + " ");
	}//end backward
	
	
	/*
	 * This method prints the sum of the areas of the squares in the array on standard output
	 * @return System prints out a value
	 */
	public void sum()
	{
		double areaSum = 0;
		for(int i = 0; i<ind; i++)
		{
			areaSum+=myArray[i].area();
		}
		System.out.print(areaSum);
	}//sum
}//class
