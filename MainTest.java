package hw03;
/**
 * This Main Class MainTest will perform a simple examples to test each of the
 * method in @class MyArray
 * 
 * @author Dat Nguyen, 402005276, 2013-07
 *
 */
public class MainTest {

	
	public static void main(String[] args)
	{
		/** Create an Object MyArray with a list if Integer type*/
		MyArray<Integer> integer = new MyArray<Integer>(3,5,2,7,2,4,3,9);
		/** Create an Object MyArray with a list if String type*/
		MyArray<String> string = new MyArray<String>("Dat","Danh","Bi","Lan","Nam");
		/** Create Objects GenericShape of variety of shapes and colors*/
		GenericShape shape1 = new GenericShape("Circle","Red");
		GenericShape shape2 = new GenericShape("Rectangle","Blue");
		GenericShape shape3 = new GenericShape("Square","Yellow");
		GenericShape shape4 = new GenericShape("Hex","Pink");
		/** Create an Object MyArray with a list if GenericShape type*/
		MyArray<GenericShape> gShape = new MyArray<GenericShape>(shape1,shape2,shape3,shape4);

		
		
		
		/** REMOVE EACH COMMENT IN SECTION OF METHOD TEST */
		
		
		/** Test @method get(index)  */
//		System.out.println("TEST get(index) Method:");
//		System.out.println(integer.get(0));
//		System.out.println(string.get(1));
//		System.out.println(gShape.get(2).getName());
		
		/** Test @method get(start, end)  */
//		System.out.println("\nTEST get(start,end) Method:");
//		System.out.println("Integer Copy to New Object: ");
//		MyArray<Integer> integer_copy = integer.get(0, 2);
//		for(int n = 0; n < integer_copy.size(); n++)
//		{
//			System.out.println(integer_copy.get(n));
//		}
//		System.out.println("String Copy to New Object: ");
//		MyArray<String> string_copy = string.get(1, 3);
//		for(int n = 0; n < string_copy.size(); n++)
//		{
//			System.out.println(string_copy.get(n));
//		}
//		System.out.println("GenericShape Copy to New Object: ");
//		MyArray<GenericShape> gShape_copy = gShape.get(1, 3);
//		for(int n = 0; n < gShape_copy.size(); n++)
//		{
//			System.out.println(gShape_copy.get(n).getName());
//		}
		
		/** Test @method put(index)  */
//		System.out.println("\nTEST put(index) Method:");
//		System.out.println("Previous index Integer 2: " + integer.get(2));
//		integer.put(2, 5);
//		System.out.println("After index Integer 2: " + integer.get(2));
//		
//		System.out.println("Previous index String 1: " + string.get(1));
//		string.put(1, "Master");
//		System.out.println("After index String 1: " + string.get(1));
//		
//		System.out.println("Previous index GenericShape 3: " + gShape.get(3).getName());
//		GenericShape shapeSub = new GenericShape("Oval","Green");
//		gShape.put(3, shapeSub);
//		System.out.println("After index GenericShape 3: " + gShape.get(3).getName());
		
		/** Test @method put(start, end, values)  */
//		System.out.println("\nTEST put(start, end, values) Method:");
//		System.out.println("Test with Integer Object");
//		Integer[] iArray = {3,4,6};
//		integer.put(0, 2, iArray);
//		for(int n = 0; n <= 2;n++)
//		{
//			System.out.println(integer.get(n));
//		}
//		System.out.println("Test with String Object");
//		String[] sArray = {"My","Best","Effort"};
//		string.put(1, 3, sArray);
//		for(int n = 1; n <= 3;n++)
//		{
//			System.out.println(string.get(n));
//		}
//		System.out.println("Test with GenericShape Object");
//		GenericShape[] shape_put = new GenericShape[2];
//		shape_put[0] = new GenericShape("Cube","Black");
//		shape_put[1] = new GenericShape("Triangle","White");
//		gShape.put(0,1,shape_put);
//		for(int n = 0; n <= 1;n++)
//		{
//			System.out.println(gShape.get(n).getName());
//		}
		
		/** Test @method  equals(Object e)*/
//		System.out.println("Test with Integer Object that equal");
//		MyArray<Integer> integer_equal = new MyArray<Integer>(3,5,2,7,2,4,3,9);
//		System.out.println(integer.equals(integer_equal));		
//		System.out.println("Test with String Object that NOT equal");
//		MyArray<String> string_notEqual = new MyArray<String>("Dat","Danh","Ba","Lana","Nam");
//		System.out.println(string.equals(string_notEqual));
//		System.out.println("Test with GenericShape Object that NOT equal");
//		MyArray<GenericShape> gShape_notEqual = new MyArray<GenericShape>(shape1,shape3,shape2,shape4);
//		System.out.println(gShape.equals(gShape_notEqual));
		
		/** Test @method  max(), min()*/
//		System.out.println("Integer Max: " + integer.max() + "\nInter Min: " + integer.min());
//		System.out.println("String Max: " + string.max() + "\nStrin gMin: " + string.min());
//		System.out.println("GenericShape Max: " + gShape.max().getName() + "\nGenericShape Min: " + gShape.min().getName());
		
		/** Test @method  reverse(), shuffle()*/
//		System.out.println("Test with Integer Object Reverse");
//		integer.reverse();
//		System.out.println(integer.toString()); // Test toString Method
//		System.out.println("Test with Integer Object Shuffle");
//		integer.shuffle();
//		System.out.println(integer.toString()); // Test toString Method
//		
//		System.out.println("Test with String Object Reverse");
//		string.reverse();
//		System.out.println(string.toString()); // Test toString Method
//		System.out.println("Test with String Object Shuffle");
//		string.shuffle();
//		System.out.println(string.toString()); // Test toString Method
//		
//		System.out.println("Test with GenericShape Object Reverse");
//		gShape.reverse();
//		System.out.println(gShape.toString()); // Test toString Method
//		System.out.println("Test with GenericShape Object Shuffle");
//		gShape.shuffle();
//		System.out.println(gShape.toString()); // Test toString Method
		
		/** Test @method  leftShif(), rightShift()*/
//		System.out.println("Test with Integer");
//		System.out.print("Original: ");
//		System.out.println(integer.toString());
//		System.out.println("Left Shift: 2");
//		integer.leftShift(2);
//		System.out.println(integer.toString());
//		System.out.println("Right Shift: 3");
//		integer.righttShift(3);
//		System.out.println(integer.toString());
//		
//		System.out.println("\nTest with String");
//		System.out.print("Original: ");
//		System.out.println(string.toString());
//		System.out.println("Left Shift: 2");
//		string.leftShift(2);
//		System.out.println(string.toString());
//		System.out.println("Right Shift: 3");
//		string.righttShift(3);
//		System.out.println(string.toString());
//		
//		System.out.println("\nTest with Generic Shape");
//		System.out.print("Original: ");
//		System.out.println(gShape.toString());
//		System.out.println("Left Shift: 2");
//		gShape.leftShift(2);
//		System.out.println(gShape.toString());
//		System.out.println("Right Shift: 3");
//		gShape.righttShift(3);
//		System.out.println(gShape.toString());
		
		/** Test @method  sort()*/
//		System.out.print("Original: ");
//		System.out.println(integer.toString());
//		integer.sort();
//		System.out.print("Sort Integer: ");
//		System.out.println(integer.toString());
//		
//		System.out.print("Original: ");
//		System.out.println(string.toString());
//		string.sort();
//		System.out.print("Sort String: ");
//		System.out.println(string.toString());
//		
//		System.out.print("Original: ");
//		System.out.println(gShape.toString());
//		gShape.sort();
//		System.out.print("Sort Generic Shape: ");
//		System.out.println(gShape.toString());		
	}
}
