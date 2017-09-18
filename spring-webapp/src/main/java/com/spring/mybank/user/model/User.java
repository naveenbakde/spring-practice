package com.spring.mybank.user.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String user_id;
	private String first_name;
	private String last_name;
	private String user_name;
	private String password;
	private Date date_of_birth;
	private String company;

}
