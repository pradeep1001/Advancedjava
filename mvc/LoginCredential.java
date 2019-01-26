// simple java class not a servlet .
package controller;

public class LoginCredential {  
private String username,password;  
  
public String getUsername() {  
    return username;  
}  
public void setUsername(String username) {  
    this.username = username;  
}  
public String getPassword() {  
    return password;  
}  
public void setPassword(String password) {  
    this.password = password;  
}  
 /*public boolean validate(){  
    if(password.equals("admin")){  
        return true;  
    }  
    else{  
        return false;  
    }  
} */
public boolean loginCheck() {
	if(username.equals("niit"))
	{
		return true;
	}
	else 
	{
		return false;
	}
	
}

}  