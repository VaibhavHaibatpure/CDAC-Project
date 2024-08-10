package com.demo.beans.request;

public class StudentDTO {
    private Long studentId;
    private String name;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String email;
    private String gender;
    private String profilePic;
    private String admissionDate;
    private Long classId;

    // Getters and Setters
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }



	public Long getClassId() {
		return classId;
	}

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentId=" + studentId + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender=" + gender + ", profilePic="
				+ profilePic + ", admissionDate=" + admissionDate + ", classId=" + classId + "]";
	}
    
}
