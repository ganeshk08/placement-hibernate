package tnsifc2tc.batch009;

import tnsifc2tc.batch09.entity.Student;
import tnsifc2tc.batch09.service.StudentService;
import tnsifc2tc.batch09.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		Student student = new Student();
		StudentService ss = new StudentServiceImpl();
		student.setId(3894);
		student.setName("ganesh");
		student.setCollege("TERNA COLLRGE");
		student.setRoll(62);
		student.setYear(2021);
		student.setCourse("EXTC");
		student.setCertificate("JAVA DEvLOPER");
		student.setHall_ticket_no(8081);
		student.setQualification("BE");

		ss.addStudent(student);
//		ss.updateStudent(student);
//		ss.deleteById(3894);
//		System.out.println(ss.deleteById(3894));
//		System.out.println(ss.searchStudentById(027));

	}

}
