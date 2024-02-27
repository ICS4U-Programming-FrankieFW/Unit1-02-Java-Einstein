/**
* This program is used to find the result for the Einsteins  eqaution  
*
* @author Frankie Fox
* @version 1.0
* @since   2024-27-02
*/
import java.util.*;

public class Einstein {
    public static void main(String[] args) {

        final double SPEED_OF_LIGHT = 299792458;
        double massInput;
        double einsteinEquation;

        try {

            Scanner sc = new Scanner(System.in);
            //This print out to the user to input a mass 
            System.out.print(" Please enter your mass (Kg) : ");
            //Turns massInput into a double 
            massInput = sc.nextDouble();
            //This checks if the user input is 0 or a negative
            if (massInput <= 0)
            {
                //This prints out Please enter a positive number
                System.out.println("Please enter a positive number.");
            }
            else
            {
                
                //This is the code that solves Einstein's equation
                einsteinEquation = massInput * (Math.pow(SPEED_OF_LIGHT, 2));
                //This uses massInput and adds kg of mass would produce 
                System.out.print(massInput + "kg of mass would produce ");
                //This round it to 3 decimal places 
                System.out.format("%.3f", einsteinEquation);
                //This prints out the joules of energy used 
                System.out.println("J of energy. ");


            }
        } catch (Exception e) {
            //This prints error when it is given a string
            System.out.println("Error: Invalid input entered.");

        }
    } 
} 
