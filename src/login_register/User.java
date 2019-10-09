/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register;

/**
 *
 * @author camayma_sd2081
 */
class User {
    private String FirstName, MiddleName, LastName, Email, Password, Number;
    
    public User(String FirstName, String MiddleName, String LastName, String Email, String Password, String Number)
    {
        
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
        this.Number = Number;
    }
   
    public String getfname(){
        return FirstName;
    }
    public String getmname(){
        return MiddleName;
    }
    public String getlname(){
        return LastName;
    }
    public String getemail(){
        return Email;
    }
    public String getpassword(){
        return Password;
    }
    public String getnumber(){
        return Number;
    }
    
}
