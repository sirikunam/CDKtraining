
import java.util.Scanner;
class emp{
	private int empno;
	private String empname;
	private double salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

public class Lab3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		emp[] e = new emp[5];
		for(int i=0;i<=5;i++){
			e[i] = new emp();
			e[i].setEmpno(sc.nextInt());
			e[i].setEmpname(sc.next());
			e[i].setSalary(sc.nextDouble());
		}

	}

}