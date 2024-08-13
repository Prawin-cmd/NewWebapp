package com.Annotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Annotation.Employee;

@RestController
public class EmployeeController {
    @Qualifier("junior")
	@Autowired
   Employee e;
   
   @GetMapping(value="/getEmployee")
   public String getEmp() {
	   return e.getMsg();
   }
}
