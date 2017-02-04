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
				System.out.print(theFields[i].getName()+ " : ");
				System.out.print(theFields[i].getType()+ " - ");
				System.out.print(theFields[i].getDeclaringClass());
				System.out.println();
			}
			Method[] theMethods = theClass.getMethods();
			for(int i=0; i<theMethods.length; i++){
				System.out.print(theMethods[i].getName()+ " ");
				Class<?>[] parameterTypes = theMethods[i].getParameterTypes();
				for (int j =0; j <  parameterTypes.length; j++){
					System.out.print("(" + parameterTypes[j]+ ") ");
				}
				System.out.print(": " + theMethods[i].getReturnType());
				System.out.print(" - " + theMethods[i].getDeclaringClass());
				System.out.println();
				
			}
			
			
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
}
