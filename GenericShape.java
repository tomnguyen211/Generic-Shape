package hw03;
/** 
 * Create a Generic Shape Class to store a name and color of the shape
 * Implement Comparable Class to compare object*/
public class GenericShape implements Comparable<GenericShape> {
	/**  {@code String} will store a name of shape object */
	private String name;
	/**  {@code String} will store a color of shape object */
	private String colors;
	/**  Initializes the GenericShape using the given parameter values
	 *   @param name the name of object instance
	 *   @param color the color of the object instance */
	public GenericShape(String name, String color)
	{
		this.name = name;
		this.colors = color;
	}
	/** Override the @method compareTo from Comparable Class
	 * @param b the object that need to be compare with this object
	 * @return value of zero, positive, or negative */
	@Override
	public int compareTo(GenericShape b)
	{
		return b.name.compareTo(this.name);
	}
	/** Get name of object
	 * @return the name of object */
	public String getName()
	{
		return name;
	}
	/** Set name of object 
	 * @param	Take in the name of Object*/	
	public void setName(String name)
	{
		this.name = name;
	}
	/** Get color of object 
	 * @return	the color of Object*/
	public String getColor()
	{
		return colors;
	}
	/** Set color of object 
	 * @return	the color of Object*/
	public void setColor(String color)
	{
		this.colors = color;
	}
	@Override
	/**  
	 * @return	the string of name and color of Object*/
	public String toString()
	{
		return this.colors + " " + this.name;
	}
}
