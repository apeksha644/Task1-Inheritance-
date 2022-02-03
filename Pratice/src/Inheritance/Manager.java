package Inheritance;




public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Director d1=new Director();

		d1.print();
		d1.empName="abc";
		d1.empId="abc1234";
		d1.empSalary=1000;
		System.out.println(" "+d1);
		//d1.display();

	}

}
