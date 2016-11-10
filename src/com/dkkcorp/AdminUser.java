/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkkcorp;


/**
 *
 * @author kapanga_david_wa_kap
 */
public class AdminUser {
    private int _Id;
    private String _Name;
    private String _LastName;
    private String _UserName;
    private String _Email;
    private String _Password;
    private int _Permision;
     
    
    
    public AdminUser(int Id, String Name, String LastName, String UserName,String Email, String Password, int Permision) {
        
        setId(Id);
        setName(Name);
        setLastName(LastName);
        setUserName(UserName);
        setEmail(Email);
        setPassword(Password);
        setPermision(Permision);
    
}

    public void setId(int id) {
        this._Id=id;
    }

    public void setName(String name) {
        this._Name=name;
    }

    public void setLastName(String lastname) {
        this._LastName=lastname;
    }

    public void setUserName(String username) {
        this._UserName=username;
    }

    public void setEmail(String email) {
        this._Email=email;
    }

    public void setPassword(String  password) {
        this._Password=password;
    }

    public void setPermision(int permision) {
        this._Permision=permision;
    }
    
    public int getId() {
        
         return this._Id; 
    }
     
    public String getName() {
        return this._Name; 
    }

    public String getLastName() {
        return this._LastName; 
    }

    public String getUserName() {
        return this._UserName; 
    }

    public String getEmail() {
        return this._Email; 
    }

    public String getPassword() {
        return this._Password; 
    }

    public int getPermision() {
        return this._Permision; 
    }
}
