package com.revature.UI;

import java.util.ArrayList;
import java.util.List;

import com.revature.Admin.AdminMenu;
import com.revature.Moviedao.userLoginDao;
import com.revature.SQL.LoginDetails;
import com.revature.app.App;

public class Login {
public static void display() {
	System.out.println("Login");
	System.out.println("===");
	System.out.println("Mobile:");
	int mobile = App.scanner.nextInt();
	System.out.println("Password:");
	String password= App.scanner.next();
	String admin="pass";
	LoginDetails login = new LoginDetails();
	boolean user = login.check(mobile, password);
	if(mobile==9&&password.equals(admin)) {
		AdminMenu.display();
	}
	else if(user) {
		System.out.println("login successful");
	}
	else {
    System.out.println("invalid");
	}
	}
}
