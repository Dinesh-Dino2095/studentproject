package studentproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void insert() {
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();

			Studentregistration sr = new Studentregistration();

			sr.setId(2);
			sr.setName("Vijay");
			sr.setAge(22);
			sr.setFatherName("Raju");
			sr.setMarks(60);
			sr.setGrade("B");
			session.save(sr);
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void get() {
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();

			Studentregistration sr = new Studentregistration();

			sr = (Studentregistration) session.get(Studentregistration.class, 1);

			System.out.println(sr.getName());
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void update() {
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();

			Studentregistration sr = new Studentregistration();
			sr.setId(1);
			sr.setName("Dinesh Dino");
			sr.setAge(25);
			sr.setFatherName("Raju");
			sr.setMarks(60);
			sr.setGrade("A");
			session.update(sr);
			System.out.println(sr.getName());
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void delete() {
		try {
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionfactory.openSession();

			Studentregistration sr = new Studentregistration();

			sr.setId(2);
			session.delete(sr);

			System.out.println(sr.getName());
			session.beginTransaction().commit();
			session.close();
			sessionfactory.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Main.get();

	}

}
