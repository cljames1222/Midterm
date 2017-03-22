package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
public UUID SectionID;
public UUID StudentID;
public UUID EnrollmentID;
public double Grade;

private Enrollment(){

}

private Enrollment(UUID STID, UUID SEID) {
	this.SectionID = STID;
	this.StudentID = SEID;
	this.EnrollmentID = null ;
	
}
public void SetGrade(double Grade){
	this.Grade =Grade;
	
}
}
