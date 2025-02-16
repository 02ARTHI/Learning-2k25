package com.example.springJDBCAPI2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springJDBCAPI2.dao.PassengerDetailsImpl;

@SpringBootApplication
public class SpringJdbcapi2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringJdbcapi2Application.class, args);
		PassengerDetailsImpl bean = run.getBean(PassengerDetailsImpl.class);
		bean.getDetails().forEach(e->System.out.println(e));
	}

}
