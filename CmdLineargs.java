import java.io.*;
public class CmdLineargs extends Object 
// Object is the superclass of all classes in java 
 {
  	public static void main(String args[])
      { 
        if(args.length!=2)
        {
            System.out.println("You have to enter two integers");
        }
        else
           {
            
     	int x = Integer.parseInt(args[0]);
     	int y = Integer.parseInt(args[1]);
     	int z = x + y;
     	System.out.println("Sum of "+x+ " and "+y+ " is" +z);
           }
        }
}
