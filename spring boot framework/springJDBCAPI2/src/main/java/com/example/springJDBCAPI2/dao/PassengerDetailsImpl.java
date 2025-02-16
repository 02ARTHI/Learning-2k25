package com.example.springJDBCAPI2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class PassengerDetailsImpl implements IPassengerDetails {

	private static final String SQL_QUERY = "SELECT * FROM passenger";

	List<Passenger> pass;
	
	@Autowired
	private DataSource datasource;
	
	
	
	public PassengerDetailsImpl() {
		super();
		System.out.println("passenger dao bean is created");
	}
	
	@Override
	public List<Passenger> getDetails() {
		
		try {
			Connection connection = datasource.getConnection();
			
			PreparedStatement pstmt = connection.prepareStatement(SQL_QUERY);
			ResultSet rs=  pstmt.executeQuery();
			pass = new ArrayList();
			
			while(rs.next())
			{
				Passenger emp = new Passenger();
				emp.setPid(rs.getInt(1));
				emp.setArrival(rs.getString(2));
				emp.setDateOfJourney(rs.getString(3));
				emp.setName(rs.getString(4));
				emp.setDeparture(rs.getString(4));
				
				pass.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
		
	}

}
