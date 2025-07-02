package Assignment_1;

public class EmployeeDemo {
	//1
	 public Employee findEmployeeById(Employee e[],int empId) {
		 Employee ep=null;
		 for(int i=0;i<e.length;i++) {
			 if(e[i].getEmpId()==empId) {
				 ep=e[i];
			 }
		 }
		 return ep; 
	 }
	 //2
	 public double getUpdateSalary(Employee e[],Employee emp,double value) {
		 for (int i=0;i<e.length;i++) {
			 if(emp==e[i]) {
				 emp.setSalary(value);
			 }
		 }
//		 System.out.println("updated salary");
//		 System.out.println(emp.getSalary());
		 return emp.getSalary();
	 }
	 //3
	 public double getDeductSalary(Employee e[],Employee emp,double value) {
		 for (int i=0;i<e.length;i++) {
			 if(emp==e[i]) {
				 emp.setSalary(emp.getSalary()-value);
			 }
		 }
		 return emp.getSalary();
	 }
	 //4
	 public int getAverageAge(Employee e[]) {
		 int age=0;
		 for(int i=0;i<e.length;i++) {
			 age=age+e[i].getAge();
		 }
		 int avga=age/e.length;
		 return avga;
	 }
	 //5
	 public int getAverageAgeOfMaleEmployee(Employee e[]) {
		 int age=0,count=0;
		 for(int i=0;i<e.length;i++) {
			 if(e[i].getName().startsWith("Mr.")) {
			 age=age+e[i].getAge();
			 count++;
			 }
		 }
		 return (age/count);
	 }
	 //6
	 public Employee findMaxSalaryOfAnEmployee(Employee e[]) {
		 double max=e[0].getSalary();
		 Employee ep=e[0];
		 for(int i=0;i<e.length;i++) {
			 if(e[i].getSalary()>max) {
				 max=e[i].getSalary();
				 ep=e[i];
			 }
		 }
		return ep;
	 }
	 //7
	 public Employee findMinSalaryOfAnEmployee(Employee e[]) {
		 double min=e[0].getSalary();
		 Employee ep=e[0];
		 for(int i=0;i<e.length;i++) {
			 if(e[i].getSalary()<min) {
				 min=e[i].getSalary();
				 ep=e[i];
			 }
		 }
		return ep; 
	 }
	 //8
	 public Employee[] sortEmployeeBasedOnAge(Employee e[]) {
		 for(int i=0;i<e.length-1;i++) {
				for(int j=0;j<e.length-i-1;j++) {
					if(e[j].getAge()>e[j+1].getAge()) {
						Employee emp=e[j];
						e[j]=e[j+1];
						e[j+1]=emp;
					}
				}
		 }
	 return e;
	 }
	 //9
	public Employee[] searchEmployeeWithDesignation(Employee e[],String des) {
		int count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getDesignation().equals(des)) {
				count++;
			}
		}
		Employee emp[]=new Employee[count];
			for(int i=0,j=0;i<e.length;i++) {
				if(e[i].getDesignation().equals(des)) {
					emp[j]=e[i];
					j++;
				}
			}
		return emp;
	}
	//10
	public Employee[] getDetailsOfAnEmployee(Employee e[]) {
		int count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getSalary()>25000 && e[i].isPermanentEmployee()==true) {
				count++;
			}
		}
		Employee emp[]=new Employee[count];
			for(int i=0,j=0;i<e.length;i++) {
				if(e[i].getSalary()>25000 && e[i].isPermanentEmployee()==true) {
					emp[j]=e[i];
					j++;
				}
			}
	return emp;
	}
	//11
	public Employee[] searchEmployeeWithDesignationSortById(Employee e[],String des) {
		Employee emp[]=searchEmployeeWithDesignation(e, des);
		for(int i=0;i<emp.length-1;i++) {
			for(int j=0;j<emp.length-i-1;j++) {
				if(emp[j].getEmpId()>emp[j+1].getEmpId()) {
					Employee ep=emp[j];
					emp[j]=emp[j+1];
					emp[j+1]=ep;
				}
			}
		}
		return emp;
	}
	//12
	public static Employee[] findEmployeeMorethanAvgAge(Employee[] e) {
		EmployeeDemo Ed=new EmployeeDemo();
		int avg_age=Ed.getAverageAge(e);
		int count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getAge()>avg_age) {
				count++;
			}
		}
		Employee emp[]=new Employee[count];
		for(int i=0,j=0;i<e.length;i++){
				if(e[i].getAge()>avg_age) {
					emp[j]=e[i];
					j++;
				}
		}
		return emp;
	}
}			
