package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import pessoas.Pessoa;
import pessoas.PessoaFisica;
import pessoas.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Pessoa> employeesList = new ArrayList<>();
		
		System.out.println("Welcome to the Tax Calculator");
		
		char optionMenu = 'Y';
		short item = 1;
		while (optionMenu == 'Y') {
			
			System.out.printf("Enter the information regarding the colaborator #%d\n", item);
			
			//Name
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			//Annual Income
			System.out.print("Annual Income: ");
			Double annualIncome = sc.nextDouble(); 
			sc.nextLine();
			
			//Type
			System.out.print("Press [I]ndividual or [C]ompany: ");
			char ioc = sc.nextLine().charAt(0);
			
			switch (ioc) {
			case ('I'):
				System.out.print("Health expenses: ");
				Double healthExpenses = sc.nextDouble();
				sc.nextLine();
				employeesList.add(new PessoaFisica(name, annualIncome, healthExpenses));
				break;
			case ('C'):
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				sc.nextLine();
				employeesList.add(new PessoaJuridica(name, annualIncome, numberOfEmployees));
				break;
			default:
				System.out.println("Invalid Option... Nothing has been saved...");
				break;
			}
			
			System.out.print("Do you wanna add more colaborators? ([Y] or [N])");
			optionMenu = sc.nextLine().charAt(0);
		}
		
		Double total=0.0;
		for (Pessoa x : employeesList) {
			System.out.printf("The employee "+ x.getName() + " had to pay: %.2f\n", x.totalFee());
			total = total + x.totalFee();
		}
		
		System.out.printf("The total paid in taxes was: %.2f", total);
		
		sc.close();

	}

}
