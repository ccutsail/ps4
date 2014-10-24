import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class a {

public HashSet<String> iceCream(){
	HashSet<String> flavors = new HashSet<String>();
	flavors.add("Chocolate");
	flavors.add("Strawberry");
	flavors.add("Vanilla");
	return flavors;

}

	
	public static void main(String[] args){
	HashSet<String> seat = new HashSet<String>();

	// Add strings to the set

	Set<String> set = new LinkedHashSet<String>();

	set.add( "London" );

	set.add( "Paris" );

	set.add( "New York" );

	set.add( "San Francisco" );

	set.add( "Beijing" );

	set.add( "New York" );

	 

	System.out.println(set);
	for (String element: set) 
	{ 
	System.out.println(element.toLowerCase()); 
	} 

}

	private static void iceCream() {
		// TODO Auto-generated method stub
		
	}
}