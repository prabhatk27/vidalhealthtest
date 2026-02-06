package com.cdac.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.model.QualifierController;
import com.cdac.model.QualifierModel;

@Repository
@Transactional
public class  QualifierDao {
	
	@Autowired
	private DataSource datasource;
	
	public void employee(QualifierModel q) throws SQLException {
		Connection con=null;
		PreparedStatement pmt=null;
		
		con=datasource.getConnection();
		
		String qy="insert into employee(name,regNo,email) values(?,?,?)";
		pmt=con.prepareStatement(qy);
		
		pmt.setString(1, q.getName());
		pmt.setString(2, q.getRegNo());
		pmt.setString(3,q.getEmail() );
		
		pmt.executeUpdate();
	}
	

}
