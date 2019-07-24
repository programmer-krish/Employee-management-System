/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

/**
 *
 * @author HP
 */
public class leave {
     
    private String leaveid;
    private  int id;
    private String Firstname;
    private String Lastname;
    
    
    public leave(String Leaveid,int id,String FNAME,String LNAME){
        
        
        this.leaveid=Leaveid;
        this.id=id;
        this.Firstname=FNAME;
        this.Lastname=LNAME;        
        
        
    }

    
    public String getLeaveid() {
        return leaveid;
    }

    
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return Firstname;
    }

    
    public String getLastname() {
        return Lastname;
    }
    
           
           
           
}
