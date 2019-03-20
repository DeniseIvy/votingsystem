/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolei
 */
public class AccountsDB {
    
    String name, idnumber, username, password;
   
    
    public AccountsDB(String dbname, String dbidnum, String dbusername, String dbpassword){
        this.name = dbname;
        this.idnumber = dbidnum;
        this.username = dbusername;
        this.password = dbpassword;
    }

    public String getName() {
        return name;
    }
    
    public String getIdnum() {
        return idnumber;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    
}
