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
public class StudentUser {
    private int _Id;
    private String _Name;
    private String _LastName;
    private String _UserName;
    private String _Email;
    private String _Password;
    private int _Permision;
    private String _StudentId;
    private String _ProgrammeOsStudy;
    private String _ClassEnrolled;
    private int _AdmisionDate;
     
    
    
    public StudentUser(int Id, String Name, String LastName, String UserName,String Email, String Password, int Permision,String StudentId,String ProgrammeOsStudy,String ClassEnrolled,int AdmisionDate) {
        
        setId(Id);
        setName(Name);
        setLastName(LastName);
        setUserName(UserName);
        setEmail(Email);
        setPassword(Password);
        setPermision(Permision);
        setStudentId(StudentId);
        setProgrammeOsStudy(ProgrammeOsStudy);
        setClassEnrolled(ClassEnrolled);
        setAdmisionDate(AdmisionDate);
        
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
      private void setStudentId(String studentId) {
         this._StudentId=studentId;
    }

    private void setProgrammeOsStudy(String programmeOsStudy) {
        this._ProgrammeOsStudy=programmeOsStudy;
    }

    private void setClassEnrolled(String classEnrolled) {
        this._ClassEnrolled=classEnrolled;
    } 
    private void setAdmisionDate(int admisionDate) {
        this._AdmisionDate=admisionDate;
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
    public String getStudentId() {
        return this._StudentId; 
    }

    public String getProgrammeOsStudy() {
        return this._ProgrammeOsStudy; 
    }

    public String getClassEnrolled() {
        return this._ClassEnrolled; 
    }

    public int getAdmisionDate() {
        return this._Permision; 
    }
   

  
}
