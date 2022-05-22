package week3CodingAssignment;

public class weekThreeCodingAssignmentG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print out for question 7.
		
		System.out.println("Answer for question 7: ");
		
		 String word = "Learn to code ";
		    int w = 4;
		    String concatenateWord = concatenateWords(word, w);
		    System.out.println(concatenateWord);
		    
		//print out for question 8.
		    
		    System.out.println("Answer for question 8: ");    
		    
		String firstName = "Logan";
		String lastName = "Warwick";
		String fullName = createFullName ( firstName, lastName);
		
		System.out.println(fullName );
		
		// print out for question 9.
		
		System.out.println("Answer for question 9: ");
		
		int[] numbers = {32 , 7 , 5 , 56 , 1};
		
		System.out.println(sumArray(numbers));
		
		//print out for question 10.
		
		System.out.println("Answer for question 10: ");
		
		double[] averageThis = {45.7, 22.2 , 4.79 , 33};
		
		System.out.println(calculateAverage(averageThis));
		
		//print out for question 11.
		
		System.out.println("Answer for question 11: ");
		
		double[] doubleTwo = {67.9 , 55.4 , 23.8 , 1.1 };
		
		System.out.println(averageOfTwo(averageThis, doubleTwo));
		
		//printout for question 12.
		
		System.out.println("Answer for question 12: ");
		
		boolean isHotOutside = true;
		double moneyinpocket = 10.60;
		
		System.out.println(willBuyDrink(isHotOutside, moneyinpocket));
		
		//print out for question 13.
		
		System.out.println("Answer for self made question 13: ");
		
		boolean finishedVideos = true;
		boolean finishedProjects = true;
		double grade = 99.9;
		
		System.out.println(areYouReady(finishedVideos, finishedProjects, grade));
		
	//1.1.	Create an array of int called ages that contains the following values:
		//3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = new int[8];
		
		ages [0] = 3;
		ages [1] = 9;
		ages [2] = 23;
		ages [3] = 64;
		ages [4] = 2;
		ages [5] = 8;
		ages [6] = 28;
		ages [7] = 37;
		
	//a.	Programmatically subtract the value of the first element in the array from the 
		//value in the last element of the array (i.e. do not use ages[7] in your code).
		//Print the result to the console.	
		
		System.out.println("Answer for question 1.a: ");

		System.out.println(ages[0] - (ages[ages.length-1]));
		
	//	b.	Add a new age to your array and repeat the step above to ensure it is dynamic 
		//(works for arrays of different lengths).
		
			//added ages [7] = 37; program, still prints out the correct answer.		
		
	//c.	Use a loop to iterate through the array and calculate the average age.
		//Print the result to the console.
		
		System.out.println("Answer for question 1.c: ");
		
		int average = 0;
		
		for (int i : ages) {
			average += i;
			}
		
		average = average / ages.length;
	
		System.out.println("The average age is: " + average);
		
		
	//	2.	Create an array of String called names that contains the following values:
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
	//a.	Use a loop to iterate through the array and calculate the average number of letters 
		//per name. Print the result to the console.
		
		System.out.println("Answer for question 2.a: ");
		
		int total = 0;
		for (int i = 0; i < names.length; i++) {
			total += names[i].length();
			 
		}
		total = (total /names.length);
		
		System.out.println("The average letters per name is: " + total);
		
		
	//	b.	Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
		
		System.out.println("Answer for question 2.b: ");
		
		for(int i =0; i< names.length;i++)            //iterate through every array element
            System.out.print(names[i] + " ");
		
	//	3.	How do you access the last element of any array?
		
		System.out.println();// for blank line
		System.out.println("Answer for question 3: ");
		System.out.println("The last element in the array is: " + names[names.length-1]);
		
		
	// 4. How do you access the first element of an array?
		
		System.out.println("Answer for question 4: ");
		
		System.out.println("The first element is: " + names[0]); //first element will always be 0.
		
		
	//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously
		//created names array and add the length of each name to the nameLengths array
		
		int[] nameLengths = new int [names.length];
		for (int i=0; i< names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
	//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all
		//the elements in the array. Print the result to the console
		
		System.out.println("Answer for question 6: ");
		
		int sum = 0;
		
		for (int i : nameLengths) {
			sum += i;
			}
		
		System.out.println("The sum of array nameLengths is: "+ sum);
	
	//	7.	Write a method that takes a String, word, and an int, n, as arguments and returns 
		//the word concatenated to itself n number of times.
		//(i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	
	} // << now below the main method.	
		
	 public static String concatenateWords(String word, int w) {

		    String concatenateWords = "";
		    if(w < 1) {
		      return "This is not valid";
		    }
		    else {      
		    for(int i = 0; i < w; i++) {
		      concatenateWords += word;
		    }
		    return concatenateWords;
		    }
		    
		  }
	

//	 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 //(the full name should be the first and the last name as a String separated by a space).
	 
	 public static String createFullName (String firstName, String lastName) {
				return firstName + " "+ lastName;
			}
	 
//  9.	Write a method that takes an array of int and returns true if the sum of all the ints
	 //in the array is greater than 100.
	 
	 public static int sumArray (int[]numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			if (sum >= 100) {
				System.out.println(true);
			}
			return sum;
		} 
	 
//  10.	Write a method that takes an array of double and returns the average of all the elements
	 //in the array.	 
	 
	 public static double calculateAverage (double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
				}
			
			return sum/ numbers.length;
			
		}
	 
// 11.	Write a method that takes two arrays of double and returns true 
	 //if the average of the elements in the first array is greater than
	 //the average of the elements in the second array.	 
	 
	 public static boolean averageOfTwo(double[] arrayOne, double[] arrayTwo) {
		 double tot1 = 0;
		 double tot2 = 0;
		    	for(int i = 0; i < arrayOne.length; i++) {
		      tot1 += arrayOne[i];
		    }
		    	for(int i = 0; i < arrayTwo.length; i++) {
		      tot2 += arrayTwo[i];
		    }
		    return (tot1 > tot2); //has to return a true or false.
		  }

//12.	Write a method called willBuyDrink that takes a boolean isHotOutside,
	 //and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket
	 //is greater than 10.50.
	 
	 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
		 return (moneyInPocket > 10.50 && isHotOutside == true);
	    
	 }
	 
	 
// 13.	Create a method of your own that solves a problem.
	 //In comments, write what the method does and why you created it.
	 
//create a method to tell if a student is ready to move onto next weeks videos and homework
	 
	 public static boolean areYouReady (boolean finishedVideos, boolean finishedProjects, double grade) {
		 return (finishedProjects == true && finishedVideos == true && grade >= 80);
	 }


}
