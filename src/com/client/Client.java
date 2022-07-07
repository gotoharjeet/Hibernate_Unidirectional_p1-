package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.mvc.dto.Airport;
import com.hibernate.mvc.dto.Flight;

public class Client {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();

		
		Airport dep_airport = new Airport();
		dep_airport.setName("Indira Gandhi Airport");
		dep_airport.setAddress("Palam");
		
		Airport arr_airport=new Airport();
		arr_airport.setName("Shri Guru Gobind Singh Ji Airport");
		arr_airport.setAddress("Nanded");
		
		Flight flight = new Flight();
		flight.setDeparture(dep_airport);
		flight.setArrival(arr_airport);
		flight.setDurationInMinutes(150);
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();

		session.save(dep_airport);
		session.save(arr_airport);
		session.save(flight);		//session.save(arr_airport);
		
		txn.commit();
		factory.close();
		session.close();
	}

}
