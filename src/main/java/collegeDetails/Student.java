package collegeDetails;
/**
 *
 * @author I330152
 */
public class Student {
    
    private String name,userName,dob;
    private int age,id;
    
    public Student(String name, int age, String dob, int id){
        this.name= name;
        this.age= age;
        this.dob= dob;
        this.id= id;  
    }
    //setter methods
    public void setDob(String dob){
        this.dob=dob;    
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setID(int id){
        this.id=id;
    } 
    public void setName(String name){
        this.name= name;
    }
   //getter methods  
    public String getDob(){
        return this.dob;
    }
    public String getName(){
        return this.name;
    }
    public String getUserName(){
        userName= this.name + this.id;
        return userName;
    }
    public int getAge(){
        return this.age;
    }
    public int getID(){
        return this.id;
    }
    
    @Override
   public String toString() {
        return ("\nStudentName:"+this.getName()+", Student No: "+ this.getID() +
                    ", Age: "+ this.getAge()+"\n");
                  
   }
    
}
