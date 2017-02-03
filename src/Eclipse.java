import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Eclipse {

	
	public static void main(String[] args){
		Eclipse eclipse = new Eclipse();
		eclipse.popUp();
	}
	
	public void popUp(){
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the name of the class or 'q' to quit");
		String className = scan.nextLine();
		try { 
			Class theClass = Class.forName(className);
			Field[] theFields = theClass.getFields();
			for(int i = 0; i< theFields.length; i++){
				System.out.println(theFields[i].getName());
				System.out.println();
			}
			Method[] theMethods = theClass.getMethods();
			for(int i=0; i<theMethods.length; i++){
				System.out.println(theMethods[i].getName());
				System.out.println();
				
			}
			
			
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
}
