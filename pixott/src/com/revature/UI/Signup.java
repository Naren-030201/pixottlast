package com.revature.UI;

import java.util.List;

import com.revature.Moviedao.userLoginDao;
import com.revature.SQL.SignupDetails;
import com.revature.app.App;

public class Signup {
public static void display() {
	System.out.println("Signup");
	System.out.println("===");
	System.out.println("Mobile:");
	int mobile = App.scanner.nextInt();
	System.out.println("password:");
	String password = App.scanner.next();
	SignupDetails signup = new SignupDetails();
	List<userLoginDao> details = signup.signup(mobile, password);
	System.out.println("Signup successfull");
}
}
