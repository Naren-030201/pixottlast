package com.revature.UI;
import java.util.*;

import com.revature.app.App;
public class Mainmenu {
public static void display() {
	System.out.println("PIX ott");
	System.out.println("Main menu");
	System.out.println("1) Signup");
	System.out.println("2) Login");
	System.out.println("3) Exit");
	System.out.println("Select an option:");
	int option =App.scanner.nextInt();
	if(option==1) {
		Signup.display();
	}else if(option==2) {
		Login.display();
	}else if(option==3) {
		
	}
	
}
}
