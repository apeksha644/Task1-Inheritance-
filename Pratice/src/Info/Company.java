

package Info;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Company {
	int id;
	String name;
	String desig;
	static ArrayList al = new ArrayList();
	

	Company(){
		
	}

	Company(int id, String name, String desig) {
		this.id = id;
		this.name = name;
		this.desig = desig;
		
	}


	public void putDetails(Company e) {
		al.add(e);
	}



	public Company getDetails(int id) {
		Company es = (Company) al.get(id);
		return es;
	}

	public static void main(String[] args) throws IOException {

		Scanner br=new Scanner(System.in);

		Company e = new Company();
		Company e1 = new Company(1, "Sai", "Project Owner");
		Company e2 = new Company(2, "Anushka", "IT");
		Company e3 = new Company(3, "sayali", "CS");
		Company e4 = new Company(4, "Shilla", "Mech");
		Company e5 = new Company(5, "Madhuri", "IS");
		Company e6 = new Company(6, "Volsha", "CIVIL");

		e.putDetails(e1);
		e.putDetails(e2);
		e.putDetails(e3);
		e.putDetails(e4);
		e.putDetails(e5);
		e.putDetails(e6);

	

		while (true) {
			System.out.println("Enter Company id to get the Company details: ");
			int id = Integer.parseInt(br.nextLine());


			for (int i = 0; i <= 10; i++) {
				Company es = e1.getDetails(i);
				if (id == es.id) {
					System.out.println("The details of the Company with id " + id + " is: ");
					System.out.print(es.id + " " + es.name + " " + es.desig);				
					
				}
			}

			System.out.println(" ");


		}
	}
}