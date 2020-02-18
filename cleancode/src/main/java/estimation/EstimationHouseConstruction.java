package estimation;
import java.util.*;
public class EstimationHouseConstruction {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter area of house");
		double areaofhouse = sc.nextDouble();
		
		System.out.println("do you want a fully automated home(yes/no)");
		String automatedhome = sc.next().toLowerCase();
		boolean fullyautomatedhome;
		
		if("yes".compareTo(automatedhome) == 0)
			fullyautomatedhome = true;
		else
			fullyautomatedhome = false;
			
		sc.nextLine();
		System.out.println("Enter material standard");
		String materialstandard = sc.nextLine();
		
		double result = ConstructionCostPerSquareFeet.costcalculation(materialstandard,areaofhouse,fullyautomatedhome);
		System.out.println("cost is " + result);
		
		sc.close();
  
	}

}
