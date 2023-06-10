/**
 * author John
 */
public class Student{
  

    String name;
    /**
     * 
     * @param name student name
     */
    Student(String name) {
        this.name=name;
    }
    
   
    
    /**
     * issue id card to student
     * @param regNo enter a registration number
     * @throws Exception if we entered invalid registration number then it throws an exception 
     */
    public void getIDCard(int regNo) throws Exception {

    }
    
    /**
     * 
     * @param str pass the details
     * @return returns scholarship is available or not 
     */
    boolean HasScholarship(String str) {
        return true;
    }
    /**
     * student details
     * @param regNo student registration number
     * @return returns the student name
     */
    
    public String getName(int regNo) {
        return name;

    }

}   
   
    

