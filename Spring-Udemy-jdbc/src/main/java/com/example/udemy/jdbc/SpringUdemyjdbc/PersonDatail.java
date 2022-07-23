package com.example.udemy.jdbc.SpringUdemyjdbc;

import java.util.List;

import org.hibernate.annotations.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

@Repository
//@Entity
public class PersonDatail {
	@Autowired
	JdbcTemplate jdbctemplate;

	public List<Person> findAll() {
		List<Person> list = jdbctemplate.query("Select * from PERSON", new BeanPropertyRowMapper(Person.class));
		// System.out.println("Person list ->"+ list);

		return jdbctemplate.query("Select * from PERSON", new BeanPropertyRowMapper(Person.class));
	}

	public List<Person> findById(int id) {
		List<Person> list = jdbctemplate.query("Select * from PERSON where id=?", new Object[] { id },
				new BeanPropertyRowMapper(Person.class));
		// System.out.println("Person list ->"+ list);

		return list; // jdbctemplate.query("Select * from PERSON where id=?",new Object[] {id},new
						// BeanPropertyRowMapper(Person.class));  
	}

	public int deleteById(int id) {
		int list = jdbctemplate.update(" delete  from PERSON where id=?", new Object[] { id });
		System.out.println("Person list ->" + list);

		return jdbctemplate.update("delete  from PERSON where id=?", new Object[] { id });

		// jdbctemplate.query("Select * from PERSON where id=?",new Object[] {id},new
		// BeanPropertyRowMapper(Person.class));
	}
	public int insertData(Person person) {
		int list = jdbctemplate.update("insert into PERSON (id, name, location, birth_date )"+" values(?,?,?,?)",
				new Object[] {person.getId(),person.getName(),person.getLocation(),person.getBirth_date() });
		
		System.out.println("Person list ->" + list);

		return jdbctemplate.update("insert into PERSON (id, name, location, birth_date )"+" values(?,?,?,?)",
				new Object[] {person.getId(),person.getName(),person.getLocation(),person.getBirth_date() }); //jdbctemplate.update("delete  from PERSON where id=?", new Object[] { id });

		// jdbctemplate.query("Select * from PERSON where id=?",new Object[] {id},new
		// BeanPropertyRowMapper(Person.class));
	}
}
