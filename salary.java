/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

import java.util.Date;

/**
 *
 * @author HP
 */
public class salary {
    private int sid;
    
    private String Firstname;
    private String lastname;
    private String category;
    private int basicsalary;
    private int attendance;
    private int allowance;
    private int Deduction;
    private int Tot_salary;
    
    public salary(int sid, String First_Name,String LastName,String category,int Basicsalary,int attendance,int allowance,int Deduction,int Tot_salary){
        
        this.sid=sid;
        
        this.Firstname=First_Name;
        this.lastname=LastName;
      
        this.category=category;
        this.basicsalary=Basicsalary;
        this.attendance=attendance;
        this.allowance=allowance;
        
        this.Deduction=Deduction;
        this.Tot_salary=Tot_salary;
        
        
        
    }

    
    public int getSid() {
        return sid;
    }

   
    
    
    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return lastname;
    }

    
   

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    
    public int getBasicsalary() {
        return basicsalary;
    }

    
    public int getAttendance() {
        return attendance;
    }

    
    public int getAllowance() {
        return allowance;
    }

   
    

    
    public int getDeduction() {
        return Deduction;
    }

   
    public int getTot_salary() {
        return Tot_salary;
    }

   
    

}