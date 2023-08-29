package dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;

public class Studentdao {
//	EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
//	EntityManager m = e.createEntityManager();
//	EntityTransaction t = m.getTransaction();

	EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
	EntityManager m = e.createEntityManager();
	EntityTransaction t = m.getTransaction();
	Scanner sc = new Scanner(System.in);

	Student std = new Student();

	public void insert() {
		System.out.println("enter the name");
		String name = sc.next();
		std.setName(name);
		System.out.println("enter the age:");
		int age = sc.nextInt();

		std.setAge(age);
		System.out.println("enter the mobile number");
		int phoneNo = sc.nextInt();
		std.setPhoneNo(phoneNo);

		t.begin();
		m.persist(std);
		t.commit();

	}

	public void update() {
		System.out.println("enter the id to update");
		int id = sc.nextInt();
		Student xy = m.find(Student.class, id);
		System.out.println("enter the new name");
		String s = sc.next();
		xy.setName(s);
		t.begin();
		m.merge(xy);
		t.commit();
		System.out.println("success");

	}

	public void delete() {
		System.out.println("enter the id to delet ethe date");
		int id = sc.nextInt();
		Student std = m.find(Student.class, id);
		t.begin();
		m.remove(std);

		t.commit();

	}

	public void fetch() {
		System.out.println("enter the id to fetch the data");
		int id = sc.nextInt();
		Student std = m.find(Student.class, id);
		System.out.println("Age:" + std.getAge());
		System.out.println("ID" + std.getId());
		System.out.println("NAme:" + std.getName());

	}

}
