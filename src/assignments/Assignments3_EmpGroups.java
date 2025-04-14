package assignments;

public class Assignments3_EmpGroups extends Assignment3_Employees {

	public static void main(String[] args) {
		
		Assignment3_Employees obj=new Assignment3_Employees();
		
		String[] employeeNames= new String[3];
		int[] employeeIds= new int[3];
		
		employeeNames[0]=obj.employeeNames[0];
		employeeNames[1]=obj.employeeNames[1];
		employeeNames[2]=obj.employeeNames[2];
		
		for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Employee Name: " + employeeNames[i]);
        }
		
		employeeIds[0]=obj.employeeIds[0];
		employeeIds[1]=obj.employeeIds[1];
		employeeIds[2]=obj.employeeIds[2];
		
		for (int i = 0; i < employeeIds.length; i++) {
            System.out.println("Employee ID: " + employeeIds[i]);
        }	
	}

}
