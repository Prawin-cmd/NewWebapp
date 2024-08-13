package com.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("senior")
public class SeniorEmployee implements Employee {
    public String getMsg() {
    	return "This is Senior";
    }
}
