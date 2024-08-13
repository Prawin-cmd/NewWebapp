package com.Annotation;

import org.springframework.stereotype.Component;

@Component("junior")
public class juniorEmployee implements Employee {
    public String getMsg() {
    	return "This is Junior";
    }
}
