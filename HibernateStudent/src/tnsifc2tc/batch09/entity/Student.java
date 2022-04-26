package tnsifc2tc.batch09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	    private int id;
		private String name;
		private String college;
		private int roll;
		private String qualification;
		private String course;
		private int year;
		private String certificate;
		private int hall_ticket_no;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public int getRoll() {
			return roll;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getCertificate() {
			return certificate;
		}
		public void setCertificate(String certificate) {
			this.certificate = certificate;
		}
		public int getHall_ticket_no() {
			return hall_ticket_no;
		}
		public void setHall_ticket_no(int hall_ticket_no) {
			this.hall_ticket_no = hall_ticket_no;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", college=" + college + ", roll=" + roll
					+ ", qualification=" + qualification + ", course=" + course + ", year=" + year + ", certificate="
					+ certificate + ", hall_ticket_no=" + hall_ticket_no + "]";
		}

		
		
}

