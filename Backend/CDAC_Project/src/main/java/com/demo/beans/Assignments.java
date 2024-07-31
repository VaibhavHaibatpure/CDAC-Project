package com.demo.beans;

import javax.persistence.*;

@Entity
@Table(name = "Assignments")
public class Assignments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignmentId;

    private String assignmentName;
    private String assignmentDate;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subjects subjects;

	public Assignments() {
		super();
	}

	public Assignments(String assignmentName, String assignmentDate, Subjects subjects) {
		super();
		this.assignmentName = assignmentName;
		this.assignmentDate = assignmentDate;
		this.subjects = subjects;
	}

	public Assignments(Long assignmentId, String assignmentName, String assignmentDate, Subjects subjects) {
		super();
		this.assignmentId = assignmentId;
		this.assignmentName = assignmentName;
		this.assignmentDate = assignmentDate;
		this.subjects = subjects;
	}

	public Long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public String getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(String assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Assignments [assignmentId=" + assignmentId + ", assignmentName=" + assignmentName + ", assignmentDate="
				+ assignmentDate + ", subjects=" + subjects + "]";
	}

    
}
