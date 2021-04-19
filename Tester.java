package javademo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester {


	public static void main(String args[]) {

		EmployeeDAO empDAO = new EmployeeDAO();
		Map<Integer,List<Employee>> eTemp = new HashMap<>();

		String temp = EmployeeDAO.eList.stream().map(e -> e.getName()).collect(Collectors.joining("-"));

		System.out.println(temp);
		
	}

}
