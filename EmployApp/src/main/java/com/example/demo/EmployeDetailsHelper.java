package com.example.demo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeDetailsHelper {
	final static Logger logger = Logger.getLogger(EmployeDetailsHelper.class);

	@Autowired
	EmployeeDetailsRepositery empDetailRepositery;
	
	/*private List<Employee> employeeList=new ArrayList<>(Arrays.asList(new Employee("1","kiran",551998722,23000,"guntur"),
            new Employee("2","mine",1234556,200,"Fl"),
            new Employee("3","shine",234454565,24000,"mn"),
            new Employee("4","line",34565723,13000,"ny"),
            new Employee("5","kuma",6745343,3000,"nj")));*/

	@Cacheable(value="EmpDetails",key="#empNo")
	public Employee getEmplDetails(String empNo){
    	 Employee emp= getALLEmplDetails().stream()
			.filter(employee->employee.getEmpNo().equals(empNo))
			.findFirst()
			.orElse(null);
    	 if(emp==null)
    	 throw new EmployeeNotFoundException("Employee details are not fould for employee id - "+empNo);
    	 return emp;
	}

	@Cacheable(value="EmpDetails",key="#employee.empNo")
	public Employee updateEmployeList(Employee employee) {
		System.out.println("The employee details are -"+employee);
		 empDetailRepositery.save(employee);
		 return employee;
	}

	
	@Cacheable(value="allEmpDetails")
	public List<Employee> getALLEmplDetails() {
		return empDetailRepositery.findAll();
	}

}
