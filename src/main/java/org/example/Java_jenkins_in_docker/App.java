package org.example.Java_jenkins_in_docker;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean checkIfInputIsAnEvenNumber(int number){
			return number % 2 == 0;
			}
	
    public static void main( String[] args )
    {
        System.out.println(checkIfInputIsAnEvenNumber(122));
     // Testing in the main method
    }
}
