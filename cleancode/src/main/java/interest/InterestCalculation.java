package interest;
import java.util.*;

public class InterestCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("choose one option");
		System.out.println("1.Simple Interest");
		System.out.println("2.Compound Interest");
		System.out.println("choose ur option");
		switch(sc.nextInt()) 
		{
			case 1:
				System.out.println("Enter principal amount");
				double principal=sc.nextDouble();
				System.out.println("Enter rate of interest");
				double rateOfInterest = sc.nextDouble();
				System.out.println("Enter time ");
				int time = sc.nextInt();
				double result1 =SimpleInterest.calculation1(principal, time, rateOfInterest);
				System.out.println("simple interest is "+result1);
				break;
				
			case 2:
				System.out.println("Enter principal amount");
				double compoundPrincipal = sc.nextDouble();
				System.out.println("Enter rate of interest");
				double compoundRateOfInterest = sc.nextDouble()/100.0;
				System.out.println("no.of years deposited");
				double compoundNoOfYearsDeposited = sc.nextDouble();
				System.out.println("compounded times");
				int compoundedTimes = sc.nextInt();
				double result2 =CompoundInterest.calculation2(compoundPrincipal,compoundRateOfInterest,compoundNoOfYearsDeposited,compoundedTimes);
				System.out.println("compound interest is " + result2);
				break;
				
			default:System.out.println("enter correct option");
					break;
			
		}
		
		
		sc.close();

	}

}
