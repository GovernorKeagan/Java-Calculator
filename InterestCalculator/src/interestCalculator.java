import java.util.Scanner;


public class interestCalculator {

	public static void main(String[] args) {
		String text = null;
		Scanner choice = new Scanner(System.in);
		
		//Declaring variables
		 double initAmount;
		 double perc;
		 double noYears;
		
		//This calculator will tell you how much interest you will earn over a given period of time
		System.out.println("Welcome to the interest callculator.");
		System.out.println("Pleas choose either Simple interest or Compund interest. Only type simple or compund.");
		System.out.println(" ");
		
		text = choice.nextLine();
		
		
		switch (text)
		{
		//Simple interest calculated yearly
		case ("simple"):
			System.out.println("Yoou chose simple interest.");
			System.out.println(" ");
			
			//Initial amount to start with
			Scanner inputSim = new Scanner(System.in);
			System.out.println("What is your starting amount of money?");
			System.out.println(" ");
			initAmount = inputSim.nextDouble();
			
			//Interest percentage
			System.out.println("What is your interest percentage?");
			System.out.println(" ");
			perc = inputSim.nextDouble();
			
			//Number of years for interest
			System.out.println("How many years will you be receving interest?");
			System.out.println(" ");
			noYears = inputSim.nextDouble();
			
			//Calculation
			System.out.println("You will have: " + (initAmount * (1 + perc / 100 * noYears)));
			
			break;
			
		//Compound interest calculated yearly
		case ("compound"):
			System.out.println("You chose compund interest.");
			//Initial amount to start with
			Scanner inputCom = new Scanner(System.in);
			System.out.println("What is your starting amount of money?");
			System.out.println(" ");
			initAmount = inputCom.nextDouble();
		
			//Interest percentage
			System.out.println("What is your interest percentage?");
			System.out.println(" ");
			perc = inputCom.nextDouble();
			
			//Number of years for interest
			System.out.println("How many years will you be receving interest?");
			System.out.println(" ");
			noYears = inputCom.nextDouble();
		
			//Calculation
			System.out.println("You will have: " + ((initAmount * Math.pow((1 + perc / 100), noYears))));
		
			break;
		default:
			System.out.println("Invaild command. Please check spelling, and/or punctuation.");
			return;
		}
		
	}

}
