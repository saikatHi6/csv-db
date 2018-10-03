package org.atom.batch.batch;

import java.util.List;

import org.atom.batch.model.Employee;
import org.atom.batch.repository.EmployeeRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBWriter implements ItemWriter<Employee>{

	   @Autowired
	    private EmployeeRepository employeeRepository;

	    @Override
	    public void write(List<? extends Employee> employee) throws Exception {

	        System.out.println("Data Saved for Users: " + employee);
	        employeeRepository.saveAll(employee);
	    }

}
