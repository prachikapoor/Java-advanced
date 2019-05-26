package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import beans.Student;
public class SaveClient {
	
public static void main(String args[])
{
	Configuration cfg=new Configuration();
	cfg.configure("resources/hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction t=session.beginTransaction();
	
	//--------Insertion Logic-----------
//	Student st=new Student();
//		st.setId(104);
//		st.setName("mayur");
//		st.setEmail("Mayur@gmail.com");
//		st.setAddress("Mumbai");
//		session.save(st);
//		System.out.println("Data Inserted Succesfully");

//	------Update Logic--------
//	Student stud=(Student) session.get(Student.class,104);
//	stud.setId(104);
//	stud.setName("Nikhil");
//	stud.setEmail("NIkhil@gmail.com");
//	stud.setAddress("Mumbai");
//	session.update(stud);
//	System.out.println("Data Updated Succesfully");
	
	//------Delete Logic--------
//	Student st=new Student();
//	st.setId(102);
//	session.delete(st);
//	System.out.println("Data Deleted Succesfully");
	
	
	t.commit();
	session.close();
	sf.close();
	
  }

}
