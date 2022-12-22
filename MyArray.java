package hw03;

import java.util.Random;
/** 
 * Create a MyArray Class with generic type E using Comparable Class of same 
 * type
 **/
public class MyArray<E extends Comparable<E>> {
	/**This {@code E[]} is an array of generic type data*/
	private E[] data;
	/** Initializes the MyArray Object using the given parameter array size values*/
    public MyArray(int size) {
        this.data = (E[])(new Comparable[size]);
    }

    //This constructor can accept an array or a comma-separated list of values.
    public MyArray(E ... elements) {
        this.data = (E[])(new Comparable[elements.length]);
        //Make a deep copy to prevent shared references.
        System.arraycopy(elements, 0, this.data, 0, elements.length);
    }
    /** Get a data of an array
     * @param index		take in an index number of an array
     * @return 			the data of the that array of index*/
    public E get(int index)
    {
    	return data[index];
    }
    /** Get an array data of an array
     * @param start			the start of index
     * @param end			the end of index		
     * @return 				the data of the that array of start,end index*/
    public MyArray<E> get(int start, int end) 
    {   
    	int newArrayLength = end + 1 - start;
    	/** Initializes a temporary array to store data*/
    	E[] dataTemp = (E[])(new Comparable[newArrayLength]);
    	int index = 0;
    	for (int n = start; n <= end; n++) {
    		dataTemp[index] = data[n];
    		index++;
    	}
    	/** Pass the data to a temporary MyArray object*/
    	MyArray<E> newArray = new MyArray(dataTemp);
		return newArray;
    }
    /** Put new data value to specific index spot
     * @param index			the index of array
     * @param value			the new data value */
    public void put(int index, E value)
    {
    	data[index] = (E) value;
    }
    /** Put an array data values to specific range of index spot
     * @param start			start of index
     * @param end			end of index
     * @param value			the array of data */
    public void put(int start, int end, E[] values)
    {
    	int index = 0;
    	for(int n = start; n <= end; n++)
    	{
    		data[n] = values[index];
    		index++;
    	}
    }
    /** Compare two objects
     * @param e			the object that need to compare
     * @return			true if equal and false if not equal*/
    @Override
    public boolean equals(Object e) 
    {
    	/** Initializes a new object clone of this object*/
    	MyArray<E> clone = this.get(0, data.length-1);
		/** Initializes a new object clone of the object need to compare*/
		MyArray<E> compare = (MyArray<E>) e;	
		/** Check for array size of both objects*/
		if(clone.size() == compare.size())
		{
			/** Using For Loop to check for type and using compareTo from
			 * Comparable Class to check for each individual data in exact
			 * order */
			for (int n = 0; n < clone.size(); n++)
			{
				/** Compare Type*/
				if(!clone.get(n).getClass().equals(compare.get(n).getClass()))
					return false;
				/** Compare Data*/
				else if(clone.get(n).compareTo(compare.get(n)) != 0)
					return false;
				/** Compare Last Data and return true if equal*/
				else if(n == clone.size()-1 && clone.get(clone.size() - 1).compareTo(compare.get(compare.size()-1)) == 0)
					return true;
					
			}
		}
		return false;
    }
    /** Get the Max value
     * @return		the max value in array of data*/
    public E max()
    {
		E max;
		max = data[0];
		for(int n = 1; n < data.length;n++)
		{
			if(data[n].compareTo(max)  > 0)
			{
				max = data[n];
			}
		}
    	return max;
    }
    /** Get the Min value
     * @return		the min value in array of data*/
    public E min()
    {
		E min;
		min = data[0];
		for(int n = 1; n < data.length;n++)
		{
			if(data[n].compareTo(min)  < 0)
			{
				min = data[n];
			}
		}
    	return min;
    }
    /** Reverse the data in an array*/
    public void reverse()
    {
    	int length = data.length -1;
    	E dataTemp;
    	for(int n = 0; n < data.length; n++)
    	{
    		if(n >= length)
    			break;
    		dataTemp = data[n];
    		data[n] = data[length];
    		data[length] = dataTemp;   		
    		length--;
    	}
    }
    /** Shuffle the data in an array*/
    public void shuffle()
    {
    	 Random random = new Random();
    	 for(int n = 0; n < data.length; n++)
    	 {
    		 int index = random.nextInt(data.length - 1);
    		 E swap = data[n];
    		 data[n] = data[index];
    		 data[index] = swap; 
    	 }
    }
    /** Move all data to the left of specific distance
     * @param shiftDistace			the distance that need to be move*/
    public void leftShift(int shiftDistance)
    {
    	/** The first for loop to count the number of shift*/
    	for(int n = 0; n < shiftDistance; n++)
    	{
    		int i;
    		/** Store the first data value*/
    		E temp = data[0];
    		/** Start shifting data except the last data, in asc order*/
    		for(i = 0; i < data.length - 1; i++)
    		{
    			data[i] = data[i+1];
    		}
    		/** The last data will equal the first data that stored earlier*/
    		data[i] = temp;
    	}
    }
    /** Move all data to the right of specific distance
     * @param shiftDistace			the distance that need to be move*/
    public void righttShift(int shiftDistance)
    {
    	/** The first for loop to count the number of shift*/
    	for(int n = 0; n < shiftDistance; n++)
    	{
    		int i;
    		/** Store the last data value*/
    		E temp = data[data.length-1];
    		/** Start shifting data except the fist data, in desc order*/
    		for(i = data.length -1; i > 0; i--)
    		{
    			data[i] = data[i-1];
    		}
    		/** The first data will equal the last data that stored earlier*/
    		data[i] = temp;
    	}
    }
    /** Size array of an object
     * @return 			the size of an array*/
    public int size()
    {
    	return data.length;
    }
    /** Print out the object
     * @return 			String of name of object*/
    public String toString()
    {
    	String word = "";
    	for(int n = 0; n < data.length; n++)
    	{
    		word += data[n].toString();
    		if(n < data.length - 1)
    			word += ", ";
    	}
		return word;   					    	
    }
    /** Sort an object*/
    public void sort()
    {
    	/** Create a boolean to stop the sorting*/
    	boolean sort = false;
    	/** While the sort not done, continue sorting*/
    	while(!sort)
    	{
    		/** The fist for loop to make sure it will go all data*/
    		for(int n = 0; n < data.length; n++)
    		{
    			/** The second for loop to compare each adjacent pair of data */
    			for (int i = 0; i < data.length - 1; i++)
    			{
    				/** if the next data is smaller than the current, swap it*/
    				if(data[i].compareTo(data[i+1]) > 0)
    				{
    					E temp = data[i];
    					data[i] = data[i+1];
    					data[i+1] = temp;
    				}
    			}
    			/** When reaching the very last index, it will cancel the while
    			 * loop by setting true boolean*/
    			if(n == data.length -1)
    				sort = true;
    		}

    	}
    }
    
}
