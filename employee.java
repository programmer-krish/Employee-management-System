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
public class employee {
    
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private Date dob; 
    private int mobile;
    private String email;
    private String category;
    
    
    public employee(int id,String FirstName,String LastName,String Address,Date DOB,int Mobile,String Email,String category){
        // Constructor
        
        this.id=id;
        this.firstname=FirstName;
        this.lastname=LastName;
        this.address=Address;
        this.dob=DOB;
        this.mobile=Mobile;
        this.email=Email;
        this.category=category;
        
        
        
        
    }

   
    public int getId() {
        return id;
    }

    
   
    public String getFirstname() {
        return firstname;
    }

    

   
    public String getLastname() {
        return lastname;
    }

    

    public String getAddress() {
        return address;
    }

    

    public Date getDob() {
        return dob;
    }

    

    
    public int getMobile() {
        return mobile;
    }

   

   
    public String getEmail() {
        return email;
    }

    

    
    public String getCategory() {
        return category;
    }

    
    
    
    
    
}
