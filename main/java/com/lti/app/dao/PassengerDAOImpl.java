package com.lti.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Passenger;

@Repository
public class PassengerDAOImpl implements PassengerDAO{

	@Autowired
	EntityManager eMan;
	
	@Override
	public boolean addUser(Passenger passenger) {
		// TODO Auto-generated method stub
		eMan.persist(passenger);
		return true;
	}

	@Override
	public List<Passenger> getUser() {
		// TODO Auto-generated method stub
		return eMan.createQuery("from Passenger").getResultList();
	}

	@Override
	public boolean updateUser(Passenger passenger) {
		// TODO Auto-generated method stub
		eMan.merge(passenger);
		return true;
	}

	@Override
	public Passenger findUser(long passengerId) {
		// TODO Auto-generated method stub
		Passenger obj=eMan.find(Passenger.class, passengerId);
		return obj;
	}

	@Override
	
	public boolean validateLogin(String title, String userName, String password) {
		System.out.println(userName);
		Query qry2= eMan.createQuery("from Passenger r where r.title=?1 and r.userName=?2 and r.password=?3");
		qry2.setParameter(1, title);
		qry2.setParameter(2, userName);
		qry2.setParameter(3, password);
		List<Passenger> r2=qry2.getResultList();
//			r2.getPassengerId
		if(r2.size()>0)
			return true;
		
		else 
			return false;
	
			
		
	}
	@Override
	public Passenger findId(String userName) {
		Passenger temp=null;
		
		Query qry3= eMan.createQuery("select e from Passenger e where e.userName= ?1");
		qry3.setParameter(1,userName);
		temp = (Passenger) qry3.getSingleResult();
		temp.getPassengerId(); 
		System.out.println(temp.getPassengerId());
		return temp;
	}

}
