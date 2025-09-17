package com.springcore;

import java.util.List;
import java.util.Map;

public class Courses {
	
	Map<String, String> courseMap;
	
	public Courses() {

	}

	public Courses(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
	
	
    public Map<String, String> getCourseMap() {
        return courseMap;
    }
	    public void setCourseMap(Map<String, String> courseMap) {
        this.courseMap = courseMap;
    }

}
