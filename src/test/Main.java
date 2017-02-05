package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Address;
import bean.RecordDetails;
import bean.Records;
import bean.User;


public class Main {

	public static void main(String[] args) {
		
		User u1=new User("subham","password");
		Address address1=new Address("21 bak","Dyuuyyh"	, "WB", "India","746733");
		RecordDetails rd1=new RecordDetails("Criminal","Murder");
		Records r1=new Records("12334ASG","Daya","9876544336",address1,rd1);
		
		Configuration configuration=new Configuration().configure();
		 SessionFactory sf=configuration.buildSessionFactory();
		 Session session=sf.openSession();
		 Transaction tx;
		 tx=session.beginTransaction();
		 session.save(u1);
		 session.save(r1);
		 

	
		 tx.commit();
		 session.clear();

		 session.close();
	
		 sf.close();
		
		
		

	}

}
