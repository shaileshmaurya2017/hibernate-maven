package ha;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ha.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("in main");
		
		Configuration config = new Configuration();
		
			config.configure();
			
			SessionFactory sessionFactory = config.buildSessionFactory();
			
			Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();

	        Student stud = new Student();
	        stud.setName("sridhama");
	        stud.setStudentid(5);

	        session.save(stud);
	        
	        // session.byId(Student.class);
	        transaction.commit();
	        //transaction.rollback();
	        session.close();
	}

}
