/*
 * This class creates a square object in an application class
 * @author Fanni Kertesz
 * @version 1.0
 * Lab 0.2
 * SP 2023
 */
public class Square
{
	private double side; //this variable will store the side length of the square
	
	/*
	 * The empty-argument constructor initializes the instance variables
	 */
	public Square()
	{
		side = 0;
	}//the end of constructor
	
	
	/*
	 * @param preferredSide is the preferred side length sent into the method
	 */
	public Square(double preferredSide)
	{
		side = preferredSide;
	}//the end of constructor
	
	/*
	 * @param newSide the side length set
	 */
	
	public void setSide(double newSide)
	{
		side = newSide;
	}//end setSide
	
	
	/*
	 * @return the current side length
	 */
	public double getSide()
	{
		return side;
	}//end getSide
	
	
	/*
	 * This method calculates the area of the square
	 * @return the area of the square 
	 */
	public double area()
	{
		return (side*side);
	}//end area
}//end class
