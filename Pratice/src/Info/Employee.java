package Info;
import java.util.*;
public class Employee {
  public static void main(String []args) {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Employee Name Here:");
  String empName=sc.next();
  System.out.print("Enter Employee Salary Here:");
 double Salary=sc.nextDouble();
  System.out.print("Enter Employee Experience in Month Here:");
  int Month=sc.nextInt();
  
   
  if(Salary<=50000 && Month>12) {
	 double Finalsalary=Salary+(Salary*0.1);
	
	 System.out.print(Finalsalary);
  }
  else if(Salary>50000 && Month>12){
	 double  Finalsalary=Salary+(Salary*0.15);
	
	  System.out.print(Finalsalary);
  }

  }

}
  
